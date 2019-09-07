package offer.Solution10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Pandy
 * @Date: 2019/5/12 9:01
 * @Version 1.0
 * 把数组排成最小的数
 */
public class Solution5 {
    public String printMinNum(int[] arr){
        if (arr.length == 0)
            return "";
        if (arr.length == 1){
            return String.valueOf(arr[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String str[] = new String[arr.length];
        for (int i = 0;i<arr.length;i++){
             str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 + o2;
                String c2 = o2 + o1;
                return c1.compareTo(c2);
            }
        });
        for (int i = 0;i<arr.length;i++)
            stringBuilder.append(str[i]);
        return stringBuilder.toString();
    }
}
