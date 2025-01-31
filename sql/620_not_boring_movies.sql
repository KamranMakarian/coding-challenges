-- Write your PostgreSQL query statement below
SELECT *
FROM cinema
WHERE id % 2 > 0
AND description NOT LIKE 'boring%'
ORDER BY rating DESC
;
/*
Time and Space Complexity
Operation	Time Complexity
Filtering (WHERE id % 2 = 1)	O(n)
Filtering (AND description != 'boring')	O(n)
Sorting (ORDER BY rating DESC)	O(n log n)
Total Complexity	O(n log n)
Space Complexity: O(1) since we perform operations directly in SQL without extra storage.

Alternative Solution:
SELECT * 
FROM cinema
WHERE id % 2 = 1  -- Ensures ID is odd
AND description != 'boring'  -- Excludes boring movies
ORDER BY rating DESC;  -- Sort by rating (highest first)
*/