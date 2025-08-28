package org.example.arrays.majorityElement;

import java.util.HashMap;

public class HashMapMajorityElement {

    public static int majorityElement(int[] nums) {

       HashMap<Integer,Integer> countMap=new HashMap<>();
       int n=nums.length;

       for(int num: nums){
           countMap.put(num, countMap.getOrDefault(num, 0) + 1);
           if(countMap.get(num)>n/2){
               return num;
           }
       }
        return -1;
    }

    public static void main(String[] args) {


        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result =majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}
