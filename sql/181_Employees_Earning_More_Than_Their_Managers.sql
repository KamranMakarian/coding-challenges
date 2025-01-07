-- Write your PostgreSQL query statement below
SELECT emp.name AS Employee
FROM Employee emp
INNER JOIN Employee mgr ON emp.managerId = mgr.id
WHERE emp.salary > mgr.salary;