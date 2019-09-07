package leetcode.pandy.test.solution10;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:38
 * 给定字符串中最长的没有重复字符的的子串
 * 动规解
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        char[] sc = s.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        int j = 0,maxLen = 0;
        for (int i = 0; i < sc.length; i++) {
            char cur = sc[i];
            if (map.containsKey(cur)){
                maxLen = Math.max(i-j,maxLen);//i是当前字符出现位置 j是
                j = Math.max(j,map.get(cur)+1);//j 与上次 最长子串的位置长度 做对比
            }
        }
        return Math.max(sc.length-j,maxLen);
    }

    //使用滑动窗口
    public int lengthOfLongestSunstring(String s){
        if (s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
