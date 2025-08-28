package org.example.arrays.moveZeros;

public class OptimizedInPlaceMoveZeros {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 3, 12};

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

    public static void moveZeroes(int[] nums) {
        int lastZeroPositions = 0;

        for(int current = 0; current < nums.length; current++){
            if(nums[current] != 0){
                int temp = nums[lastZeroPositions];
                nums[lastZeroPositions] = nums[current];
                nums[current] = temp;
                lastZeroPositions++;

            }
        }
    }
}
