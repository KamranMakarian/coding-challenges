-- Write your PostgreSQL query statement below
SELECT MAX(salary) AS SecondHighestSalary 
FROM employee 
WHERE salary < (
    SELECT MAX(salary) 
    FROM employee
    )
;

/*
Time Complexity:
SELECT MAX(salary) FROM employee → O(n) (scans all rows once to get the max salary).
WHERE salary < (SELECT MAX(salary) FROM employee) → O(n) (another scan to filter).
MAX(salary) → O(n) (finds the second-highest).
✅ Total Time Complexity: O(n)
(No sorting is needed, making this approach more efficient than the first one!)

Space Complexity:
We are not storing anything extra beyond a single value. 
✅ Total Space Complexity: O(1)
(No additional space is used apart from the result storage)


Alternative Solution:
SELECT 
    (SELECT DISTINCT salary 
     FROM employee 
     ORDER BY salary DESC 
     LIMIT 1 OFFSET 1) AS SecondHighestSalary;
;
Time Complexity:
DISTINCT salary → O(n log n) (sorting salaries to remove duplicates).
ORDER BY salary DESC → O(n log n) (sorting salaries in descending order).
LIMIT 1 OFFSET 1 → O(1) (fetching the second-highest salary).
✅ Total Time Complexity: O(n log n)
(Sorting dominates the complexity)

Space Complexity:
Sorting salaries requires O(n) additional space in most database engines.
The final result stores only one value → O(1).
✅ Total Space Complexity: O(n) (due to sorting)
*/ 