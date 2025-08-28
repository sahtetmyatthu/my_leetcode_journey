package org.example.arrays.majorityElement;

import java.util.Arrays;

public class SortingMajorityElement {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
