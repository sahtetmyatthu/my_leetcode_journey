package org.example.strings.isSubsequence;

import java.util.Arrays;

public class DynamicProgramming {

    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }

            // Print the DP table after each row
            System.out.println("After filling row " + i + " (s[0.." + (i-1) + "]):");
            printDP(dp, n, m);
            System.out.println();
        }

        return dp[n][m] == n;
    }

    // Helper method to print the DP table
    private static void printDP(int[][] dp, int n, int m) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test case
        String s1 = "ace";
        String t1 = "abcde";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? "
                + isSubsequence(s1, t1)); // Expected: true
    }
}
