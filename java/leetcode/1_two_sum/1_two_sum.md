# 1. Two Sum

### Difficulty
**Easy**

---

## Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

You may assume that:
- Each input would have exactly **one solution**.
- You **may not use the same element twice**.

You can return the answer in **any order**.

---

## Examples

### Example 1:
**Input**:  
`nums = [2,7,11,15], target = 9`  
**Output**:  
`[0,1]`  
**Explanation**:  
`nums[0] + nums[1] == 9`, so we return `[0, 1]`.

---

### Example 2:
**Input**:  
`nums = [3,2,4], target = 6`  
**Output**:  
`[1,2]`

---

### Example 3:
**Input**:  
`nums = [3,3], target = 6`  
**Output**:  
`[0,1]`

---

## Constraints
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- **Only one valid answer exists.**

---

## Follow-Up

Can you come up with an algorithm that is better than `O(n^2)` time complexity?

---

## Hints

1. A brute force approach would involve searching for all possible pairs of numbers, but this approach would be too slow. Start with a brute force solution for completeness and then optimize.
2. If you fix one of the numbers, say `x`, you need to scan the array to find the second number `y` such that `y = target - x`. Can the array be transformed to make this search faster?
3. Without changing the array, can you use additional space, such as a **hash map**, to speed up the search?


