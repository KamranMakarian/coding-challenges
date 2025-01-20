class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        # Edge case: If needle is empty
        if not needle:
            return 0

        m, n = len(haystack), len(needle)

        # Iterate through haystack
        for i in range(m - n + 1):  # Ensure no out-of-bounds error
            
            if haystack[i:i + n] == needle:
                return i

        return -1 
'''
Complexity Analysis:

1) Time Complexity:
Outer loop: O(m - n + 1), where m is the length of haystack and n is the length of needle.
Substring comparison: O(n) for each iteration.
Total: O((m - n + 1) × n) in the worst case.

2)Space Complexity:
O(1): No additional data structures are used.
'''