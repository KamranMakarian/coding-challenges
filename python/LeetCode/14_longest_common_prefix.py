class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs or "" in strs:
            return ""
        
        prefix = []
        for i in range(len(strs[0])):
            char = strs[0][i]

            for j in range(1,len(strs)):
                if i >= len(strs[j]) or strs[j][i] != char:
                    return "".join(prefix)
            prefix.append(char)
            
        return "".join(prefix)
    
# Time Complexity: O(m x n) with n as number of strings and m as length of the shortest string.
# Space Complexity: O(m)