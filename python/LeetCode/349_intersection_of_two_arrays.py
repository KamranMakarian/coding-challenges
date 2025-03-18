class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        return list(set(nums1) & set(nums2))

'''
# Less concise and pythonic solution with the same efficiency:
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1_set = set(nums1)
        nums2_set = set(nums2)
        intersection = nums1_set.intersection(nums2_set)
        return list(intersection)

# Time Complexity
# Converting lists to sets: O(n) + O(m)
# Finding the intersection: O(min(n, m))
# Converting back to a list: O(k) where k is the number of common elements.
# Overall Complexity: O(n + m) → This is optimal.
# Space Complexity
# Extra space for nums1_set, nums2_set, and intersection: O(n + m)
# Overall: O(n + m), which is reasonable.
'''