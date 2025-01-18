# 577. Employee Bonus

### Difficulty
**Easy**

---

## Problem Statement

Given the `Employee` and `Bonus` tables, write a **SQL query** to report the **name** and **bonus amount** of each employee whose bonus is **less than 1000**.

- If an `Employee` does not have a record in the `Bonus` table, their bonus is considered `null`, which is treated as less than 1000.

Return the result table in **any order**.

---

## Table Schema

### **Table: Employee**
| Column Name | Type    |
|-------------|---------|
| `empId`     | `int`   |
| `name`      | `varchar` |
| `supervisor`| `int`   |
| `salary`    | `int`   |

- `empId` is the **column with unique values** for this table.
- Each row represents:
  - An **employee's ID** (`empId`),
  - Their **name** (`name`),
  - Their **supervisor's ID** (`supervisor`), and
  - Their **salary** (`salary`).

---

### **Table: Bonus**
| Column Name | Type |
|-------------|------|
| `empId`     | `int` |
| `bonus`     | `int` |

- `empId` is the **column with unique values** for this table.
- `empId` is a **foreign key** referencing the `empId` in the `Employee` table.
- Each row contains:
  - An **employee's ID** (`empId`),
  - Their **bonus amount** (`bonus`).

---

## Example

### **Input**
#### **Employee table:**
| empId | name   | supervisor | salary |
|-------|--------|------------|--------|
| 3     | Brad   | `null`     | 4000   |
| 1     | John   | 3          | 1000   |
| 2     | Dan    | 3          | 2000   |
| 4     | Thomas | 3          | 4000   |

#### **Bonus table:**
| empId | bonus |
|-------|-------|
| 2     | 500   |
| 4     | 2000  |

---

### **Output**
| name   | bonus |
|--------|-------|
| Brad   | `null` |
| John   | `null` |
| Dan    | 500   |

---

### **Explanation**
- **Brad** and **John** have no entry in the `Bonus` table, so their bonus is `null`.  
  Since `null` is treated as less than 1000, they are included in the result.
- **Dan** has a bonus of `500`, which is less than 1000, so he is included.
- **Thomas** has a bonus of `2000`, which is greater than 1000, so he is excluded.

---

## **Hints**
1. If the `empId` in the `Employee` table has **no match** in the `Bonus` table, the bonus is considered `null`, and `null` is treated as less than 1000.
2. Use an **outer join** (e.g., `LEFT JOIN`) to handle employees without a record in the `Bonus` table.

---

