package org.example;

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move backward
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1; // If the current digit is not 9, increment and return
                return digits;
            }
            digits[i] = 0; // If it's 9, set it to 0 and continue to the next digit
        }

        // If all digits are 9, we need an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The first digit becomes 1, rest are already 0
        return newDigits;
    }
}
/*
Time and Space Complexity
Time Complexity:

The loop runs from the last digit to the first, so the time complexity is O(n), where n is the number of digits.
Space Complexity:

The solution modifies the input array in place if possible, so the space complexity is O(1).
In the case of all 9s, a new array of size n + 1 is created, which results in O(n) space in that case.
*/
