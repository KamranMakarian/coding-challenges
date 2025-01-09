package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');

        for (char symbol : s.toCharArray()) {
            if (bracketPairs.containsKey(symbol)) {  // It's a closing bracket
                if (stack.isEmpty() || stack.peekLast() != bracketPairs.get(symbol)) {
                    return false;
                }
                stack.removeLast();  // Pop from stack
            } else {
                stack.addLast(symbol);  // Push to stack
            }
        }

        return stack.isEmpty();
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
