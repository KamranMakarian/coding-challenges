def isPalindrome(x):
    if x < 0:
        return False
    
    x_copy = x
    y = 0

    while x_copy > 0:
        y = y * 10 + x_copy % 10
        x_copy //= 10

    return y == x

# ---------------------------
# Space Complexity: O(1) -> Uses only integer variable
# Time Complexity: O(log x) -> Only iterates through half the number's digits
# -----------------------------

# =======================

# The following solution would be inefficient and does not meet the problem's follow up question:
# def isPalindrome(x):
#     x_string_list = list(str(x))
#     x_reversed_list = []

#     for i in range(len(x_string_list)):
#         x_reversed_list.append(x_string_list[-i-1])
        
#     x_reversed = ''.join(x_reversed_list)
#     return str(x) == x_reversed

# ---------------------------------
# Space complexity: O(x) -> Converts integer to string and uses extra list storage.
# Time complexity: O(x) -> Iterates over the number's digits.
# --------------------------------