class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        return expected_sum - actual_sum

'''
✅ Time Complexity: O(n) (single pass summation)
✅ Space Complexity: O(1) (constant space)

# Inefficient solutoin:
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        num = 0
        for i in range(len(nums)):
            if num + 1 in nums:
                num += 1
            else:
                return num + 1
# Since the loop runs up to n times, the worst-case time complexity is O(n²).
'''