package string;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:36
 * 可以删除一个字符 判断是否能构成回文字符串
 */
public class ValidPalindrome {
    public boolean valid(String s){
        for (int i = 0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i) != s.charAt(j)){
                return valid(s,i,j-1) || valid(s,i+1,j);
            }
        }
        return true;
    }
    private boolean valid(String s,int i,int j){
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
