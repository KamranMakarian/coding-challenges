# 586. Customer Placing the Largest Number of Orders

### Difficulty
**Easy**

---

## Problem Statement

Given an `Orders` table, write a **SQL query** to find the **`customer_number`** for the customer who has placed the **largest number of orders**.

- The test cases are generated so that **exactly one customer** will have placed more orders than any other customer.

---

## Table Schema

### **Table: Orders**
| Column Name      | Type |
|------------------|------|
| `order_number`   | `int` |
| `customer_number`| `int` |

- `order_number` is the **primary key** (unique values) for this table.
- Each row contains:
  - An **order ID** (`order_number`), and
  - The **customer ID** (`customer_number`).

---

## Example

### **Input**
#### **Orders table:**
| order_number | customer_number |
|--------------|-----------------|
| 1            | 1               |
| 2            | 2               |
| 3            | 3               |
| 4            | 3               |

---

### **Output**
| customer_number |
|-----------------|
| 3               |

---

### **Explanation**
- Customer `3` has **two orders**, which is more than either customer `1` or `2` (each with **one order**).  
- Thus, the result is `customer_number = 3`.

---

## **Follow-Up**
- What if **more than one customer** has the largest number of orders?  
  - In that case, modify the query to return **all customers** with the highest number of orders.

---

## **Hints**
1. To find the customer with the largest number of orders, **group by** `customer_number` and use an **aggregation function** (`COUNT`).
2. Use an **ORDER BY** clause to sort the customers by the number of orders in descending order.
3. To handle ties (if multiple customers have the largest number of orders), modify the query to include **all such customers**.

---