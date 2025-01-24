# 607. Sales Person

### Difficulty
**Easy**

---

## Problem Statement

Given the `SalesPerson`, `Company`, and `Orders` tables, write a **SQL query** to find the **names of all the salespersons** who did **not have any orders** related to the company with the name `"RED"`.

Return the result table in **any order**.

---

## Table Schemas

### **Table: SalesPerson**
| Column Name       | Type    |
|-------------------|---------|
| `sales_id`        | `int`   |
| `name`            | `varchar` |
| `salary`          | `int`   |
| `commission_rate` | `int`   |
| `hire_date`       | `date`  |

- `sales_id` is the **primary key** (unique values) for this table.
- Each row represents:
  - The **ID** (`sales_id`) of a salesperson,
  - Their **name**, **salary**, **commission rate**, and **hire date**.

---

### **Table: Company**
| Column Name | Type    |
|-------------|---------|
| `com_id`    | `int`   |
| `name`      | `varchar` |
| `city`      | `varchar` |

- `com_id` is the **primary key** (unique values) for this table.
- Each row represents:
  - The **ID** (`com_id`) of a company,
  - The **name** and **city** of the company.

---

### **Table: Orders**
| Column Name  | Type |
|--------------|------|
| `order_id`   | `int` |
| `order_date` | `date` |
| `com_id`     | `int` |
| `sales_id`   | `int` |
| `amount`     | `int` |

- `order_id` is the **primary key** (unique values) for this table.
- `com_id` is a **foreign key** referencing `com_id` in the `Company` table.
- `sales_id` is a **foreign key** referencing `sales_id` in the `SalesPerson` table.
- Each row contains information about:
  - An **order** (its ID and date),
  - The **company** and **salesperson** involved, and
  - The **amount** paid.

---

## Example

### **Input**
#### **SalesPerson table:**
| sales_id | name  | salary  | commission_rate | hire_date  |
|----------|-------|---------|-----------------|------------|
| 1        | John  | 100000  | 6               | 4/1/2006   |
| 2        | Amy   | 12000   | 5               | 5/1/2010   |
| 3        | Mark  | 65000   | 12              | 12/25/2008 |
| 4        | Pam   | 25000   | 25              | 1/1/2005   |
| 5        | Alex  | 5000    | 10              | 2/3/2007   |

#### **Company table:**
| com_id | name   | city     |
|--------|--------|----------|
| 1      | RED    | Boston   |
| 2      | ORANGE | New York |
| 3      | YELLOW | Boston   |
| 4      | GREEN  | Austin   |

#### **Orders table:**
| order_id | order_date | com_id | sales_id | amount |
|----------|------------|--------|----------|--------|
| 1        | 1/1/2014   | 3      | 4        | 10000  |
| 2        | 2/1/2014   | 4      | 5        | 5000   |
| 3        | 3/1/2014   | 1      | 1        | 50000  |
| 4        | 4/1/2014   | 1      | 4        | 25000  |

---

### **Output**
| name  |
|-------|
| Amy   |
| Mark  |
| Alex  |

---

### **Explanation**
- From `Orders` table, we see that:
  - **John** and **Pam** are the only salespersons who have orders for company `"RED"` (`com_id = 1`).
- Therefore, salespersons **Amy**, **Mark**, and **Alex** are not associated with any orders for `"RED"` and are included in the result.

---

## **Hints**
1. First, find the salespersons who sold to the company `"RED"`.
2. Then, filter out these salespersons from the `SalesPerson` table to get the desired result.

---