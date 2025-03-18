# 178. Rank Scores

### Difficulty
**Medium**

---

## Problem Statement

Given a **Scores** table, write a **SQL query** to **rank the scores**.  

The ranking should be calculated according to the following rules:
1. The scores should be ranked **from highest to lowest**.
2. If there is a **tie** between two scores, both should have the **same ranking**.
3. After a tie, the **next ranking number** should be the **next consecutive integer** (i.e., **no gaps between ranks**).
4. Return the result table **ordered by score in descending order**.

---

## Table Schema

### **Table: Scores**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`     |
| `score`     | `decimal` |

- `id` is the **primary key** (unique values).
- Each row contains the **score of a game**.
- `score` is a **floating point value with two decimal places**.

---

## Example

### **Input**
#### **Scores table:**
| id  | score |
|---- |-------|
| 1   | 3.50  |
| 2   | 3.65  |
| 3   | 4.00  |
| 4   | 3.85  |
| 5   | 4.00  |
| 6   | 3.65  |

---

### **Output**
| score | rank |
|-------|------|
| 4.00  | 1    |
| 4.00  | 1    |
| 3.85  | 2    |
| 3.65  | 3    |
| 3.65  | 3    |
| 3.50  | 4    |

---

### **Explanation**
- The **highest score (4.00)** appears **twice** → both get **rank 1**.
- The next highest **(3.85)** gets **rank 2**.
- The next **(3.65)** appears **twice**, so both get **rank 3**.
- The last **(3.50)** gets **rank 4**.

---

## **Topics**
- SQL
- Ranking Functions (`DENSE_RANK()`, `RANK()`)
- Sorting (`ORDER BY`)
