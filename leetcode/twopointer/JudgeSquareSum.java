package leetcode.twopointer;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 12:43
 * @Version 1.0
 */
public class JudgeSquareSum {
    public boolean judge(int c){
        int i =0,j = (int)Math.sqrt(c);
        while (i<=j){
            int powSum = i*i+j*j;
            if (powSum == c)
                return true;
            else if(powSum>c)
                j--;
            else i++;
        }
        return false;
    }
}
