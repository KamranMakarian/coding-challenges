# 196. Delete Duplicate Emails

### Difficulty
**Easy**

---

## Problem Statement

Given a `Person` table, write a **SQL query** to **delete all duplicate emails**, keeping only **one unique email with the smallest `id`**.

- **For SQL users**: Write a `DELETE` statement, **not** a `SELECT` statement.
- **For Pandas users**: Modify the `Person` table **in place**.

**Note**:  
- The final order of the `Person` table **does not matter**.

---

## Table Schema

### **Table: Person**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `email`     | `varchar` |

- `id` is the **primary key** (column with unique values) for this table.
- Each row contains an **email address**.
- The **emails do not contain uppercase letters**.

---

## Example

### **Input**
#### **Person table:**
| id  | email             |
|-----|------------------|
| 1   | john@example.com |
| 2   | bob@example.com  |
| 3   | john@example.com |

---

### **Output**
| id  | email             |
|-----|------------------|
| 1   | john@example.com |
| 2   | bob@example.com  |

---

### **Explanation**
- The email `"john@example.com"` appears **twice** in the `Person` table.
- We **keep only the row with the smallest `id`** (`id = 1`) and **delete the duplicate** (`id = 3`).
- `"bob@example.com"` is unique, so it remains.

---

## **Constraints**
- The `email` column is **not NULL**.
- The `id` column contains unique values.

---
