-- Write your PostgreSQL query statement below
SELECT s.name 
FROM salesperson s
LEFT JOIN (
    SELECT DISTINCT s.sales_id
    FROM salesperson s 
    JOIN orders o ON s.sales_id = o.sales_id
    JOIN company c ON o.com_id = c.com_id
    WHERE c.name = 'RED'
) red_sales ON s.sales_id = red_sales.sales_id
WHERE red_sales.sales_id IS NULL;


-- Alternative Solution: 
/*
SELECT s.name 
FROM salesperson s
WHERE s.name NOT IN (SELECT s.name
FROM salesperson s 
JOIN orders o ON s.sales_id = o.sales_id
JOIN company c ON o.com_id = c.com_id
WHERE c.name LIKE 'RED')
;
*/

/*
Comparison of Complexity
Aspect	NOT IN Solution	LEFT JOIN Solution
Inner Query Time	O(m × k)	O(m × k)
Outer Query Time	O(n × q)	O(n)
Total Time	O(m × k + n × q)	O(m × k + n)
Space Complexity	O(q)	O(q)
Efficiency	Slower for larger datasets	Faster and more scalable
Handling NULL	May cause issues if NULL exists	Handles NULL safely
*/
