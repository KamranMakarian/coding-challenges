# 610. Triangle Judgement

### Difficulty
**Easy**

---

## Problem Statement

Given a `Triangle` table, write a **SQL query** to determine if three line segments can form a triangle.

For a triangle to be valid, the following conditions must hold:
1. The sum of any two sides must be greater than the third side:
   - `x + y > z`
   - `x + z > y`
   - `y + z > x`

Return a result table that includes:
- The columns `x`, `y`, and `z` (representing the three side lengths),
- A column `triangle` that is `"Yes"` if the sides can form a triangle and `"No"` otherwise.

Return the result table in **any order**.

---

## Table Schema

### **Table: Triangle**
| Column Name | Type |
|-------------|------|
| `x`         | `int` |
| `y`         | `int` |
| `z`         | `int` |

- `(x, y, z)` is the **primary key** for this table.
- Each row represents:
  - The lengths of three line segments (`x`, `y`, `z`).

---

## Example

### **Input**
#### **Triangle table:**
| x   | y   | z   |
|-----|-----|-----|
| 13  | 15  | 30  |
| 10  | 20  | 15  |

---

### **Output**
| x   | y   | z   | triangle |
|-----|-----|-----|----------|
| 13  | 15  | 30  | No       |
| 10  | 20  | 15  | Yes      |

---

### **Explanation**
1. For the first row:
   - `x = 13`, `y = 15`, `z = 30`.
   - Since `13 + 15 = 28` (not greater than `30`), the sides **cannot** form a triangle, so the result is `"No"`.
2. For the second row:
   - `x = 10`, `y = 20`, `z = 15`.
   - Since `10 + 20 > 15`, `10 + 15 > 20`, and `20 + 15 > 10`, the sides **can** form a triangle, so the result is `"Yes"`.

---
