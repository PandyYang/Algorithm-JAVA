package string;

/**
 * @Author: Pandy
 * @Version 1.0
 * 找出字符串中的最长回文子串
 * 以某个元素为中心分别计算偶数长度的回文 和 奇数长度的回文最大长度
 */
public class LongestPalindrome2 {

    private int index, len;

    public String test(String s) {
        if (s.length() < 2)
            return s;
        for (int i = 0; i < s.length(); i++) {
            PalindromeHelper(s,i,i);
            PalindromeHelper(s,i,i+1);
        }
        return s.substring(index, index+len);
    }

    public void PalindromeHelper (String s,int l, int r){
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        if (len < r - l - 1) {
            index = l + 1;
            len = r - 1 - l;
        }
    }
}