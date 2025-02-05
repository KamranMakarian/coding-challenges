class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2

        prev1, prev2 = 1, 2  # Base cases: dp(1) = 1, dp(2) = 2
        
        for _ in range(3, n + 1):
            current = prev1 + prev2
            prev1, prev2 = prev2, current  # Shift values for next iteration

        return prev2
'''
O(n) time complexity → One loop from 3 to n.
O(1) space complexity → No extra array, just two variables.
'''