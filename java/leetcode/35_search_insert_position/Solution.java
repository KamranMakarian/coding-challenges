package org.example;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        if (target < nums[0]) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoids overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
// Time complexity: O(log n)
// Space complexity: O(1)
