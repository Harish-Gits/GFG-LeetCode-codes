# Write your MySQL query statement below
SELECT a1.player_id,MIN(a1.event_date) AS first_login
FROM Activity a1 GROUP BY a1.player_id