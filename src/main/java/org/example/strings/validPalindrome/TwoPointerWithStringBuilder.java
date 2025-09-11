package org.example.strings.validPalindrome;

public class TwoPointerWithStringBuilder {
    public static boolean isPalindrome(String s) {
     StringBuilder cleaned = new StringBuilder();
     for(char c : s.toCharArray()) {
         if(Character.isLetterOrDigit(Character.toLowerCase(c))) {
             cleaned.append(c);

         }
     }
     int left = 0;
     int right = cleaned.length()-1;
     while(left<=right){
         if(cleaned.charAt(left)!=cleaned.charAt(right)){
             return false;
         }
         left++;
         right--;
     }
     return true;
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "Madam";

        System.out.println(test1 + " -> " + isPalindrome(test1));
        System.out.println(test2 + " -> " + isPalindrome(test2));
        System.out.println(test3 + " -> " + isPalindrome(test3));
    }
}
