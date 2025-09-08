package org.example.strings.isSubsequence;

public class DynamicProgramming {

    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m] == 0;
    }

    public static void main(String[] args) {

        // Test cases
        String s1 = "ace";
        String t1 = "abcde";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + isSubsequence(s1, t1)); // Expected: true



    }
}
