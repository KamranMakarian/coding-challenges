package org.example;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        int totalValue = 0;
        int previousValue = 0;
        int currentValue = 0;

        HashMap<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);


        for (int i = s.length() - 1; i > -1; i--) {
            currentValue = valueMap.get(s.charAt(i));
            if (currentValue < previousValue) {
                totalValue -= currentValue;
            }
            else {
                totalValue += currentValue;
            }
            previousValue = currentValue;
        }
        return totalValue;
    }
}
// Time Complexity: O(n) -> Iterates through the s string once.
// Space Complexity: O(1) -> Uses only a few integer variables.
// Note: despite Python solution, here we do not need to reverse the s string.
//       In Java, strings support indexed access via charAt(i), enabling backwards iteration.
