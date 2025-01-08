# 183. Customers Who Never Order

### Difficulty
**Easy**

---

## Problem Statement

Given the `Customers` and `Orders` tables, write a **SQL query** to **find all customers who have never placed an order**.

Return the result table in **any order**.

---

## Table Schema

### **Table: Customers**
| Column Name | Type    |
|-------------|---------|
| `id`        | `int`   |
| `name`      | `varchar` |

- `id` is the **primary key** (column with unique values) for this table.
- Each row represents a **customer**, including their **ID** and **name**.

---

### **Table: Orders**
| Column Name | Type |
|------------|------|
| `id`        | `int` |
| `customerId`| `int` |

- `id` is the **primary key** (column with unique values) for this table.
- `customerId` is a **foreign key** referencing `id` in the `Customers` table.
- Each row represents an **order**, linking it to a specific customer.

---

## Example

### **Input**
#### **Customers table:**
| id  | name  |
|-----|-------|
| 1   | Joe   |
| 2   | Henry |
| 3   | Sam   |
| 4   | Max   |

#### **Orders table:**
| id  | customerId |
|-----|------------|
| 1   | 3          |
| 2   | 1          |

---

### **Output**
| Customers |
|-----------|
| Henry     |
| Max       |

---

### **Explanation**
- **Joe (id = 1)** has placed an order (`customerId = 1` in the `Orders` table).
- **Sam (id = 3)** has placed an order (`customerId = 3` in the `Orders` table).
- **Henry (id = 2)** **has not placed any orders**, so he is included in the result.
- **Max (id = 4)** **has not placed any orders**, so he is also included in the result.

---

## **Constraints**
- Each `customerId` in the `Orders` table references an existing `id` in the `Customers` table.

---