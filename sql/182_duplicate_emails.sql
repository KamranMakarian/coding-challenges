-- Write your PostgreSQL query statement below
SELECT email
FROM person
GROUP BY email
HAVING COUNT(*) > 1;

-- Time Complexity: O(n) -> We scan all rows once and group them.
-- Space Complexity: O(1) -> We only aggregate counts, thus, no extra storage is needed apart from result rows.