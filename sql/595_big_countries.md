# 595. Big Countries

### Difficulty
**Easy**

---

## Problem Statement

Given a `World` table, write a **SQL query** to find the **name**, **population**, and **area** of the countries that meet the following criteria:

A country is considered **big** if:
1. It has an **area of at least 3 million km²** (`3000000`), or  
2. It has a **population of at least 25 million** (`25000000`).

Return the result table in **any order**.

---

## Table Schema

### **Table: World**
| Column Name | Type    |
|-------------|---------|
| `name`      | `varchar` |
| `continent` | `varchar` |
| `area`      | `int`   |
| `population`| `int`   |
| `gdp`       | `bigint` |

- `name` is the **primary key** (unique values) for this table.
- Each row contains:
  - The **name** of a country,
  - The **continent** it belongs to,
  - Its **area** (in km²),
  - Its **population**, and
  - Its **GDP value**.

---

## Example

### **Input**
#### **World table:**
| name         | continent | area    | population | gdp          |
|--------------|-----------|---------|------------|--------------|
| Afghanistan  | Asia      | 652230  | 25500100   | 20343000000  |
| Albania      | Europe    | 28748   | 2831741    | 12960000000  |
| Algeria      | Africa    | 2381741 | 37100000   | 188681000000 |
| Andorra      | Europe    | 468     | 78115      | 3712000000   |
| Angola       | Africa    | 1246700 | 20609294   | 100990000000 |

---

### **Output**
| name         | population | area    |
|--------------|------------|---------|
| Afghanistan  | 25500100   | 652230  |
| Algeria      | 37100000   | 2381741 |

---

### **Explanation**
- **Afghanistan** is included because its **population** (`25500100`) meets the condition of being at least `25000000`.
- **Algeria** is included because its **population** (`37100000`) and **area** (`2381741 km²`) meet the conditions.
- Other countries do not meet the conditions for either **area** or **population**.

---