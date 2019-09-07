package donggui;

import java.util.Scanner;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:18
 */
public class GetCommonStrLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str1 = scanner.nextLine().toLowerCase();
            String str2 = scanner.nextLine().toLowerCase();
            System.out.println(test(str1,str2));
        }
    }

    private static int test(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 0;i <= len1; i++){
            for (int j = 0;j <= len2; j++){
                dp[i][j] = 0;
            }
        }

        for (int i =1;i<=len1;i++){
            for (int j = 1;j<=len2;j++){
                if (str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i <= len1; i++){
            for (int j = 0;j <= len2; j++){
                if (dp[i][j] > max){
                    max= dp[i][j];
                    index = i;
                }
            }
        }
        System.out.println(str1.substring(index - max,index));
        return max;
    }
}
