package math;

/**
 * @author Pandy
 * @version 1.0
 * @date 23:58
 * 计算阶乘
 */
public class Multiply {
    public static int multiply(int num){
        if (num < 0){
            System.out.println("请输入大于0的数!");
            return -1;
        }else if (num == 0 || num == 1){
            return 1;
        }else{
            return multiply(num-1) * num;
        }
    }

    public static void main(String[] args) {
        System.out.println(multiply(10));
    }
}
