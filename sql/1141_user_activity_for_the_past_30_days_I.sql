-- Write your PostgreSQL query statement below
SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date;
;
/*
Time Complexity:
O(n log n) → Due to GROUP BY + COUNT(DISTINCT user_id).
If activity_date is indexed, filtering with WHERE takes O(log n).

Space Complexity:
O(d) where d is the number of distinct days in the dataset.
*/
