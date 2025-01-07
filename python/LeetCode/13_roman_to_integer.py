class Solution:
    def romanToInt(self, s: str) -> int:
        total_value = 0
        value_dict = {'I':1, 'V':5, 'X':10, 'L':50,
            'C':100, 'D':500, 'M':1000}

        prev_value = 0
        for char in reversed(s):
            curr_value = value_dict[char] 
            
            if curr_value < prev_value:
                total_value -= curr_value
            else:
                total_value += curr_value
            
            prev_value = curr_value

        return total_value

# Time Complexity: O(n) -> A single pass through the string (using reversed(s)). 
# Space Complexity: O(1) -> Uses only integer variables (total_value and prev_value). the input string s is not copied.