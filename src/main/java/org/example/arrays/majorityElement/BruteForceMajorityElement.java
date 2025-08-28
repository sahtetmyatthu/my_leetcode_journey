package org.example.arrays.majorityElement;

public class BruteForceMajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int count = 0;
            // Count occurrences of nums[i]
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            // If count exceed n/2, nums[i] is the majority element
            if (count > n / 2) {
                return num;
            }
        }
        return -1; // Should never be reached if majority element assumption holds
    }

    public static void main(String[] args) {


        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result =majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}
