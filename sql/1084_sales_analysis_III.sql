-- Write your PostgreSQL query statement below
SELECT p.product_id, p.product_name
FROM product p
JOIN sales s ON p.product_id = s.product_id
GROUP BY p.product_id, p.product_name
HAVING 
    MIN(s.sale_date) >= '2019-01-01' 
    AND MAX(s.sale_date) <= '2019-03-31';
/*
Complexity Analysis
Time Complexity:
JOIN: O(m + n) (assuming proper indexing)
GROUP BY: O(m + n)
Overall: O(m + n)
Space Complexity:
No extra data structures → O(1)
*/
