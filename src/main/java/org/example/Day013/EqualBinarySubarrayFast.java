package org.example.Day013;

import java.util.HashMap;

public class EqualBinarySubarrayFast {
    public int findMaxLength(int[] nums) {


        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLength = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1 )? 1: -1;

            if(map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int currentLength = i - prevIndex;

                if(currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                map.put(sum, i);
            }

        }

        return maxLength;


    }

    public static void main(String[] args) {
        EqualBinarySubarrayFast solver = new EqualBinarySubarrayFast();
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        int result = solver.findMaxLength(nums);
        System.out.println("\nFinal maxLength: " + result);
    }
}
