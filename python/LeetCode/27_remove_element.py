class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        j = 0  
        for i in range(len(nums)):
            if nums[i] != val:
                nums[j] = nums[i]
                j += 1 
        return j
        
'''
Time and Space Complexity
Aspect	Time Complexity	Space Complexity	Explanation
Iteration	O(n)	O(1)	Iterates through the array once.
In-place Update	O(1)	O(1)	No additional data structures are used.
'''