# Write your MySQL query statement below
SELECT * FROM Cinema
WHERE id%2!=0 AND description!='Boring'
ORDER BY rating DESC