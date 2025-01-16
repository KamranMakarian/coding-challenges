class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0

        j = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[j]:
                j += 1  
                nums[j] = nums[i]  

        return j + 1

'''
Complexity Analysis
Operation	Time Complexity	Space Complexity	Why?
Iterate through nums	O(n)	O(1)	Linear scan with constant space.
Modify in-place	O(1)	O(1)	No extra data structures used.
'''