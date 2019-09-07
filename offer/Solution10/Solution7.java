package offer.Solution10;

import java.util.HashMap;

/**
 * @Author: Pandy
 * @Date: 2019/5/12 9:32
 * @Version 1.0
 *第一个只出现一次的字符
 */
public class Solution7 {
    public int firstNotRepeatChar(String str){
        int len = str.length();
        if (len == 0)
            return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i= 0;i<len;i++){
            if (map.containsKey(str.charAt(i))){
                int value= map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0;i<len;i++){
            if (map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
