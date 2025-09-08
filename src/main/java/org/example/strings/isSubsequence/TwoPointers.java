package org.example.strings.isSubsequence;

public class TwoPointers {

    public static boolean isSubsequence(String s, String t) {
       int i = 0, j = 0;
       while(i <s.length() && j < t.length()) {
           if(s.charAt(i) == t.charAt(j)) {
               i++;
           }
           j++;
       }
       return i == s.length();
    }

    public static void main(String[] args) {

        // Test cases
        String s1 = "ace";
        String t1 = "abcde";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + isSubsequence(s1, t1)); // Expected: true



    }
}
