# 1170. Compare Strings by Frequency of the Smallest Character

### Difficulty
**Medium**

---

## Problem Statement

Let the function `f(s)` be the **frequency of the lexicographically smallest character** in a **non-empty string** `s`.  

For example:  
- If `s = "dcce"`, then `f(s) = 2`, because the **smallest character** is `'c'`, which appears **twice**.

You are given:
- An **array of strings** `words`
- An **array of query strings** `queries`

For each query `queries[i]`, count how many words in `words` satisfy the condition:  
\[
f(queries[i]) < f(W)
\]
for each word `W` in `words`.

Return an **integer array** `answer`, where `answer[i]` is the answer for the `i`th query.

---

## Examples

### **Example 1**
#### **Input**:  
`queries = ["cbd"]`  
`words = ["zaaaz"]`  

#### **Output**:  
`[1]`

#### **Explanation**:  
- `f("cbd") = 1` (smallest character `'b'`, appears **once**).  
- `f("zaaaz") = 3` (smallest character `'a'`, appears **three times**).  
- Since `f("cbd") < f("zaaaz")`, the answer is `[1]`.

---

### **Example 2**
#### **Input**:  
`queries = ["bbb","cc"]`  
`words = ["a","aa","aaa","aaaa"]`  

#### **Output**:  
`[1, 2]`

#### **Explanation**:  
- `f("bbb") = 1` (smallest character `'b'`, appears **once**).  
- `f("cc") = 2` (smallest character `'c'`, appears **twice**).  

For `words`:
- `f("a") = 1`
- `f("aa") = 2`
- `f("aaa") = 3`
- `f("aaaa") = 4`

Comparisons:
- For `"bbb"`: Only `f("aaaa") > 1`, so the count is **1**.
- For `"cc"`: `f("aaa") = 3` and `f("aaaa") = 4` are greater, so the count is **2**.

Final output: `[1, 2]`.

---

## Constraints
- `1 <= queries.length <= 2000`
- `1 <= words.length <= 2000`
- `1 <= queries[i].length, words[i].length <= 10`
- `queries[i][j]`, `words[i][j]` consist of **lowercase English letters**.

---

## **Hints**
1. **Precompute the smallest character frequency** for each string in `words`, store it in an array, then **sort** this array.
2. **For each query**, compute `f(queries[i])` and use **binary search** on the sorted array from step 1 to count numbers greater than `f(queries[i])`.

---

## **Topics**
- Strings
- Sorting
- Binary Search
- Frequency Counting
