-- Write your PostgreSQL query statement below
SELECT COALESCE(
    (SELECT num
     FROM mynumbers
     GROUP BY num
     HAVING COUNT(num) = 1
     ORDER BY num DESC
     LIMIT 1),
    NULL
) AS num;
