class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        res = [words[0]]  # Start with the first word
        
        for i in range(1, len(words)):
            if sorted(words[i]) != sorted(res[-1]):  # Compare with last added word
                res.append(words[i]) 
        
        return res

'''
Time Complexity: O(n * m log m) (since each word is sorted once).
Space Complexity: O(n) (to store the result list).
'''