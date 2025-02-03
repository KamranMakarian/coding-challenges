# 627. Swap Salary

### Difficulty
**Easy**

---

## Problem Statement

Given a `Salary` table, write a **single `UPDATE` statement** to swap all **'f' and 'm'** values in the `sex` column.  

- Change all `'f'` values to `'m'` and all `'m'` values to `'f'`.
- **Do not use any intermediate temporary tables**.
- **Do not write a `SELECT` statement**.

---

## Table Schema

### **Table: Salary**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `name`      | `varchar` |
| `sex`       | `ENUM('m', 'f')` |
| `salary`    | `int`   |

- `id` is the **primary key** (unique values) for this table.
- The `sex` column has only two possible values: `'m'` (male) and `'f'` (female).
- The table contains **employee information**, including their **salary**.

---

## Example

### **Input**
#### **Salary table:**
| id  | name  | sex | salary |
|-----|-------|-----|--------|
| 1   | A     | m   | 2500   |
| 2   | B     | f   | 1500   |
| 3   | C     | m   | 5500   |
| 4   | D     | f   | 500    |

---

### **Output**
| id  | name  | sex | salary |
|-----|-------|-----|--------|
| 1   | A     | f   | 2500   |
| 2   | B     | m   | 1500   |
| 3   | C     | f   | 5500   |
| 4   | D     | m   | 500    |

---

### **Explanation**
- `(1, A)` and `(3, C)` were changed from `'m'` to `'f'`.
- `(2, B)` and `(4, D)` were changed from `'f'` to `'m'`.

---
