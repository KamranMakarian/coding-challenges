from collections import Counter

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0  # No valid pairs possible for negative k

        num_counts = Counter(nums)
        count = 0

        for num in num_counts:
            if k > 0 and (num + k) in num_counts:
                count += 1
            elif k == 0 and num_counts[num] > 1:
                count += 1

        return count

'''
# Complexity Analysis
# Time Complexity:
# O(n) because we iterate through nums once and perform O(1) lookup operations.
# Space Complexity:
# O(n) since we store elements in a dictionary (Counter).

# Alternative Solution:

class Solution:
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0  # No valid pairs exist for negative k

        num_counts = {}  # Dictionary to store counts
        count = 0

        for num in nums:
            num_counts[num] = num_counts.get(num, 0) + 1  # Count occurrences

        for num in num_counts:
            if k > 0 and num + k in num_counts:
                count += 1
            elif k == 0 and num_counts[num] > 1:
                count += 1

        return count

# Complexity Analysis
# ✅ Time Complexity: O(n) (Single pass for counting + single pass for checking pairs)
# ✅ Space Complexity: O(n) (Storing unique numbers in a dictionary)
'''