package donggui;

/**
 * @author Pandy
 * @version 1.0
 * @date 9:53
 * 剪绳子 使每段的乘积最大
 */
public class IntegerBreak {
    public int integerBreak(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i<=n; i++){
            for (int j = 1;j<i;j++){
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
            }
        }
        return dp[n];
    }
}
