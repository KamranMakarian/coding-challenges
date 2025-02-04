# 1050. Actors and Directors Who Cooperated At Least Three Times

### Difficulty
**Easy**

---

## Problem Statement

Given an `ActorDirector` table, write a **SQL query** to find all the pairs `(actor_id, director_id)` where the **actor has cooperated with the director at least three times**.

Return the result table in **any order**.

---

## Table Schema

### **Table: ActorDirector**
| Column Name  | Type  |
|-------------|-------|
| `actor_id`  | `int` |
| `director_id` | `int` |
| `timestamp` | `int` |

- `timestamp` is the **primary key** (unique values).
- Each row represents a **collaboration** between an **actor** and a **director** at a specific point in time.

---

## Example

### **Input**
#### **ActorDirector table:**
| actor_id | director_id | timestamp |
|----------|------------|-----------|
| 1        | 1          | 0         |
| 1        | 1          | 1         |
| 1        | 1          | 2         |
| 1        | 2          | 3         |
| 1        | 2          | 4         |
| 2        | 1          | 5         |
| 2        | 1          | 6         |

---

### **Output**
| actor_id | director_id |
|----------|------------|
| 1        | 1          |

---

### **Explanation**
- The pair **(1, 1)** appears **three times**, so it is included in the output.
- The pair **(1, 2)** appears **twice**, so it is **not included**.
- The pair **(2, 1)** appears **twice**, so it is **not included**.

---
