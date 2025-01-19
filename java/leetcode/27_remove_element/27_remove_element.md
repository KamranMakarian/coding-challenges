# 27. Remove Element

### Difficulty
**Easy**

---

## Problem Statement

Given an integer array `nums` and an integer `val`, **remove all occurrences of `val` in `nums` in-place**.  
The order of the elements may be changed. Then return the **number of elements in `nums` which are not equal to `val`**.

---

### Requirements

1. Modify the array `nums` such that:
   - The first `k` elements of `nums` contain the elements **not equal to `val`**.
   - The remaining elements of `nums` are **not important**.
2. Return `k`, the number of elements in `nums` which are **not equal to `val`**.

---

### **Custom Judge**
The solution will be tested with the following code:
```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // Expected answer with correct length
                            // It is sorted with no values equal to val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```
- If all assertions pass, the solution will be accepted.

---

## **Examples**

### **Example 1**
#### **Input**:  
`nums = [3,2,2,3]`, `val = 3`  
#### **Output**:  
`2, nums = [2,2,_,_]`  
#### **Explanation**:  
- The function returns `k = 2`, with the first two elements of `nums` being `2`.  
- The rest of the array does not matter (denoted as `_`).

---

### **Example 2**
#### **Input**:  
`nums = [0,1,2,2,3,0,4,2]`, `val = 2`  
#### **Output**:  
`5, nums = [0,1,4,0,3,_,_,_]`  
#### **Explanation**:  
- The function returns `k = 5`, with the first five elements of `nums` being `0, 1, 4, 0, and 3`.  
- The order of these elements may vary, and the rest of the array does not matter.

---

## **Constraints**
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

---

## **Hints**
1. The problem asks us to **modify the array in-place**, and elements beyond the new length can be ignored.
2. Use a **two-pointer technique** to move all occurrences of `val` to the end of the array.
3. Alternatively, consider elements to be removed as **non-existent**. In a **single pass**, copy visible elements in-place.

---

## **Topics**
- Arrays
- Two-Pointer Technique
- In-Place Modifications
