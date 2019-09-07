package offer.Solution10;

/**
 * @Author: Pandy
 * @Date: 2019/5/11 9:15
 * @Version 1.0
 * 数值的整数次方
 */
public class Solution {
    public double Power(double base,int component){
        double result = 0.0;
        int n =component;
        if (component < 0){
            component = -component;
        }
        if (component == 0){
            return 1;
        }
        for (int i = 0; i<component; i++){
            result *= base;
        }
        return n < 0 ? 1/result : result;
    }
}
