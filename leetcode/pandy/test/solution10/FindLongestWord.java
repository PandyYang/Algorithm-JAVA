package leetcode.pandy.test.solution10;

import java.util.List;

/**
 * @author Pandy
 * @version 1.0
 * @date 22:00
 */
public class FindLongestWord {
    public String find(String s, List<String> d){
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(),l2=target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }
            //子序列和每个target进行比较
            if (isSubstr(s,target)){
                longestWord = target;
            }
        }
        return longestWord;
    }
    //该方法返回s的一个子序列
    private boolean isSubstr(String s,String target){
        int i = 0,j = 0;
        while(i < s.length() && j < target.length()){
            //寻找匹配的序列长
            if (s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j ==  target.length();
    }
}