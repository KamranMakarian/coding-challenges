package org.example;

import java.util.*;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> heightsNames = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            heightsNames.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] result = new String[names.length];

        for (int i = 0; i < heights.length; i++) {
            result[heights.length - 1 - i] = heightsNames.get(heights[i]);
        }

        return result;
    }
}
/*
Complexity Analysis:

Time Complexity: O(n log n)
Map population: O(n)
Sorting: O(n log n)
Filling the result array: O(n)

Space Complexity: O(n)
The map and the result array both use O(n) additional space.
*/