package org.example.arrays.increaseTripletSeq;

public class BruteForce {

    public static boolean increasingTriplet(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n-1; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i]< nums[j] && nums[j] < nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};   // has triplet
        int[] nums2 = {5, 4, 3, 2, 1};   // no triplet
        int[] nums3 = {2, 1, 5, 0, 4, 6}; // has triplet (1, 4, 6)

        System.out.println("nums1 -> " + increasingTriplet(nums1)); // true
        System.out.println("nums2 -> " + increasingTriplet(nums2)); // false
        System.out.println("nums3 -> " + increasingTriplet(nums3)); // true
    }
}
