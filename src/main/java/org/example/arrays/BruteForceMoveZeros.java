package org.example.arrays;

// Time O(n)
// Space O(n)
public class BruteForceMoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int j = 0;

        // First pass: accumulate non-zero elements
        for (int num : nums) {
            if (num != 0) {
                result[j++] = num;
            }
        }

        // Second pass: fill remaining positions with zeros
        for(;j<n;j++){
            result[j]=0;
        }



        System.arraycopy(result, 0, nums, 0, n );
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moveZeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        moveZeroes(nums);

        System.out.println("\nAfter moveZeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
