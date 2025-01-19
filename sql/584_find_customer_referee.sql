-- Write your PostgreSQL query statement below

-- Solution:
SELECT name
FROM customer
WHERE referee_id != 2 OR referee_id IS NULL
;
-- Time Complexity: O(n)
-- Space Complexity: O(1)

-- Alternative Solution:
-- SELECT name
-- FROM customer
-- WHERE id NOT IN (
--     SELECT id
--     FROM customer
--     WHERE referee_id = 2
-- )
-- ;
-- Time Complexity: O(n × m)
-- Space Complexity: O(m)