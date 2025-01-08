-- Write your PostgreSQL query statement below
SELECT c.name AS Customers
FROM customers c
LEFT JOIN orders o ON c.id = o.customerId
WHERE o.customerId IS NULL;
-- Time Complexity: Minimum O(n + m), Maximum O(n x m).
-- Space Complexity: O(1) 

/*
-- Alternative but potentially less efficient solution for larger datasets:
SELECT name AS Customers
FROM customers
WHERE id NOT IN (
    SELECT customerID
    FROM orders
);
-- Time Complexity: Minimum O(n + m), Maximum O(n x m).
-- Space Complexity: O(m) for storing subquary results. 
*/