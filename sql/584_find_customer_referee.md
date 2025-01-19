# 584. Find Customer Referee

### Difficulty
**Easy**

---

## Problem Statement

Given a `Customer` table, write a **SQL query** to find the names of customers who are **not referred** by the customer with `id = 2`.

Return the result table in **any order**.

---

## Table Schema

### **Table: Customer**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `name`      | `varchar` |
| `referee_id`| `int`   |

- `id` is the **primary key** column for this table.
- Each row represents:
  - A customer's **ID** (`id`),
  - Their **name** (`name`), and
  - The **ID of the customer who referred them** (`referee_id`).

---

## Example

### **Input**
#### **Customer table:**
| id  | name  | referee_id |
|-----|-------|------------|
| 1   | Will  | `null`     |
| 2   | Jane  | `null`     |
| 3   | Alex  | 2          |
| 4   | Bill  | `null`     |
| 5   | Zack  | 1          |
| 6   | Mark  | 2          |

---

### **Output**
| name  |
|-------|
| Will  |
| Jane  |
| Bill  |
| Zack  |

---

### **Explanation**
- Customers `Alex` and `Mark` are referred by `id = 2`, so they are excluded from the result.
- Customers `Will`, `Jane`, `Bill`, and `Zack` are **not referred by `id = 2`**, so they are included in the result.

---

## **Hints**
1. Be careful with `NULL` values when filtering the `referee_id` column.
2. Use a condition to exclude rows where `referee_id = 2`.

---
