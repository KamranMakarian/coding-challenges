# 26. Remove Duplicates from Sorted Array

### Difficulty
**Easy**

---

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same.

Then return the **number of unique elements** in `nums`.

---

### Requirements
1. Modify the array `nums` such that:
   - The first `k` elements of `nums` contain the unique elements in the order they were initially present in `nums`.
   - The remaining elements of `nums` are **not important**.
2. Return the value of `k`, which represents the number of unique elements.

---

### **Custom Judge**
The solution will be tested with the following code:
```java
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```
- If all assertions pass, the solution is accepted.

---

## **Examples**

### **Example 1**
#### **Input**:  
`nums = [1,1,2]`  
#### **Output**:  
`2, nums = [1,2,_]`  
#### **Explanation**:  
- The function returns `k = 2`.
- The first two elements of `nums` are `1` and `2`, respectively.
- It does not matter what is left beyond the returned `k` (denoted as `_`).

---

### **Example 2**
#### **Input**:  
`nums = [0,0,1,1,1,2,2,3,3,4]`  
#### **Output**:  
`5, nums = [0,1,2,3,4,_,_,_,_,_]`  
#### **Explanation**:  
- The function returns `k = 5`.
- The first five elements of `nums` are `0, 1, 2, 3, and 4`, respectively.
- The rest of the array does not matter.

---

## **Constraints**
- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing order**.

---

## **Hints**
1. Focus on the fact that the input array is **sorted**.
   - If one duplicate is encountered, the rest of the duplicates will be adjacent to it.
2. Modify the array **in-place** using a **two-pointer approach**:
   - One pointer keeps track of the current element in the original array.
   - The other pointer tracks the position where the next unique element should be placed.
3. Skip over duplicates and move to the next unique element.

---
