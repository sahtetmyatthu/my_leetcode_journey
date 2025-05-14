package org.example.Day001;

import java.util.HashMap;

/**
 * 1. Create a HashMap to store numbers and their indices.
 * 2. Loop through the array:
 *    - Compute the complement (target - current number).
 *    - If the complement exists in the HashMap, return the indices.
 *    - Otherwise, store the current number and its index in the HashMap.
 * 3. If no solution is found, throw an error.
 */

public class TwoSum {
    public static int[] twoSum(int[] num, int target){

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < num.length; i++){
            int complement = target - num[i];// What number do we need?

            // If we already saw the complement, return the answer
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            // Store the current number and its index
            map.put(num[i], i);

        }

        throw  new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] num = {2,1,3,7,11,15};
        int target = 9;

        int[] result = twoSum(num, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
