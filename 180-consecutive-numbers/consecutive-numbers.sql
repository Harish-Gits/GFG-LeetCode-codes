WITH ConsecutiveNums AS (
    SELECT num, 
           id,
           LAG(id, 1) OVER (ORDER BY id) AS prev_id,
           LAG(num, 1) OVER (ORDER BY id) AS prev_num,
           LAG(id, 2) OVER (ORDER BY id) AS prev_prev_id,
           LAG(num, 2) OVER (ORDER BY id) AS prev_prev_num
    FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM ConsecutiveNums
WHERE num = prev_num AND num = prev_prev_num
  AND id = prev_id + 1
  AND prev_id = prev_prev_id + 1;
