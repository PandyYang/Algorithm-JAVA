package math;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:01
 */
public class NumberOf1 {
    public int numOf1(int n){
        int cnt = 0;
        while (n != 0){
            cnt++;
            n &= (n-1);
        }
        return cnt;
    }

    public int NumOf1_2(int n){
        return Integer.bitCount(n);
    }
}
