# 181. Employees Earning More Than Their Managers

### Difficulty: 
**Easy**

---

## Problem Statement

Given an `Employee` table, write a query to **find employees who earn more than their managers**.

Return the result table in **any order**.

---

## Table Schema

### **Table: Employee**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `name`      | `varchar` |
| `salary`    | `int`   |
| `managerId` | `int`   |

- `id` is the **primary key** (column with unique values) for this table.
- Each row in this table represents an **employee**, including:
  - Their **ID** (`id`),
  - Their **name** (`name`),
  - Their **salary** (`salary`),
  - Their **manager's ID** (`managerId`).

---

## Example

### **Input**
#### **Employee table:**
| id  | name  | salary | managerId |
|-----|-------|--------|-----------|
| 1   | Joe   | 70000  | 3         |
| 2   | Henry | 80000  | 4         |
| 3   | Sam   | 60000  | `NULL`    |
| 4   | Max   | 90000  | `NULL`    |

---

### **Output**
| Employee |
|----------|
| Joe      |

---

### **Explanation**
- `Joe (id = 1)` has a salary of **70,000**, while his manager **Sam (id = 3)** has a salary of **60,000**. Since **Joe earns more than his manager**, he is included in the result.
- Other employees do not meet the condition.

