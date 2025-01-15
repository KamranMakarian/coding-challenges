-- Write your PostgreSQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM activity
GROUP BY player_id
;
/*
Time & Space Complexity
Operation	Time Complexity	Space Complexity	Why?
GROUP BY	O(n log n)	O(k)	Groups n rows into k unique player_ids (k ≤ n).
MIN(event_date)	O(n)	O(1)	Scans each group to find the minimum date.
Total Complexity	O(n log n)	O(k)	Sorting dominates the complexity.
*/