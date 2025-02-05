# 1068. Product Sales Analysis I

### Difficulty
**Easy**

---

## Problem Statement

Given the `Sales` and `Product` tables, write a **SQL query** to report the `product_name`, `year`, and `price` for each `sale_id` in the `Sales` table.

Return the resulting table in **any order**.

---

## Table Schemas

### **Table: Sales**
| Column Name | Type  |
|-------------|-------|
| `sale_id`   | `int` |
| `product_id`| `int` |
| `year`      | `int` |
| `quantity`  | `int` |
| `price`     | `int` |

- (`sale_id`, `year`) is the **primary key** (unique combination).
- `product_id` is a **foreign key** referencing the `Product` table.
- Each row represents a **sale transaction** for a `product_id` in a given `year`.
- The `price` column represents the **unit price** of the product.

---

### **Table: Product**
| Column Name  | Type    |
|--------------|---------|
| `product_id` | `int`   |
| `product_name` | `varchar` |

- `product_id` is the **primary key** (unique values).
- Each row represents a **product name** associated with a specific `product_id`.

---

## Example

### **Input**
#### **Sales table:**
| sale_id | product_id | year | quantity | price |
|---------|------------|------|----------|-------|
| 1       | 100        | 2008 | 10       | 5000  |
| 2       | 100        | 2009 | 12       | 5000  |
| 7       | 200        | 2011 | 15       | 9000  |

#### **Product table:**
| product_id | product_name |
|------------|--------------|
| 100        | Nokia        |
| 200        | Apple        |
| 300        | Samsung      |

---

### **Output**
| product_name | year  | price |
|-------------|-------|-------|
| Nokia       | 2008  | 5000  |
| Nokia       | 2009  | 5000  |
| Apple       | 2011  | 9000  |

---

### **Explanation**
- From `sale_id = 1`, we see that **Nokia** was sold for **5000** in the year **2008**.
- From `sale_id = 2`, we see that **Nokia** was sold for **5000** in the year **2009**.
- From `sale_id = 7`, we see that **Apple** was sold for **9000** in the year **2011**.

---