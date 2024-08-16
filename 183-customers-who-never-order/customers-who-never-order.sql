# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c LEFT JOIN Orders o 
ON c.id=o.customerId
GROUP BY c.id
HAVING COUNT(o.id) < 1;