package math;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:32
 * 判断一个数是否为两个数的平方和
 */
public class JudgeSquareSum {
    public boolean judgeSquareSum(int c){
        int i = 0,j = (int) Math.sqrt(c);
        while (i < j){
            int powSum = i * i + j * j;
            if (powSum == c)
                return true;
            else if (powSum > c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
