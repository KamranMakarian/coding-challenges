-- Write your PostgreSQL query statement below
SELECT class
FROM courses
GROUP BY class
HAVING COUNT(student) > 4
;
/*
Complexity Analysis
1️) Time Complexity
Grouping and Counting:
The GROUP BY operation involves scanning all rows in the table and grouping them by class.
For n rows and k unique classes, this is O(n) for grouping and counting.
Filtering with HAVING Clause:
The HAVING clause processes the aggregated results, which is O(k), where k is the number of unique classes.
Total Time Complexity: O(n).

2️) Space Complexity
Temporary space is required for grouping and storing aggregated results (i.e., class counts).
This requires O(k) space, where k is the number of unique classes.
Total Space Complexity: O(k).
*/