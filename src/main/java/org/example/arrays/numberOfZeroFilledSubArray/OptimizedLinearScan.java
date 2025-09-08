package org.example.arrays.numberOfZeroFilledSubArray;

public class OptimizedLinearScan {

    public static long zeroFilledSubArray(int[] nums) {
        long result = 0;
        int zeroCount = 0;

        for(int num : nums){
            if(num == 0){
                zeroCount++;
            }else {
                result += zeroCount * (zeroCount + 1L) / 2;
                zeroCount = 0;
            }
        }

        result += zeroCount * (zeroCount + 1L) / 2;

        return result;
    }

    public static void main(String[] args) {
      // int[] nums1 = {0, 0, 0};
       int[] nums2 = {1, 3, 0, 0, 2, 0, 0, 4};

       // System.out.println("Result 1: " + zeroFilledSubArray(nums1)); // Expected 6
       System.out.println("Result 2: " + zeroFilledSubArray(nums2)); // Expected 6
    }
}
