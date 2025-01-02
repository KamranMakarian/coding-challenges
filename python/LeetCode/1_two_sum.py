class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # Handle the two-element case directly
        if len(nums) == 2 and nums[0] + nums[1] == target:
            return [0, 1]  
        
        # Handle input with larger than two-element
        num_map = {} 
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i] 
            num_map[num] = i 