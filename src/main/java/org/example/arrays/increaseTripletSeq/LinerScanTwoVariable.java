package org.example.arrays.increaseTripletSeq;

public class LinerScanTwoVariable {

    public static boolean increasingTriplet(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= first){
                first = num;
            } else if(num <= second){
                second = num;
            } else{
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 4, 5};   // has triplet
//        int[] nums2 = {5, 4, 3, 2, 1};   // no triplet
        int[] nums3 = {2, 1, 5, 0, 4, 6}; // has triplet (1, 4, 6)

//        System.out.println("nums1 -> " + increasingTriplet(nums1)); // true
//        System.out.println("nums2 -> " + increasingTriplet(nums2)); // false
        System.out.println("nums3 -> " + increasingTriplet(nums3)); // true
    }

}
