-- Write your PostgreSQL query statement below
-- Solution 1
SELECT e.name, b.bonus
FROM bonus b
FULL OUTER JOIN employee e ON e.empID = b.empID
WHERE b.bonus < 1000 OR b.bonus IS NULL
; 

-- Solution 2
SELECT e.name, b.bonus
FROM employee e
LEFT JOIN bonus b ON b.empID = e.empID
WHERE b.bonus < 1000 OR b.bonus IS NULL
;

-- Comparison of Time and Space Complexity
-- Aspect	Query 1: FULL OUTER JOIN	Query 2: LEFT JOIN	Better Option
-- Time Complexity	O(n + m + p)	O(n + m)	 Query 2
-- Space Complexity	O(n + m)	O(n)	 Query 2
