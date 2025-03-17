class Solution:
    def numSmallerByFrequency(self, queries: List[str], words: List[str]) -> List[int]:
        def f(s):
            return s.count(min(s))  # Count occurrences of smallest character
        
        word_counts = sorted([f(w) for w in words])  # Compute f(w) for each word and sort
        
        result = []
        for query in queries:
            query_count = f(query)  # Compute f(query)
            count = sum(query_count < w for w in word_counts)  # Count words where f(query) < f(word)
            result.append(count)
        
        return result

'''
# Time & Space Complexity
# Step	Complexity
# Compute f(words) and sort	O(m log m)
# Compute f(query) for each query	O(n)
# Compare with words list using sum()	O(n * m) (worst case)
# Total Complexity	O(m log m + n * m)
# Space Complexity: O(m + n)

# More Optimized solution:

from bisect import bisect_right
from typing import List

class Solution:
    def numSmallerByFrequency(self, queries: List[str], words: List[str]) -> List[int]:
        def f(s):
            return s.count(min(s))  # Compute f(s) -> Count of the smallest character
        
        word_counts = sorted([f(w) for w in words])  # Compute f(word) for all words and sort
        result = []
        
        for query in queries:
            query_count = f(query)  # Compute f(query)
            count = len(word_counts) - bisect_right(word_counts, query_count)  
            # Find the number of elements greater than query_count
            result.append(count)
        
        return result

# Time & Space Complexity

# Step	                        Complexity
# Compute f(words) for all words	O(m)
# Sort f(words)	                O(m log m)
# Compute f(query) for all queries	O(n)
# Binary search for each query	O(n log m)
# Total Complexity	            O(m log m + n log m) (efficient)

# Space Complexity: O(m + n) (stores f(words) and result list)
'''