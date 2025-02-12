# 2273. Find Resultant Array After Removing Anagrams

### Difficulty
**Easy**

---

## Problem Statement

You are given a **0-indexed** string array `words`, where `words[i]` consists of **lowercase English letters**.

In one operation, **select any index `i`** such that `0 < i < words.length` and `words[i - 1]` and `words[i]` are **anagrams**, then delete `words[i]` from `words`.  
Keep performing this operation **as long as possible**.

Return `words` after performing all operations.  
It can be shown that selecting the indices for each operation **in any arbitrary order** will lead to the **same result**.

### **Definition of Anagram**
An **anagram** is a word formed by rearranging the letters of another word using **all original letters exactly once**.  
For example, `"dacb"` is an anagram of `"abdc"`.

---

## Examples

### **Example 1**
#### **Input**:  
`words = ["abba","baba","bbaa","cd","cd"]`
#### **Output**:  
`["abba","cd"]`
#### **Explanation**:
One possible sequence of operations:
1. `"bbaa"` (`words[2]`) and `"baba"` (`words[1]`) are anagrams → **delete `words[2]`**.
   - `words = ["abba","baba","cd","cd"]`
2. `"baba"` (`words[1]`) and `"abba"` (`words[0]`) are anagrams → **delete `words[1]`**.
   - `words = ["abba","cd","cd"]`
3. `"cd"` (`words[2]`) and `"cd"` (`words[1]`) are anagrams → **delete `words[2]`**.
   - `words = ["abba","cd"]`
4. No further operations can be performed, so **final answer is `["abba","cd"]`**.

---

### **Example 2**
#### **Input**:  
`words = ["a","b","c","d","e"]`
#### **Output**:  
`["a","b","c","d","e"]`
#### **Explanation**:
- No two **adjacent** strings are anagrams.
- No operations are performed.

---

## Constraints
- `1 <= words.length <= 100`
- `1 <= words[i].length <= 10`
- `words[i]` consists of **only lowercase English letters**.

---

## **Hints**
1. Instead of removing each repeating anagram, try to find all the **strings in `words` that will be in the final answer**.
2. For every index `i`, find the **largest index `j < i`** such that `words[j]` will be present in the final answer.
3. Check if `words[i]` and `words[j]` are **anagrams**. If they are, then `words[i]` should not be present in the final answer.

---

## **Topics**
- Strings
- Sorting
- Data Structures (Lists)
