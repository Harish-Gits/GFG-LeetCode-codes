# Write your MySQL query statement below
SELECT m.employee_id,m.name,COUNT(e.employee_id) AS reports_count,ROUND(AVG(e.age)) AS average_age
FROM Employees m JOIN Employees e ON m.employee_id=e.reports_to
GROUP BY employee_id
ORDER BY employee_id