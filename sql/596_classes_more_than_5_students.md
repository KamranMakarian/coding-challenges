# 596. Classes More Than 5 Students

### Difficulty
**Easy**

---

## Problem Statement

Given a `Courses` table, write a **SQL query** to find all the classes that have **at least five students**.

Return the result table in **any order**.

---

## Table Schema

### **Table: Courses**
| Column Name | Type    |
|-------------|---------|
| `student`   | `varchar` |
| `class`     | `varchar` |

- (`student`, `class`) is the **primary key** (unique combination of columns).
- Each row represents:
  - The **name of a student** (`student`), and
  - The **class** (`class`) in which they are enrolled.

---

## Example

### **Input**
#### **Courses table:**
| student | class     |
|---------|-----------|
| A       | Math      |
| B       | English   |
| C       | Math      |
| D       | Biology   |
| E       | Math      |
| F       | Computer  |
| G       | Math      |
| H       | Math      |
| I       | Math      |

---

### **Output**
| class   |
|---------|
| Math    |

---

### **Explanation**
- **Math** has 6 students, so it is included in the output.
- **English**, **Biology**, and **Computer** each have only 1 student, so they are not included.

---

## **Constraints**
- Each `student` is enrolled in exactly one `class`.

---