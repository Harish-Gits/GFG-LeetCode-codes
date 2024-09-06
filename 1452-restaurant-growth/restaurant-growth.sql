WITH DailySums AS (
    SELECT
        visited_on,
        SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
),
WindowedSums AS (
    SELECT
        visited_on,
        SUM(daily_amount) OVER(ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS total_amount,
        COUNT(daily_amount) OVER(ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS num_days
    FROM DailySums
)
SELECT
    visited_on,
    total_amount AS amount,
    ROUND(total_amount / num_days, 2) AS average_amount
FROM WindowedSums
WHERE visited_on >= (SELECT MIN(visited_on) + INTERVAL 6 DAY FROM Customer)
ORDER BY visited_on;
