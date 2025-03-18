# 177. Nth Highest Salary

### Difficulty
**Medium**

---

## Problem Statement

Given an **Employee** table, write a **SQL query** to find the **nth highest salary**.

- If there is **no nth highest salary**, return `null`.

---

## Table Schema

### **Table: Employee**
| Column Name | Type |
|-------------|------|
| `id`        | `int` |
| `salary`    | `int` |

- `id` is the **primary key** (unique values).
- Each row contains information about an **employee's salary**.

---

## Examples

### **Example 1**
#### **Input**
#### **Employee table:**
| id  | salary |
|---- |--------|
| 1   | 100    |
| 2   | 200    |
| 3   | 300    |

#### **n = 2**

#### **Output**
| getNthHighestSalary(2) |
|------------------------|
| 200                    |

---

### **Example 2**
#### **Input**
#### **Employee table:**
| id  | salary |
|---- |--------|
| 1   | 100    |

#### **n = 2**

#### **Output**
| getNthHighestSalary(2) |
|------------------------|
| null                   |

---

## **Topics**
- SQL
- Sorting (`ORDER BY`)
- Ranking Functions (`LIMIT`, `OFFSET`)
- Handling NULL values (`IFNULL`, `COALESCE`)

---
---

# Additional Notes:

The **"(2)"** in the output column name comes from the way **SQL functions** are displayed when using a **table function** in `PostgreSQL`.  

#### **Why does `(2)` appear?**
When calling a function like:
```sql
SELECT * FROM NthHighestSalary(2);
```
PostgreSQL **automatically renames** the column based on the function name **with the argument passed (`N=2`)**.

#### **Breaking it Down**
- In our function:
  ```sql
  RETURNS TABLE (Salary INT)
  ```
  The column name should be `Salary` in the output.
- However, PostgreSQL **overrides it** when calling a function in a `SELECT` query.
- The resulting **column name format** is:
  ```
  function_name(argument_passed)
  ```
  So, for `NthHighestSalary(2)`, the column name appears as:
  ```
  getNthHighestSalary(2)
  ```
  Instead of just `"Salary"`.

---

#### **How to Rename the Column in the Output?**
If you want to remove `(2)` and show a fixed column name, you can **explicitly rename the column** in your query:
```sql
SELECT NthHighestSalary(2) AS SecondHighestSalary;
```
This will output:
```
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
```
This ensures that the column **always has a readable name**, regardless of the argument passed.

---

### **Summary**
✅ PostgreSQL **automatically appends the function argument (`(2)`)** in table function calls.  
✅ To **rename the output column**, use `AS` in your `SELECT` query.  
✅ This behavior **does not affect the function logic**, just the **output display**.  


