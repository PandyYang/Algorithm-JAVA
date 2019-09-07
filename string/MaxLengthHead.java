package string;

import java.util.Arrays;

/**
 * @Author: Pandy
 * @Version 1.0
 * 寻找字符串数组的最长公共前缀
 */
public class MaxLengthHead {
    public static String replaceSpace(String[] strs){
        int len = strs.length;
        StringBuffer res = new StringBuffer();
        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len-1].length();
        int num = Math.min(m,n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[len-1].charAt(i)){
                res.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return res.toString();
    }
    private static boolean checkStrs(String[] strs){
        boolean flag = false;
        if (strs!=null){
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null && strs[i].length() != 0){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
