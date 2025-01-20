# 28. Find the Index of the First Occurrence in a String

### Difficulty
**Easy**

---

## Problem Statement

Given two strings `needle` and `haystack`, return the **index of the first occurrence** of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## Examples

### **Example 1**
#### **Input**:  
`haystack = "sadbutsad"`, `needle = "sad"`  
#### **Output**:  
`0`  
#### **Explanation**:  
The substring `"sad"` occurs at index `0` and `6` in `haystack`.  
The first occurrence is at index `0`, so the result is `0`.

---

### **Example 2**
#### **Input**:  
`haystack = "leetcode"`, `needle = "leeto"`  
#### **Output**:  
`-1`  
#### **Explanation**:  
The substring `"leeto"` does not occur in `haystack`, so the result is `-1`.

---

## Constraints
- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only **lowercase English characters**.

---