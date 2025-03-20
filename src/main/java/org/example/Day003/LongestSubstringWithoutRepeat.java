package org.example.Day003;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // Stores unique characters
        int left = 0, maxLength = 0;

        System.out.println("Processing string: \"" + s + "\"");

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            System.out.println("\nChecking character: " + currentChar + " at index " + right);

            // If duplicate is found, shrink the window
            while (set.contains(currentChar)) {
                System.out.println("Duplicate found! Removing: " + s.charAt(left) + " from set.");
                set.remove(s.charAt(left));
                left++; // Move left pointer forward
            }

            set.add(currentChar); // Add new character to the set
            maxLength = Math.max(maxLength, right - left + 1); // Update max length

            // Debugging print
            System.out.println("Current substring window: \"" + s.substring(left, right + 1) + "\"");
            System.out.println("Current maxLength: " + maxLength);
            System.out.println("Set contents: " + set);
        }

        System.out.println("\nFinal max length for \"" + s + "\": " + maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("\n--- Test Case 1 ---");
        lengthOfLongestSubstring("abcabcbb");// Expected Output: 3

//        System.out.println("\n--- Test Case 2 ---");
//        lengthOfLongestSubstring("bbbbb");    // Expected Output: 1
//
//        System.out.println("\n--- Test Case 3 ---");
//        lengthOfLongestSubstring("pwwkew");   // Expected Output: 3
    }
}