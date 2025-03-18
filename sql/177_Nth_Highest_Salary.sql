CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    -- Write your PostgreSQL query statement below.
    SELECT COALESCE(
      (SELECT DISTINCT e.salary
       FROM employee e
       ORDER BY e.salary DESC
       OFFSET N - 1
       LIMIT 1), NULL
    ) AS getNthHighestSalary
  );
END;
$$ LANGUAGE plpgsql;

/*
Time & Space Complexity
✅ Time Complexity: O(n log n)

ORDER BY salary DESC sorts the salaries (O(n log n)).
OFFSET N - 1 LIMIT 1 runs in O(N) worst case.
Overall, it’s O(n log n) due to sorting.
✅ Space Complexity: O(1)

The function does not use extra storage, so space complexity is constant.
*/
