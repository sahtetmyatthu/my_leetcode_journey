package org.example.strings.longestCommonPrefix;

import java.net.Inet4Address;

public class BinarySearch {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for(String s: strs){
            minLen = Math.min(minLen, s.length());
        }

        int low = 1;
        int high = minLen;
        while(low <= high){
            int middle = (low + high)/2;
            if(isCommonPrefix(strs, middle)){
                low = middle+1;
            }else {
                high = middle-1;
            }
        }

        return strs[0].substring(0, (low+high)/2);


    }

    private static boolean isCommonPrefix(String[] strs, int length){
        String str1 = strs[0].substring(0, length);
        for(int i = 1; i < strs.length; i++){
            if(!strs[i].startsWith(str1)){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        String[] test1 = {"flow", "flower", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        String[] test4 = {"a"};
        String[] test5 = {"apple", "app", "application"};

        System.out.println(java.util.Arrays.toString(test1) + " -> " + longestCommonPrefix(test1));
//        System.out.println(java.util.Arrays.toString(test2) + " -> " + longestCommonPrefix(test2));
//        System.out.println(java.util.Arrays.toString(test3) + " -> " + longestCommonPrefix(test3));
//        System.out.println(java.util.Arrays.toString(test4) + " -> " + longestCommonPrefix(test4));
//        System.out.println(java.util.Arrays.toString(test5) + " -> " + longestCommonPrefix(test5));
    }
}
