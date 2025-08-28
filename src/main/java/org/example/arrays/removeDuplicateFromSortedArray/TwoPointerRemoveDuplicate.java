package org.example.arrays.removeDuplicateFromSortedArray;

import java.util.Arrays;

public class TwoPointerRemoveDuplicate {

    public static int removeDuplicate(int[] nums) {
        if(nums.length  == 0)return 0;

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2};
        int length = removeDuplicate(nums);


        System.out.println("Length of unique elements: " + length);
        System.out.println("Array after removing duplicates: "
                + Arrays.toString(Arrays.copyOf(nums, length)));
    }
}
