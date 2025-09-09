package org.example.arrays.firstMissingPositive;

import java.util.HashSet;
import java.util.Set;

public class HashSetApproach {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int i = 1; i < nums.length + 1; i++){
            if(!set.contains(i)){
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
