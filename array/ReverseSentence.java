package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 16:37
 */
public class ReverseSentence {
    public String reverseSentence(String str){
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0,j = 0;
        while (j <= n){
            if (j == n || chars[j] == ' '){
                reverse(chars,i,j-1);
                i = j+1;
            }
            j++;
        }
        reverse(chars,0,n-1);
        return new String(chars);
    }
    private void reverse(char[] c,int i,int j){
        while (i < j)
            swap(c,i++,j--);
    }
    private void swap(char[] c,int i,int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
