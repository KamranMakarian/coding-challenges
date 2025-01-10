# 197. Rising Temperature

### Difficulty
**Easy**

---

## Problem Statement

Given a `Weather` table, write a **SQL query** to **find all dates' `id` where the temperature is higher than the previous day (yesterday's temperature)**.

Return the result table in **any order**.

---

## Table Schema

### **Table: Weather**
| Column Name  | Type    |
|-------------|---------|
| `id`        | `int`   |
| `recordDate`| `date`  |
| `temperature` | `int` |

- `id` is the **column with unique values** for this table.
- **No two rows have the same `recordDate`**.
- This table contains **temperature data** recorded on a certain day.

---

## Example

### **Input**
#### **Weather table:**
| id  | recordDate  | temperature |
|-----|------------|-------------|
| 1   | 2015-01-01 | 10          |
| 2   | 2015-01-02 | 25          |
| 3   | 2015-01-03 | 20          |
| 4   | 2015-01-04 | 30          |

---

### **Output**
| id  |
|-----|
| 2   |
| 4   |

---

### **Explanation**
- On **2015-01-02**, the temperature (`25°C`) was **higher** than on **2015-01-01** (`10°C`), so `id = 2` is included.
- On **2015-01-04**, the temperature (`30°C`) was **higher** than on **2015-01-03** (`20°C`), so `id = 4` is included.
- `id = 3` is **not included** because the temperature on **2015-01-03** (`20°C`) was **lower** than on **2015-01-02** (`25°C`).

---

## **Constraints**
- Each `recordDate` in the `Weather` table is **unique**.
- The `id` column contains unique values.

---
