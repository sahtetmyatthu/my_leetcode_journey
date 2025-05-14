package org.example.Day003;

import java.util.HashSet;

/**
 * Function twoSum(nums, target):
 *     Create an empty HashMap called map
 *
 *     For each index i in the range of nums length:
 *         Compute complement = target - nums[i]
 *
 *         If complement exists in map:
 *             Return [map.get(complement), i] // Return indices of the two numbers
 *
 *         Store nums[i] in map with key as nums[i] and value as i
 *
 *     Throw an error "No solution found" if no such pair exists
 *
 * Main function:
 *     Define nums array = [2, 1, 3, 7, 11, 15]
 *     Define target = 9
 *
 *     Call twoSum(nums, target) and store the result in a variable
 *     Print the result
 */
public class PasswordSecurity {
    public static int  longestUniqueSubstring(String password){
        HashSet<Character> uniqueChars = new HashSet<>();
        int left = 0, maxLength = 0;

        System.out.println("\nChecking password: \"" + password + "\"");

        for (int right = 0; right < password.length(); right ++){
            char currentChar = password.charAt(right);
            System.out.println("\nChecking character '" + currentChar + "' at index " + right);

            // If duplicate is found, adjust the window
            while (uniqueChars.contains(currentChar)){
                System.out.println("Duplicate found! Removing: '" + password.charAt(left) + "' from set.");
                uniqueChars.remove(password.charAt(left));
                left++; // Move left pointer forward
            }

            // Add the new character to the set
            uniqueChars.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1); // Update max length

            // Debugging output
            System.out.println("Current unique substring: \""+ password.substring(left, right+1)+"\"");
            System.out.println("Current max unique length: "+ maxLength);
            System.out.println("Set contents: "+ uniqueChars);
        }
        System.out.println("\n Final max unique substring length for \""+ password+ "\": "+ maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        String password = "pwwkew";
        int strength = longestUniqueSubstring(password);

        System.out.println("\nPassword Strength Check:");
        if (strength < 5) {
            System.out.println("❌ Weak password! Try using more unique characters.");
        } else {
            System.out.println("✅ Strong password!");
        }
    }
}
