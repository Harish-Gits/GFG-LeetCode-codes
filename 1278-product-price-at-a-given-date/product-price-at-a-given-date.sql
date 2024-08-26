# Write your MySQL query statement below
WITH PriceBeforeDate AS (
    SELECT product_id, new_price, change_date
    FROM Products
    WHERE change_date <= '2019-08-16'
),
LatestPrice AS (
    SELECT product_id, new_price, ROW_NUMBER() OVER (PARTITION BY product_id ORDER BY change_date DESC) AS rn
    FROM PriceBeforeDate
)
SELECT p.product_id, 
       COALESCE(MAX(lp.new_price), 10) AS price
FROM (SELECT DISTINCT product_id FROM Products) p
LEFT JOIN LatestPrice lp
ON p.product_id = lp.product_id AND lp.rn = 1
GROUP BY p.product_id;

