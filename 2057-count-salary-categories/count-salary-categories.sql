# Write your MySQL query statement below
WITH CA AS (
SELECT 
    CASE 
    WHEN income<20000 THEN 'Low Salary'
    WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
    ELSE 'High Salary'
    END 
    AS Category FROM Accounts),
AC AS 
(SELECT 'Low Salary' AS Category
UNION ALL
SELECT 'Average Salary' AS Category
UNION ALL
SELECT 'High Salary' AS Category)

SELECT ac.category,COALESCE(COUNT(ca.category),0) as accounts_count
FROM AC ac LEFT JOIN CA ca ON ac.category=ca.category
GROUP BY ca.category
ORDER BY accounts_count;


