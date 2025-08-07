package org.example.Day013;

import java.util.HashMap;

public class EqualBinarySubarrayFast {
    public int findMaxLength(int[] nums) {
        // Step 1: Convert 0 to -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Base case: sum 0 before index 0

        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Index: " + i + ", Current number: " + nums[i] + ", Running sum: " + sum);

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int currentLength = i - prevIndex;
                System.out.println("  Sum " + sum + " seen before at index " + prevIndex + ". Subarray length: " + currentLength);

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    System.out.println("  New maxLength found: " + maxLength);
                }
            } else {
                map.put(sum, i);
                System.out.println("  First time sum " + sum + " encountered at index " + i);
            }
        }

        System.out.println("Final maxLength: " + maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        EqualBinarySubarrayFast solution = new EqualBinarySubarrayFast();
        int[] nums = {0, 1, 1, 0, 0};
        solution.findMaxLength(nums);
    }
}
