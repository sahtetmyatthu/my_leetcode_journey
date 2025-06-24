package org.example.Day012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        System.out.println("--- Starting threeSum Debug ---");
        System.out.println("Initial nums: " + Arrays.toString(nums));

        // Step 1: Sort the array
        Arrays.sort(nums);
        System.out.println("After sorting nums: " + Arrays.toString(nums));

        // Step 2: Iterate over the first element
        for (int i =0; i < n - 2 ; i++){
            System.out.println("\n--- Outer loop: i = " + i + " (nums[i] = " + nums[i] + ") ---");

            // Skip duplicates for i
            if(i > 0 && nums[i] == nums[i-1]){
                System.out.println("Skipping duplicate i: nums[" + i + "] (" + nums[i] + ") == nums[" + (i - 1) + "] (" + nums[i - 1] + ")");
                continue;
            }

            // Step 3: Two-pointer technique
            int left = i + 1;
            int right = n  - 1;
            int target = -nums[i];
            System.out.println("  Initial left = " + left + ", right = " + right + ", target = " + target);


        }

    }
}
