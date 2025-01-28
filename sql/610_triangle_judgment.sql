-- Write your PostgreSQL query statement below
SELECT x, y, z,
       CASE
           WHEN x + y > z AND y + z > x AND z + x > y THEN 'Yes'
           ELSE 'No'
       END AS triangle
FROM triangle;

/*
Complexity Analysis
Time Complexity:
The query evaluates the conditions row by row, so the time complexity is O(n), where n is the number of rows in the triangle table.
Space Complexity:
The query does not require additional storage apart from the result table, so the space complexity is O(1).
*/