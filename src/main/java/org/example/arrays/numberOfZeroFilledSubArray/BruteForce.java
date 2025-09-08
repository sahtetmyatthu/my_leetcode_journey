package org.example.arrays.numberOfZeroFilledSubArray;

public class BruteForce {

    public static long zeroFilledSubArray(int[] nums) {
       long count = 0;
       int n = nums.length;
       for(int i = 0 ; i < n ; i++){
           for(int j = i; j < n && nums[j] == 0; j++){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 3, 0, 0, 2, 0, 0, 4};

        System.out.println("Result 1: " + zeroFilledSubArray(nums1)); // Expected 6
//        System.out.println("Result 2: " + zeroFilledSubArray(nums2)); // Expected 6
    }
}

