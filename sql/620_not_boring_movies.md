# 620. Not Boring Movies

### Difficulty
**Easy**

---

## Problem Statement

Given a `Cinema` table, write a **SQL query** to find **movies** that satisfy the following conditions:
1. The `id` is **odd-numbered**.
2. The `description` is **not** `"boring"`.

Return the result table **ordered by rating in descending order**.

---

## Table Schema

### **Table: Cinema**
| Column Name  | Type     |
|-------------|----------|
| `id`        | `int`    |
| `movie`     | `varchar` |
| `description` | `varchar` |
| `rating`    | `float`  |

- `id` is the **primary key** (unique values) for this table.
- Each row contains:
  - The **name** of a movie (`movie`),
  - Its **description** (`description`),
  - Its **rating** (`rating`), which is a **floating-point number with two decimal places** in the range `[0, 10]`.

---

## Example

### **Input**
#### **Cinema table:**
| id  | movie      | description | rating |
|-----|-----------|-------------|--------|
| 1   | War       | great 3D    | 8.9    |
| 2   | Science   | fiction     | 8.5    |
| 3   | irish     | boring      | 6.2    |
| 4   | Ice song  | Fantacy     | 8.6    |
| 5   | House card| Interesting | 9.1    |

---

### **Output**
| id  | movie      | description | rating |
|-----|-----------|-------------|--------|
| 5   | House card| Interesting | 9.1    |
| 1   | War       | great 3D    | 8.9    |

---

### **Explanation**
- The movies with **odd-numbered IDs** are: `{1, 3, 5}`.
- The movie with **ID = 3** has the description `"boring"`, so it is **excluded**.
- The remaining movies `{1, 5}` are included and sorted by **rating in descending order**.

---