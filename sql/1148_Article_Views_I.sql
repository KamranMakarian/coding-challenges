-- Write your PostgreSQL query statement below
SELECT DISTINCT author_id as id
FROM views
WHERE author_id = viewer_id
;
/*
Time and Space Complexity:
Time Complexity: O(n log n)
O(n) to filter rows with author_id = viewer_id.
O(n log n) to sort the distinct values.
Space Complexity: O(n)
O(n) space for storing distinct author_ids.
*/