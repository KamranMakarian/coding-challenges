package org.example;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev1 = 1, prev2 = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}
/*
O(n) time complexity → One loop from 3 to n.
O(1) space complexity → No extra array, just two variables.
*/