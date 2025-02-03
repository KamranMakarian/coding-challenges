-- Write your PostgreSQL query statement below
UPDATE salary 
SET sex = CASE
            WHEN sex = 'm' THEN 'f'
            WHEN sex = 'f' THEN 'm'
        END
;
/*
Time Complexity: O(n)
The UPDATE statement scans all rows in the salary table, so it has O(n) complexity, where n is the number of rows.
Why?
The CASE condition is applied individually to each row.
There are no JOIN operations or additional filtering.
If there is an index on sex, it won't help since the entire column needs to be updated.
Worst-case scenario:
If the table contains millions of rows, the update still takes O(n) time.

Space Complexity: O(1)
The query modifies data in place and does not create new tables or additional storage.
The CASE statement only changes values and does not allocate extra memory, so space complexity is O(1).
Exception:
If the database logs every change (to maintain rollback features), there might be a temporary storage overhead.
But the SQL operation itself is O(1) space-wise.
*/