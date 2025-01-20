-- Write your PostgreSQL query statement below

Solution:
SELECT customer_number
FROM orders 
GROUP BY customer_number
ORDER BY COUNT(order_number) DESC
LIMIT 1
;

-- Time Complexity: O(n + m log m)
-- Space Complexity: O(m)

-- Follow-up Question:
-- SELECT customer_number
-- FROM orders
-- GROUP BY customer_number
-- HAVING COUNT(order_number) = (
--     SELECT COUNT(order_number)
--     FROM orders
--     GROUP BY customer_number
--     ORDER BY COUNT(order_number) DESC
--     LIMIT 1
-- )
-- ;

-- Alternative Solution:
-- SELECT customer_number
-- FROM orders
-- GROUP BY customer_number
-- HAVING COUNT(order_number) = (
--     SELECT MAX(order_count)
--     FROM (
--         SELECT COUNT(order_number) AS order_count
--         FROM orders
--         GROUP BY customer_number
--     ) subquery
-- )
-- ;
