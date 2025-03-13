# 176. Second Highest Salary

### Difficulty
**Medium**

---

## Problem Statement

Given an `Employee` table, write a **SQL query** to find the **second highest distinct salary**.  
If there is **no second highest salary**, return `null` (or `None` in Pandas).

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

#### **Output**
| SecondHighestSalary |
|---------------------|
| 200                 |

---

### **Example 2**
#### **Input**
#### **Employee table:**
| id  | salary |
|---- |--------|
| 1   | 100    |

#### **Output**
| SecondHighestSalary |
|---------------------|
| null                |

---

## **Topics**
- SQL
- Aggregation (`MAX`, `LIMIT`, `OFFSET`)
- Conditional Handling (`IFNULL`, `COALESCE`)
- Sorting (`ORDER BY`)
