package org.example;

public class Solution {
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int residual = 0;

        StringBuilder result = new StringBuilder();

        while (m >= 0 || n >= 0 || residual > 0) {
            int digit_a = (m >= 0) ? Character.getNumericValue(a.charAt(m)) : 0;
            int digit_b = (n >= 0) ? Character.getNumericValue(b.charAt(n)) : 0;

            int total = digit_a + digit_b + residual;

            result.append(total % 2);
            residual = total / 2;

            m--;
            n--;
        }

        return result.reverse().toString();
    }
}
/*
Time and Space Complexity

Time Complexity:
The loop processes each digit of a and b once, so the time complexity is O(max(m, n)), where m and n are the lengths of a and b.

Space Complexity:
The space complexity is O(max(m, n)), which is the size of the StringBuilder storing the result.
 */