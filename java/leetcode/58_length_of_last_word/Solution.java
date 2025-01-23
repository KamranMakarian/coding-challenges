package org.example;

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while ((i >= 0) && (Character.isWhitespace(s.charAt(i)))) {
            i -= 1;
        }

        while ((i >= 0) && (!Character.isWhitespace(s.charAt(i)))) {
            length += 1;
            i -= 1;
        }

        return length;
    }
}
// Time complexity: O(n)
// Space complexity: O(1)
