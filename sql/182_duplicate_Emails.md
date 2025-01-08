# 182. Duplicate Emails

### Difficulty
**Easy**

---

## Problem Statement

Given a `Person` table, write a **SQL query** to **report all duplicate emails**.

- It is **guaranteed** that the `email` field is **not NULL**.
- Return the result table in **any order**.

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
| id  | email    |
|-----|---------|
| 1   | a@b.com |
| 2   | c@d.com |
| 3   | a@b.com |

---

### **Output**
| Email   |
|---------|
| a@b.com |

---

### **Explanation**
- The email `"a@b.com"` appears **twice** in the `Person` table.
- Therefore, it is included in the result.

---

## **Constraints**
- The `email` column is **not NULL**.
- The **emails contain only lowercase letters**.

---

