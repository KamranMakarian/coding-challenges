# 175. Combine Two Tables

### Difficulty: Easy

---

## Problem Statement

Given two tables, `Person` and `Address`, write a **SQL query** to **report the first name, last name, city, and state** of each person in the `Person` table.  

If the address of a `personId` is **not present** in the `Address` table, report `NULL` instead.

Return the result table in **any order**.

---

## Table Schema

### **Table: Person**
| Column Name | Type    |
|------------|--------|
| `personId`  | `int`     |
| `lastName`  | `varchar` |
| `firstName` | `varchar` |

- `personId` is the **primary key** (column with unique values) for this table.
- This table contains information about the ID of some persons and their first and last names.

---

### **Table: Address**
| Column Name | Type    |
|------------|--------|
| `addressId` | `int`     |
| `personId`  | `int`     |
| `city`      | `varchar` |
| `state`     | `varchar` |

- `addressId` is the **primary key** (column with unique values) for this table.
- Each row of this table contains information about the **city and state** of one person with `ID = personId`.

---

## Example

### **Input**
#### **Person table:**
| personId | lastName | firstName |
|----------|----------|-----------|
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |

#### **Address table:**
| addressId | personId | city          | state      |
|-----------|----------|---------------|------------|
| 1         | 2        | New York City | New York   |
| 2         | 3        | Leetcode      | California |

---

### **Output**
| firstName | lastName | city          | state    |
|-----------|----------|---------------|----------|
| Allen     | Wang     | `NULL`        | `NULL`   |
| Bob       | Alice    | New York City | New York |

---

### **Explanation**
- There is **no address** in the `Address` table for `personId = 1`, so we return `NULL` for their city and state.
- `addressId = 1` contains information about the address of `personId = 2`.
