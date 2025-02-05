-- Write your PostgreSQL query statement below
SELECT p.product_name, s.year, s.price 
FROM sales s
JOIN product p ON s.product_id = p.product_id
;
/*
Time Complexity:
O(n log n) (if there is an index on product_id)
The JOIN operation typically involves sorting or hashing, leading to O(n log n) complexity in most implementations.
If product_id is indexed, it can improve to O(n).
Space Complexity:
O(1) (No additional data structures are used, only the result set is stored).
*/