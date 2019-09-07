package offer.solution20;

/**
 * @Author: Pandy
 * @Date: 2019/5/13 8:51
 * @Version 1.0
 * 反转单词顺序列
 */
public class Solution12 {
    public String reverseSentence(String str){
        if (str.trim().length()==0)
            return str;
        String[] temp = str.split(" ");
        String res = "";//定义初始元素 用来拼接
        //从后往前进行反转
        for (int i=temp.length-1;i>=0;i--){
            res += temp[i];
            if (i!=0)
                res+=" ";
        }
        return res;
    }
}
