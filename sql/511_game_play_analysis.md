# 511. Game Play Analysis I

### Difficulty
**Easy**

---

## Problem Statement

Given an `Activity` table, write a **SQL query** to find the **first login date** for each player.

Return the result table in **any order**.

---

## Table Schema

### **Table: Activity**
| Column Name   | Type    |
|---------------|---------|
| `player_id`   | `int`   |
| `device_id`   | `int`   |
| `event_date`  | `date`  |
| `games_played`| `int`   |

- **Primary Key**: `(player_id, event_date)` (combination of columns with unique values).
- Each row represents:
  - A player who logged in and played a certain number of games (possibly `0`) on a specific date using a specific device.

---

## Example

### **Input**
#### **Activity table:**
| player_id | device_id | event_date | games_played |
|-----------|-----------|------------|--------------|
| 1         | 2         | 2016-03-01 | 5            |
| 1         | 2         | 2016-05-02 | 6            |
| 2         | 3         | 2017-06-25 | 1            |
| 3         | 1         | 2016-03-02 | 0            |
| 3         | 4         | 2018-07-03 | 5            |

---

### **Output**
| player_id | first_login |
|-----------|-------------|
| 1         | 2016-03-01  |
| 2         | 2017-06-25  |
| 3         | 2016-03-02  |

---

### **Explanation**
- For `player_id = 1`, the first login date is **2016-03-01**.
- For `player_id = 2`, the first login date is **2017-06-25**.
- For `player_id = 3`, the first login date is **2016-03-02**.

---

## **Constraints**
- Each `player_id` can appear in the table multiple times with different `event_date`.
- The `event_date` column contains **unique dates** for a given `player_id`.

---
