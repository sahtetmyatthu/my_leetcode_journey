package org.example.arrays.majorityElement;

public class BoyerMooreVoating {

    public static int majorityElement(int[] nums) {


        int candidate = nums[0];
        int count = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;

    }


    public static void main(String[] args) {


        int[] nums = {2, 2, 1, 1, 1, 2, 1};

        int result =majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}
