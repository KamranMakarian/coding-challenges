package org.example;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;  // Edge case

        int min = 1, max = x, mid;

        while (min <= max) {
            mid = min + (max - min) / 2;  // Avoids overflow

            if (mid == x / mid) { // Avoids overflow from `mid * mid`
                return mid;
            } else if (mid < x / mid) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return max; // max is the floor of sqrt(x)
    }
}
/*
Time and Space Complexity:
Time Complexity: O(log x) because binary search halves the search space in each iteration.
Space Complexity: O(1) because we only use a few integer variables.
*/