package org.example;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        for (String s : strs) {
            if (s.isEmpty()) {
                return "";
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
// Time Complexity: O(m x n) with n as number of strings and m as length of the shortest string.
// Space Complexity: O(m)
