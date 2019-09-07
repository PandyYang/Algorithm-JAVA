package string;

/**
 * @Author: Pandy
 * @Version 1.0
 * 最长回文子序列
 */
public class LongestPalindromeSubseq {
    public static String longestPalindrome(String s){
        int n = s.length();
        if (n == 0 || s== null)
            return s;
        String reString = null;
        boolean[][] dp = new boolean[n][n];
        for (int i = n-1; i >=0; i--) {
            for (int j = i;j<n;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j)&&(j-i < 3 ||dp[i+1][j-1]);
                if (dp[i][j] && (reString == null || reString.length() < j-i+1))
                    reString = s.substring(i,j+1);
            }
        }
        return reString;
    }
}
