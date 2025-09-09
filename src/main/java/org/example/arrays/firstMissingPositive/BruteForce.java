package org.example.arrays.firstMissingPositive;

public class BruteForce {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 1; i <=n + 1 ; i++){
            boolean found = false;

            for(int num : nums){
                if(num == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

//        int[] nums1 = {1, 2, 0};
//        System.out.println("Missing positive in nums1: " + firstMissingPositive(nums1));
//
        int[] nums2 = {3, 4, -1, 1};
        System.out.println("Missing positive in nums2: " + firstMissingPositive(nums2));

//        int[] nums3 = {7, 8, 9, 11, 12};
//        System.out.println("Missing positive in nums3: " + firstMissingPositive(nums3));

    }
}
