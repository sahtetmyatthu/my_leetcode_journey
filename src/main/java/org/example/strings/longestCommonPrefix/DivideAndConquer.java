package org.example.strings.longestCommonPrefix;

public class DivideAndConquer {

  public static String longestCommonPrefix(String[] strs) {
      if(strs == null || strs.length == 0) return "";
      return longestCommonPrefix(strs, 0, strs.length - 1);
  }

  private static String longestCommonPrefix(String[] strs, int l, int r) {
      if(l == r){
          return strs[l];
      } else {
          int mid = (l+r )/2;
          String lcpLeft = longestCommonPrefix(strs, l, mid);
          String lcpRight = longestCommonPrefix(strs, mid + 1, r);
          return commonPrefix(lcpLeft, lcpRight);
      }

  }

    private static String commonPrefix(String lcpLeft, String lcpRight) {

      int min = Math.min(lcpLeft.length(), lcpRight.length());
      for(int i = 0; i < min; i++){
          if(lcpLeft.charAt(i) != lcpRight.charAt(i)){
              return lcpLeft.substring(0, i);
          }
      }
      return lcpLeft.substring(0, min);
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
