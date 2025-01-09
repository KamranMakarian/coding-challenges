# 20. Valid Parentheses

### Difficulty
**Easy**

---

## Problem Statement

Given a string `s` containing just the characters **`(`, `)`, `{`, `}`, `[` and `]`**, determine if the input string is **valid**.

An input string is **valid** if:
1. Open brackets must be **closed by the same type of brackets**.
2. Open brackets must be **closed in the correct order**.
3. Every closing bracket has a **corresponding open bracket of the same type**.

---

## **Examples**

### **Example 1**
**Input**:  
`s = "()"`  
**Output**:  
`true`  

---

### **Example 2**
**Input**:  
`s = "()[]{}"`  
**Output**:  
`true`  

---

### **Example 3**
**Input**:  
`s = "(]"`  
**Output**:  
`false`  

---

### **Example 4**
**Input**:  
`s = "([])"`  
**Output**:  
`true`  

---

## **Constraints**
- `1 <= s.length <= 10^4`
- `s` consists of **only** the characters **`()[]{}`**.

---

## **Hints**
1. **Use a stack** to keep track of characters.
2. When encountering an **opening bracket**, **push** it onto the stack.
3. When encountering a **closing bracket**, **check if the top of the stack** was the corresponding opening bracket.
   - If **yes**, **pop** it from the stack.
   - If **no**, return `false`.

---