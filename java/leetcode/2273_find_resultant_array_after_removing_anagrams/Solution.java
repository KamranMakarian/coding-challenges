package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prev = ""; // To track the last unique word's sorted version

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!sortedWord.equals(prev)) {  // If it's not an anagram of the last word, add it
                res.add(word);
                prev = sortedWord;  // Update the last added word
            }
        }
        return res;
    }
}
/*
Complexity Analysis
Sorting Each Word: O(m log m), where m is the max word length.
Overall Time Complexity: O(n * m log m) (since each word is sorted once).
Space Complexity: O(n) (for storing the result list).
*/