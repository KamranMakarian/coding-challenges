package org.example;

public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int xReverse = 0;
        int xCopy = x;

        while (xCopy > 0) {
            int lastDigit = xCopy % 10;

            if (xReverse > (Integer.MAX_VALUE - lastDigit) / 10) {
                return false;
            }

            xReverse = xReverse * 10 + xCopy % 10;
            xCopy /= 10;
        }

        return xReverse == x;
    }
}
// Time Complexity: O(log x) -> Iterates through half the number's digits
// Space Complexity: O(1) -> Uses only integer variables
