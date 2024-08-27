WITH fct AS
(SELECT requester_id AS u_id,accepter_id AS f_id FROM RequestAccepted
UNION
SELECT accepter_id AS u_id,requester_id AS f_id FROM RequestAccepted),
tft AS
(SELECT u_id,COUNT(DISTINCT f_id) AS tf FROM fct GROUP BY u_id)

SELECT u_id AS id,tf AS num FROM tft ORDER BY tf DESC LIMIT 1;

