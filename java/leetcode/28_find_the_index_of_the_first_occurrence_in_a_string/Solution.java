package org.example;

public class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if (m < n) {
            return -1;
        }

        for (int i = 0; i < m - n + 1; i++) {
            boolean match = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}
// Time Complexity: O(m × n)
// Space Complexity: O(1)

/*
The Knuth-Morris-Pratt (KMP) algorithm is not defined differently between Java and Python—it is a general algorithm with the same underlying principles regardless of the programming language. However, the implementation details may vary due to differences in syntax, data structures, and language idioms.

Here’s a breakdown of how the KMP algorithm might differ between Python and Java:

Overview of KMP
The KMP algorithm consists of two main parts:

Building the Partial Match Table (LPS Array):
The LPS (Longest Prefix Suffix) array stores the length of the longest prefix that is also a suffix for substrings of the needle.
Pattern Matching:
The needle is matched against the haystack using the LPS array to skip unnecessary comparisons.
Key Differences Between Java and Python Implementations
1) Data Structures
Java:
Typically uses primitive arrays (int[]) for the LPS array and other variables.
Loops are used explicitly to manipulate indices.
Python:
Uses lists (list) for the LPS array.
Python’s flexibility allows for concise indexing and slicing, which can make some operations simpler.
2️) Syntax
...
 */