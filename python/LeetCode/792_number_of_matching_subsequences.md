# 792. Number of Matching Subsequences

### Difficulty
**Medium**

---

## Problem Statement

Given a string `s` and an **array of strings** `words`, return the **number of `words[i]` that are a subsequence** of `s`.

A **subsequence** of a string is a new string generated from the original string with **some characters (possibly none) removed** without changing the **relative order** of the remaining characters.

For example:
- `"ace"` is a **subsequence** of `"abcde"`, but `"aec"` is **not**.

---

## Examples

### **Example 1**
#### **Input**:  
`s = "abcde"`  
`words = ["a","bb","acd","ace"]`  

#### **Output**:  
`3`

#### **Explanation**:  
The **three words** that are subsequences of `"abcde"` are:
1. `"a"`
2. `"acd"`
3. `"ace"`

---

### **Example 2**
#### **Input**:  
`s = "dsahjpjauf"`  
`words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]`  

#### **Output**:  
`2`

#### **Explanation**:  
The **two words** that are subsequences of `"dsahjpjauf"` are:
1. `"ahjpjau"`
2. `"ja"`

---

## Constraints
- `1 <= s.length <= 5 * 10^4`
- `1 <= words.length <= 5000`
- `1 <= words[i].length <= 50`
- `s` and `words[i]` consist of **only lowercase English letters**.

---

## **Topics**
- Strings
- Two-Pointer Technique
- Hash Maps
- Data Structures (Queues, Lists)
