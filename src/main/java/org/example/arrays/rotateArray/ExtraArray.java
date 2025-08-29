package org.example.arrays.rotateArray;

import java.util.Arrays;

public class ExtraArray {
    public static void rotate(int[] nums, int k) {
       int n = nums.length;
       int[] rotated = new int[n];
       k  = k % n;

       for(int i = 0; i < n; i++){
           rotated[(i + k) % n] = nums[i];
       }


       System.arraycopy(rotated, 0, nums, 0, n);

    }

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        System.out.println("Before rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotate(nums, k);

        System.out.println("After rotation by " + k + " steps:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
