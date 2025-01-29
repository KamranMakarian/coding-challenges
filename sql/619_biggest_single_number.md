# 619. Biggest Single Number

### Difficulty
**Easy**

---

## Problem Statement

Given a `MyNumbers` table, write a **SQL query** to find the **largest single number**.

A **single number** is defined as a number that appears **only once** in the `MyNumbers` table.

- If there is at least one single number, return the **largest** one.
- If there are no single numbers, return **null**.

Return the result table in **any order**.

---

## Table Schema

### **Table: MyNumbers**
| Column Name | Type |
|-------------|------|
| `num`       | `int` |

- This table **may contain duplicates** (i.e., there is no **primary key**).
- Each row represents a **single integer value**.

---

## Example

### **Example 1**
#### **Input**
#### **MyNumbers table:**
| num |
|-----|
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
| 6   |

#### **Output**
| num |
|-----|
| 6   |

#### **Explanation**
- The **single numbers** (numbers appearing only once) are `{1, 4, 5, 6}`.
- The **largest** of these numbers is `6`, so the result is `6`.

---

### **Example 2**
#### **Input**
#### **MyNumbers table:**
| num |
|-----|
| 8   |
| 8   |
| 7   |
| 7   |
| 3   |
| 3   |
| 3   |

#### **Output**
| num  |
|------|
| null |

#### **Explanation**
- There are **no single numbers** in the input table.
- The result is `null`.

---