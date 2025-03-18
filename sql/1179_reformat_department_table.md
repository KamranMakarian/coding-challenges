# 1179. Reformat Department Table

### Difficulty
**Easy**

---

## Problem Statement

Given a **Department** table, write a **SQL query** to **reformat** the table such that:
- There is **one column for department `id`**.
- Each **month** has its **own revenue column**.

The **month** values are from the set:
```plaintext
["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
```

- **Return the result table in any order**.

---

## Table Schema

### **Table: Department**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `revenue`   | `int`   |
| `month`     | `varchar` |

- **Primary Key:** `(id, month)`
- The table **stores revenue data per department per month**.

---

## Example

### **Input**
#### **Department table:**
| id  | revenue | month |
|---- |--------|-------|
| 1   | 8000   | Jan   |
| 2   | 9000   | Jan   |
| 3   | 10000  | Feb   |
| 1   | 7000   | Feb   |
| 1   | 6000   | Mar   |

---

### **Output**
| id  | Jan_Revenue | Feb_Revenue | Mar_Revenue | ... | Dec_Revenue |
|---- |------------|------------|------------|-----|------------|
| 1   | 8000       | 7000       | 6000       | ... | null       |
| 2   | 9000       | null       | null       | ... | null       |
| 3   | null       | 10000      | null       | ... | null       |

---

### **Explanation**
- The revenue **from April to December** is `null`, since no data is available for those months.
- The **result table has 13 columns**:
  - `1` column for **department id**.
  - `12` columns for **each month’s revenue**.

---

## **Topics**
- SQL
- Pivot Tables (`CASE WHEN`, `GROUP BY`)
- Data Transformation (`PIVOT`)