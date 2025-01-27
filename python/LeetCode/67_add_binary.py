class Solution:
    def addBinary(self, a: str, b: str) -> str:

        result = []
        carry = 0
        i, j = len(a) - 1, len(b) - 1
        
        while i >= 0 or j >= 0 or carry:
            bit_a = int(a[i]) if i >= 0 else 0
            bit_b = int(b[j]) if j >= 0 else 0

            sum = bit_a + bit_b + carry
            result.append(str(sum % 2))
            carry = sum // 2

            i -= 1
            j -= 1

        return ''.join(reversed(result))

'''
Complexity Analysis
Time Complexity:

Each digit in a and b is processed once.
The loop runs for O(max(len(a), len(b))) iterations.
Time Complexity: O(n), where n = max(len(a), len(b)).
Space Complexity:

The result list stores the binary digits, requiring O(n) space.


Alternative solution:
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        return bin(int(a, 2) + int(b, 2))[2:]


Comparison
Aspect	Iterative Solution	Built-In Solution
Time Complexity	O(n)	O(n)
Space Complexity	O(n)	O(n)
Readability	More explicit	Very concise
Scalability	Works for very large inputs	Dependent on built-ins
'''