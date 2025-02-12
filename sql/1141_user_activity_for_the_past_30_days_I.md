# 1141. User Activity for the Past 30 Days I

### Difficulty
**Easy**

---

## Problem Statement

Given an `Activity` table, write a **SQL query** to find the **daily active user count** for a period of **30 days ending on 2019-07-27** (inclusive).  

A **user was active** on a given day if they performed **at least one activity** on that day.

Return the result table in **any order**.

---

## Table Schema

### **Table: Activity**
| Column Name   | Type    |
|--------------|---------|
| `user_id`    | `int`   |
| `session_id` | `int`   |
| `activity_date` | `date` |
| `activity_type` | `enum('open_session', 'end_session', 'scroll_down', 'send_message')` |

- This table **may contain duplicate rows**.
- The `activity_type` column is an **ENUM** type that represents different user actions on the platform.
- Each **session belongs to exactly one user**.

---

## Example

### **Input**
#### **Activity table:**
| user_id | session_id | activity_date | activity_type  |
|---------|------------|---------------|---------------|
| 1       | 1          | 2019-07-20    | open_session  |
| 1       | 1          | 2019-07-20    | scroll_down   |
| 1       | 1          | 2019-07-20    | end_session   |
| 2       | 4          | 2019-07-20    | open_session  |
| 2       | 4          | 2019-07-21    | send_message  |
| 2       | 4          | 2019-07-21    | end_session   |
| 3       | 2          | 2019-07-21    | open_session  |
| 3       | 2          | 2019-07-21    | send_message  |
| 3       | 2          | 2019-07-21    | end_session   |
| 4       | 3          | 2019-06-25    | open_session  |
| 4       | 3          | 2019-06-25    | end_session   |

---

### **Output**
| day        | active_users |
|------------|--------------|
| 2019-07-20 | 2            |
| 2019-07-21 | 2            |

---

### **Explanation**
- We **do not** include days that have **zero active users**.
- On **2019-07-20**, there were **2** unique active users (`user_id = 1` and `user_id = 2`).
- On **2019-07-21**, there were **2** unique active users (`user_id = 2` and `user_id = 3`).

---
