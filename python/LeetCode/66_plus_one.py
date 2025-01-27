class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        n = len(digits)
        for i in range(n - 1, -1, -1):  # Iterate from the least significant digit
            if digits[i] < 9:
                digits[i] += 1  # Increment and return if no carry is needed
                return digits
            digits[i] = 0  # Set the current digit to 0 and continue to the next
        # If all digits were 9, prepend 1 to handle the carry
        return [1] + digits
        # Time Complexity: O(n)
        # Space Complexity: O(1)


        '''
        # A sub-optimal solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        number = int(''.join(str(x) for x in digits))
        incremented_number = number + 1
        incremented_digits = list(str(incremented_number))
        new_digits = [int(x) for x in incremented_digits]
        return new_digits
        # Time Complexity: O(n)
        # Space Complexity: O(1) due to type conversion
        '''