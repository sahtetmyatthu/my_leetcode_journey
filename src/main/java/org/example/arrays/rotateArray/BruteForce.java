package org.example.arrays.rotateArray;

public class BruteForce {

    public static void rotate(int[] nums, int k){

      int n = nums.length;

      k = k % n;

      for (int i = 0; i < k; i++) {
          int previous = nums[n-1];

          for(int j = n-1; j > 0; j--){
              nums[j] = nums[j-1];
          }
          nums[0] = previous;
      }
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
