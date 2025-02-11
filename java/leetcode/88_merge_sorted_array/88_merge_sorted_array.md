# 88. Merge Sorted Array

### Difficulty
**Easy**

---

## Problem Statement

You are given two **integer arrays** `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the **number of elements** in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a **single sorted array** in **non-decreasing order**.

- The final **sorted array** should **not be returned** by the function.
- Instead, it should be **stored inside `nums1`**.
- To accommodate this, `nums1` has a length of `m + n`, where:
  - The first `m` elements denote the values that should be merged.
  - The last `n` elements are set to **0** and should be ignored.
  - `nums2` has a length of `n`.

---

## Examples

### **Example 1**
#### **Input**:  
`nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3`  
#### **Output**:  
`[1,2,2,3,5,6]`  
#### **Explanation**:  
The arrays being merged are `[1,2,3]` and `[2,5,6]`.  
The merged result is `[1,2,2,3,5,6]`, with the **underlined elements** coming from `nums1`.

---

### **Example 2**
#### **Input**:  
`nums1 = [1]`, `m = 1`, `nums2 = []`, `n = 0`  
#### **Output**:  
`[1]`  
#### **Explanation**:  
The arrays being merged are `[1]` and `[]`.  
The merged result is `[1]`.

---

### **Example 3**
#### **Input**:  
`nums1 = [0]`, `m = 0`, `nums2 = [1]`, `n = 1`  
#### **Output**:  
`[1]`  
#### **Explanation**:  
The arrays being merged are `[]` and `[1]`.  
The merged result is `[1]`.  
Since `m = 0`, there are no elements in `nums1` (the `0` is just a placeholder).

---

## Constraints
- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10^9 <= nums1[i], nums2[j] <= 10^9`

---

## **Follow-Up**
- Can you come up with an **O(m + n)** time complexity algorithm?

---

## **Hints**
1. Think about merging **two elements at a time** rather than two arrays. Since both arrays are sorted, focus on how they will **intertwine**.
2. Consider taking **one element at a time** from both arrays and making a decision **iteratively** to arrive at the optimal solution.

---
