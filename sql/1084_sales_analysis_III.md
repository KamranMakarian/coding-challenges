# 1084. Sales Analysis III

### Difficulty
**Easy**

---

## Problem Statement

Given the `Product` and `Sales` tables, write an **SQL query** to report the **products that were only sold in the first quarter of 2019**.  
That is, between **2019-01-01** and **2019-03-31** (inclusive).

Return the result table in **any order**.

---

## Table Schemas

### **Table: Product**
| Column Name  | Type    |
|-------------|---------|
| `product_id` | `int`   |
| `product_name` | `varchar` |
| `unit_price` | `int`   |

- `product_id` is the **primary key** (unique values).
- Each row represents:
  - A **product ID**, 
  - Its **name**, and 
  - Its **unit price**.

---

### **Table: Sales**
| Column Name  | Type  |
|-------------|-------|
| `seller_id`  | `int` |
| `product_id` | `int` |
| `buyer_id`   | `int` |
| `sale_date`  | `date` |
| `quantity`   | `int` |
| `price`      | `int` |

- This table **can contain duplicate rows**.
- `product_id` is a **foreign key** referencing the `Product` table.
- Each row represents:
  - A **sale transaction**, including:
    - **Seller ID**, **buyer ID**, and **product ID**.
    - The **date of sale** (`sale_date`).
    - The **quantity** sold and **price**.

---

## Example

### **Input**
#### **Product table:**
| product_id | product_name | unit_price |
|------------|-------------|------------|
| 1          | S8          | 1000       |
| 2          | G4          | 800        |
| 3          | iPhone      | 1400       |

#### **Sales table:**
| seller_id | product_id | buyer_id | sale_date  | quantity | price |
|-----------|------------|----------|------------|----------|-------|
| 1         | 1          | 1        | 2019-01-21 | 2        | 2000  |
| 1         | 2          | 2        | 2019-02-17 | 1        | 800   |
| 2         | 2          | 3        | 2019-06-02 | 1        | 800   |
| 3         | 3          | 4        | 2019-05-13 | 2        | 2800  |

---

### **Output**
| product_id | product_name |
|------------|--------------|
| 1          | S8           |

---

### **Explanation**
- **Product 1** (`S8`) was **only** sold in **Q1 of 2019** (`2019-01-21`), so it is included.
- **Product 2** (`G4`) was **sold in Q1 of 2019**, but was **also sold after Q1 (2019-06-02)**, so it is **not included**.
- **Product 3** (`iPhone`) was **sold only after Q1 (2019-05-13)**, so it is **not included**.

---
