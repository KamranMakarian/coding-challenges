class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closing_dict = {')': '(', ']': '[', '}': '{'}

        for item in s:
            if item in closing_dict:  
                prev_item = stack.pop() if stack else '#'  
                if prev_item != closing_dict[item]:  
                    return False
            else:
                stack.append(item)

        return not stack

# Time Complexity Analysis:
# Loop iterates over s once → O(n)
# Each append() operation (push to stack) is O(1)
# Each pop() operation (remove from stack) is O(1)
# Total Time Complexity: O(n)

# Space Complexity Analysis:
# Worst-case scenario: If s consists of only opening brackets like "(((([[{{", 
# the stack grows to store n elements → O(n) space.
# Best-case scenario: If s is completely valid and all brackets match, 
# the stack is empty at the end → O(1) space.
# Total Space Complexity: O(n) (worst case), O(1) (best case with no unmatched brackets).