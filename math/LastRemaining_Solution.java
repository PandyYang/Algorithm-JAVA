package math;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:58
 * 约瑟夫环问题
 */
public class LastRemaining_Solution {
    public int test(int n,int m){
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        return (test(n-1,m) + m)/n;
    }
}
