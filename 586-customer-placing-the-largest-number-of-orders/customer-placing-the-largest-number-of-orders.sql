# Write your MySQL query statement below
WITH CTE AS (
SELECT COUNT(order_number) AS no,customer_number FROM Orders
GROUP BY customer_number
ORDER BY no DESC
LIMIT 1)
SELECT customer_number FROM CTE



