package org.example.strings.longestCommonPrefix;

public class VerticalScanning {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0) return "";
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
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
