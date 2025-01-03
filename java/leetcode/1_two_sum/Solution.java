package org.example;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> nums_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (nums_map.containsKey(difference)) {
                return new int[] {nums_map.get(difference) , i};
            }
            nums_map.put(nums[i], i);
        }
        return null;
    }
}
