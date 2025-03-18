
# 268. Missing Number

### Difficulty
**Easy**

---

## Problem Statement

Given an **array** `nums` containing **n distinct numbers** in the range `[0, n]`, return **the only number** in the range that is **missing** from the array.

---

## Examples

### **Example 1**
#### **Input**  
```python
nums = [3,0,1]
```
#### **Output**  
```python
2
```
#### **Explanation**  
- `n = 3` since there are **3 numbers**.
- The **complete range** should be `[0,3]`.
- The **missing number** in the range is **`2`**, since it does not appear in `nums`.

---

### **Example 2**
#### **Input**  
```python
nums = [0,1]
```
#### **Output**  
```python
2
```
#### **Explanation**  
- `n = 2` since there are **2 numbers**.
- The **complete range** should be `[0,2]`.
- The **missing number** is **`2`**, since it does not appear in `nums`.

---

### **Example 3**
#### **Input**  
```python
nums = [9,6,4,2,3,5,7,0,1]
```
#### **Output**  
```python
8
```
#### **Explanation**  
- `n = 9` since there are **9 numbers**.
- The **complete range** should be `[0,9]`.
- The **missing number** is **`8`**, since it does not appear in `nums`.

---

## Constraints
- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- **All the numbers in `nums` are unique**.

---

## **Follow-up**
- Could you implement a solution using only **O(1) extra space complexity** and **O(n) runtime complexity**?

---

## **Topics**
- Array
- Bit Manipulation
- Math (Summation Formula)
- Sorting

