package leetcode.pandy.test.solution10;

import java.util.Scanner;

/**
 * @author Pandy
 * @version 1.0
 * @date 22:46
 * 可以删除一个字符判断能否构成回文串
 */
public class ValidPalindrome {
    public boolean test(String s){
        for (int i =0, j = s.length()-1;i<j;i++,j--){
            if (s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
        }
        return true;
    }
    private boolean isPalindrome(String s,int i,int j){
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static boolean test(int[] arr){
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            while (0<i+index && i+index <arr.length){
                if (i > 0){
                    index = arr[i];
                    arr[i] = arr[i - index];
                }else {
                    index = arr[Math.abs(i)];
                    arr[i] = arr[i + index];
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().replace("[","").replace("]","").split(",");
        int[] data = new int[str.length];
        for (int i = 0;i<data.length;i++){
            data[i] = Integer.parseInt(str[i]);
        }
        int i = 0;
        int temp = 0;
        while(true){
            if (i<0 || i>= data.length){
                System.out.println(true);
                return;
            }else if (data[i] == Integer.MAX_VALUE){
                System.out.println(false);
                return;
            }else{
                temp = data[i];
                data[i] = Integer.MAX_VALUE;
                i+=temp;
            }
        }
    }

    public static void fun(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strNumber = str.substring(1, str.length() - 1).split(",");
        int[] number = new int[strNumber.length];
        for (int i = 0;i<strNumber.length;i++){
            number[i] = Integer.parseInt(strNumber[i]);
        }
        int index = 0,count = 0;
        while (count <= number.length){
            count++;
            index+=number[index];//跳跃
            if (index < 0 || index >= number.length){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
