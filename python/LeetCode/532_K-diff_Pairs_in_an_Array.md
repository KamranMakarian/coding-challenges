# 532. K-diff Pairs in an Array

### Difficulty
**Medium**

---

## Problem Statement

Given an **array of integers** `nums` and an **integer** `k`, return the **number of unique k-diff pairs** in the array.

A **k-diff pair** is an **integer pair** `(nums[i], nums[j])` where the following conditions hold:
- `0 <= i, j < nums.length`
- `i != j`
- `|nums[i] - nums[j]| == k`

**Note:**  
- `|val|` denotes the **absolute value** of `val`.

---

## Examples

### **Example 1**
#### **Input**:  
```plaintext
nums = [3,1,4,1,5], k = 2
```
#### **Output**:  
```plaintext
2
```
#### **Explanation**:  
There are **two** **2-diff pairs** in the array:
1. `(1, 3)`
2. `(3, 5)`

Even though there are **two `1`s** in the input, we should **only count unique pairs**.

---

### **Example 2**
#### **Input**:  
```plaintext
nums = [1,2,3,4,5], k = 1
```
#### **Output**:  
```plaintext
4
```
#### **Explanation**:  
There are **four** **1-diff pairs** in the array:
1. `(1, 2)`
2. `(2, 3)`
3. `(3, 4)`
4. `(4, 5)`

---

### **Example 3**
#### **Input**:  
```plaintext
nums = [1,3,1,5,4], k = 0
```
#### **Output**:  
```plaintext
1
```
#### **Explanation**:  
There is **one** **0-diff pair** in the array:
1. `(1, 1)`

---

## Constraints
- `1 <= nums.length <= 10^4`
- `-10^7 <= nums[i] <= 10^7`
- `0 <= k <= 10^7`

---

## **Topics**
- Hash Maps
- Sorting
- Two Pointers
- Counting Frequencies
