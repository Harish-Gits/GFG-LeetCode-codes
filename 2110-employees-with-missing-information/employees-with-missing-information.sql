# Write your MySQL query statement below

SELECT employee_id FROM Employees WHERE employee_id
NOT IN (SELECT e.employee_id AS emp_id FROM Employees e JOIN Salaries S USING (employee_id))
UNION
SELECT employee_id FROM Salaries WHERE employee_id
NOT IN (SELECT e.employee_id AS emp_id FROM Employees e JOIN Salaries S USING (employee_id))
ORDER BY employee_id