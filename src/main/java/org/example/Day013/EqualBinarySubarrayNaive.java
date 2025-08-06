package org.example.Day013;

public class EqualBinarySubarrayNaive {

    public void findMaxLength(int[] nums) {
        int maxLength = 0;

        for(int start = 0; start < nums.length; start++){
            int zeroCount = 0;
            int oneCount = 0;

            for(int end = start; end < nums.length; end++){
                if (nums[end] == 0){
                    zeroCount++;
                } else  oneCount++;

                System.out.println("Subarray [" + start + "..." + end + "] → zeroCount: " + zeroCount + ", oneCount: " + oneCount);

                if (zeroCount == oneCount){
                    int length = end - start + 1;
                    System.out.println("✅ Equal 0s and 1s → length = " + length);
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        System.out.println("🎯 Max length of subarray with equal 0s and 1s: " + maxLength);
    }

    public static void main(String[] args) {
        EqualBinarySubarrayNaive solution = new EqualBinarySubarrayNaive();
        int[] nums1 = {0,1,1,1,1,1,0,0,0};
        solution.findMaxLength(nums1);
    }
}
