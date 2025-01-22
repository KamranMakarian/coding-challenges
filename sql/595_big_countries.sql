-- Write your PostgreSQL query statement below
SELECT name, population, area
FROM world
WHERE area >= 3000000
OR population >= 25000000
;

/*
Complexity Analysis
1️) Time Complexity
Table Scan (WHERE Clause):
Scans all rows in the world table to evaluate the conditions.
Complexity: O(n), where n is the number of rows in the world table.
2️) Space Complexity
No intermediate data structures are created.
Space Complexity: O(1).
*/