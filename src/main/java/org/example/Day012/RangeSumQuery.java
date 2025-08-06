package org.example.Day012;

public class RangeSumQuery {

    private int[] prefixSum;

    public void NumArray(int[] nums) {
        prefixSum = new int[nums.length];

        if(nums.length == 0) return;

        prefixSum[0] = nums[0];

        for(int i = 1; i < nums.length; i ++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

    }

    public int sumRange(int left, int right) {

        if (left ==0){
            return prefixSum[right];
        }else {
            return prefixSum[right] - prefixSum[left-1];
        }

    }
}
