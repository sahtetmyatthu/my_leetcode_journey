package org.example.strings.longestCommonPrefix;

public class HorizontalScanning {

    public static String longestCommonPrefix(String[] strs) {
      if(strs == null || strs.length == 0) return "";

      String prefix = strs[0];
      for(int i = 1; i < strs.length; i++) {
          while(strs[i].indexOf(prefix) != 0) {
              prefix = prefix.substring(0, prefix.length()-1);
              if(prefix.isEmpty()) return "";
          }
      }
      return prefix;
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
