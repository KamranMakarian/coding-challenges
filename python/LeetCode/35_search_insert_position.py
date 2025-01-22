class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums) - 1

        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        
        return low
        
'''
Complexity Analysis

Time Complexity:

Binary search reduces the search space by half in each iteration, resulting in O(log n) time complexity.

Space Complexity:

No additional space is used beyond a few variables, so space complexity is O(1).
'''
