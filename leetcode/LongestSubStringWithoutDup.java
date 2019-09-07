package leetcode;

import java.util.LinkedList;

/**
 * @Author: Pandy
 * @Date: 2019/5/14 21:28
 * @Version 1.0
 * 无重复字符的最长的子串
 */
public class LongestSubStringWithoutDup {
    public static int maxLength(String str){
        if (str == null || str.length() <= 0){
            return 0;
        }
        int num = 0;
        int current = 0;
        char[] arr = str.toCharArray();
        LinkedList<Character> temp = new LinkedList<>();

        for (int i = 0;i<arr.length;i++){
            if (!temp.contains(arr[i])){
                temp.add(arr[i]);
                current=temp.size();
                if (current > num)
                    num =current;
            }else {
                temp.add(arr[i]);
                int first = temp.indexOf(arr[i]);
                for (int j = 0;j<first;j++)
                    temp.remove();//移走最开始的数字
                temp.remove();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "abcdeabcdef";
        int i = LongestSubStringWithoutDup.maxLength(s);
        System.out.println("i = " + i);
    }
}
