class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0 or x == 1:
            return x
        
        left, right = 0, x
        while left <= right:
            mid = (left + right) // 2 
            if mid * mid == x:  
                return mid
            elif mid * mid < x:
                left = mid + 1
            else:
                right = mid - 1
        
        return right  # Returns the largest integer where mid^2 <= x
'''
Time and Space Complexity
Complexity	Analysis
Time	O(log x) (Binary search halves search space each step)
Space	O(1) (Uses only a few integer variables)
This is much more efficient than iterating up to x (O(x) complexity).
'''