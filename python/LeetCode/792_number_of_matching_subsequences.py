class Solution:
    def numMatchingSubseq(self, s: str, words: List[str]) -> int:
        def is_subsequence(word, s):
            i = 0  # Pointer for s
            for char in word:
                i = s.find(char, i)  # Find character after index i
                if i == -1:  # If not found, return False
                    return False
                i += 1  # Move to next character in s
            return True

        count = 0
        for word in words:
            if is_subsequence(word, s):
                count += 1
        return count
'''
Time Complexity:
O(n + m * k) (efficient for large inputs)
n is the length of s
m is the number of words in "words" list
k is the average word length

Explanation:
s.find() is optimized and runs in average O(1)
Looping through words is O(m * k)
'''