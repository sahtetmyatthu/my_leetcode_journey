package org.example.arrays.productOfArrayExceptSelf;

public class OptimizedWithSinglePass {

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] output = new  int[n];

        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
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
