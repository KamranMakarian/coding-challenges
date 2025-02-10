-- Write your PostgreSQL query statement below
SELECT p.project_id, ROUND(AVG(e.experience_years),2) AS average_years
FROM employee e
JOIN project p ON e.employee_id = p.employee_id
GROUP BY project_id
--ORDER BY project_id
;
/*
Correct Time Complexity
JOIN Operation:
The INNER JOIN on employee_id runs in O(n log n) or O(n) depending on indexing.
If employee_id is indexed, then it runs in O(n).
GROUP BY & Aggregation:
Sorting-based aggregation is O(n log n).
Hash-based aggregation is O(n) (if hashing is used).
✅ Final Complexity:
🔹 Best case (Indexed): O(n)
🔹 Worst case (Sorting needed): O(n log n)

Space Complexity
Since we're only storing one aggregated row per project_id, the space complexity is O(p), where p is the number of projects.
Your estimate of O(n) is too high because n is the number of employees, not projects.
✅ Final Space Complexity: O(p)
*/