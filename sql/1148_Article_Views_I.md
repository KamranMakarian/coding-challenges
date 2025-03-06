# 1148. Article Views I

### Difficulty
**Easy**

---

## Problem Statement

Given a `Views` table, write a **SQL query** to find all the **authors** who viewed **at least one** of their **own articles**.

- Return the result table **sorted by `id` in ascending order**.

---

## Table Schema

### **Table: Views**
| Column Name | Type |
|-------------|------|
| `article_id` | `int` |
| `author_id`  | `int` |
| `viewer_id`  | `int` |
| `view_date`  | `date` |

- The table **may have duplicate rows**.
- Each row indicates that a **viewer** viewed an **article** (written by an **author**) on a **specific date**.
- **Note**: `author_id == viewer_id` indicates that the **author viewed their own article**.

---

## Example

### **Input**
#### **Views table:**
| article_id | author_id | viewer_id | view_date  |
|------------|------------|-----------|------------|
| 1          | 3          | 5         | 2019-08-01 |
| 1          | 3          | 6         | 2019-08-02 |
| 2          | 7          | 7         | 2019-08-01 |
| 2          | 7          | 6         | 2019-08-02 |
| 4          | 7          | 1         | 2019-07-22 |
| 3          | 4          | 4         | 2019-07-21 |
| 3          | 4          | 4         | 2019-07-21 |

---

### **Output**
| id   |
|------|
| 4    |
| 7    |

---

### **Explanation**
- **Author ID 4** viewed **their own article** (`viewer_id = 4` matches `author_id = 4`).
- **Author ID 7** viewed **their own article** (`viewer_id = 7` matches `author_id = 7`).
- The output is **sorted by ID in ascending order**.

---

## **Topics**
- SQL
- Filtering (`WHERE`)
- Sorting (`ORDER BY`)
- Data Selection (`SELECT DISTINCT`)
