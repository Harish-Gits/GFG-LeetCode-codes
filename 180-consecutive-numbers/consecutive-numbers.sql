SELECT DISTINCT t1.num AS ConsecutiveNums
FROM logs t1
JOIN logs t2 ON t1.id = t2.id + 1
JOIN logs t3 ON t2.id = t3.id + 1
WHERE t1.num = t2.num AND t2.num = t3.num;
