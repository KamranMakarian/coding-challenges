# 1075. Project Employees I

### Difficulty
**Easy**

---

## Problem Statement

Given the `Project` and `Employee` tables, write an **SQL query** that reports the **average experience years** of all employees for each project, **rounded to 2 decimal places**.

Return the result table in **any order**.

---

## Table Schemas

### **Table: Project**
| Column Name  | Type  |
|-------------|-------|
| `project_id` | `int` |
| `employee_id` | `int` |

- (`project_id`, `employee_id`) is the **primary key** (unique combination).
- `employee_id` is a **foreign key** referencing the `Employee` table.
- Each row indicates that an **employee** is working on a specific **project**.

---

### **Table: Employee**
| Column Name      | Type    |
|------------------|---------|
| `employee_id`    | `int`   |
| `name`           | `varchar` |
| `experience_years` | `int` |

- `employee_id` is the **primary key** (unique values).
- Each row contains information about **one employee**.
- `experience_years` is **guaranteed to be NOT NULL**.

---

## Example

### **Input**
#### **Project table:**
| project_id | employee_id |
|------------|------------|
| 1          | 1          |
| 1          | 2          |
| 1          | 3          |
| 2          | 1          |
| 2          | 4          |

#### **Employee table:**
| employee_id | name   | experience_years |
|------------|--------|------------------|
| 1          | Khaled | 3                |
| 2          | Ali    | 2                |
| 3          | John   | 1                |
| 4          | Doe    | 2                |

---

### **Output**
| project_id | average_years |
|------------|--------------|
| 1          | 2.00         |
| 2          | 2.50         |

---

### **Explanation**
- The **average experience years** for **project 1**:
  - Employees: `{1, 2, 3}`
  - Experience: `(3 + 2 + 1) / 3 = 2.00`
- The **average experience years** for **project 2**:
  - Employees: `{1, 4}`
  - Experience: `(3 + 2) / 2 = 2.50`

---

## **Topics**
- SQL
- Aggregation (`AVG`)
- Grouping (`GROUP BY`)
- Rounding (`ROUND`)
