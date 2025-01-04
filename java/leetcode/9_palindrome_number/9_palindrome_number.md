# 9_palindrome_number

### Difficulty
**Easy**

---

## Problem Statement

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

---

## Examples

### Example 1:
**Input**:  
`x = 121`  
**Output**:  
`true`  
**Explanation**:  
`121` reads the same from left to right and right to left.

---

### Example 2:
**Input**:  
`x = -121`  
**Output**:  
`false`  
**Explanation**:  
From left to right, it reads `-121`. From right to left, it becomes `121-`.  
Since it is not the same, it is **not** a palindrome.

---

### Example 3:
**Input**:  
`x = 10`  
**Output**:  
`false`  
**Explanation**:  
It reads `01` from right to left. Therefore, it is **not** a palindrome.

---

## Constraints
- `-2^31 <= x <= 2^31 - 1`

---

## Follow-Up

Can you solve this problem **without converting the integer to a string**?

---

## Hints

1. **Beware of integer overflow** when you reverse the integer.

---


