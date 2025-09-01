package org.example.arrays.productOfArrayExceptSelf;

public class BruteForce {
    public static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int [] output = new int[n];

      for(int i = 0; i < n; i++){
          output[i] = 1;
          for(int j = 0; j < n; j++){
              if(i != j){
                  output[i] *= nums[j];
              }
          }
      }
      return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
