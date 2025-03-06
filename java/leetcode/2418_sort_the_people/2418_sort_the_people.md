# 2418. Sort the People

### Difficulty
**Easy**

---

## Problem Statement

You are given:
- An array of strings `names`, and
- An array `heights` that consists of **distinct positive integers**.

Both arrays are of length **n**.

- For each index `i`, `names[i]` and `heights[i]` denote the **name** and **height** of the `i`th person.

**Return** `names` **sorted in descending order** by the people's **heights**.

---

## Examples

### **Example 1**
#### **Input**:  
`names = ["Mary","John","Emma"]`  
`heights = [180,165,170]`  

#### **Output**:  
`["Mary","Emma","John"]`

#### **Explanation**:  
- **Mary** is the **tallest** (`180`), 
- Followed by **Emma** (`170`), 
- And then **John** (`165`).

---

### **Example 2**
#### **Input**:  
`names = ["Alice","Bob","Bob"]`  
`heights = [155,185,150]`  

#### **Output**:  
`["Bob","Alice","Bob"]`

#### **Explanation**:  
- The **first Bob** is the **tallest** (`185`), 
- Followed by **Alice** (`155`), 
- And the **second Bob** (`150`).

---

## Constraints
- `n == names.length == heights.length`
- `1 <= n <= 1000`
- `1 <= names[i].length <= 20`
- `1 <= heights[i] <= 100000`
- `names[i]` consists of **lower and upper case English letters**.
- All the values of **heights are distinct**.

---

## **Hints**
1. Find the **tallest person** and **swap** with the **first person**, then find the **second tallest person** and **swap** with the **second person**, etc.
2. **Repeat** until you **fix all n people**.

---

## **Topics**
- Arrays
- Sorting
- Data Structures (Lists)
