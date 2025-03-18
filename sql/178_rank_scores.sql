-- Write your PostgreSQL query statement below
-- Write your PostgreSQL query statement below
SELECT 
    score, 
    DENSE_RANK() OVER (ORDER BY score DESC) AS rank
FROM scores
ORDER BY score DESC;

/*
Time & Space Complexity
✅ Time Complexity: O(n log n)

The ORDER BY operation dominates, requiring O(n log n).
DENSE_RANK() runs in O(n), making it efficient.
✅ Space Complexity: O(1)

Uses window functions, avoiding extra storage.

-- Alternative solution:

SELECT s1.score, 
       (SELECT COUNT(DISTINCT s2.score) 
        FROM scores s2 
        WHERE s2.score >= s1.score) AS rank
FROM scores s1
ORDER BY score DESC;

*/