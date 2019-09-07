package Algorithm;

public class KMP {

    private int[] getNext(String pattern){
        char[] p = pattern.toCharArray();
        int[] next = new int[p.length];

        next[0] = -1;
        int i = 0;
        int j = -1;

        while(i < p.length -1){
            if (j == -1 || p[i] == p[j]){
                i++;
                j++;
                next[i] = j;
            }else{
                j = next[j];
            }
        }
        return next;
    }

    public int kmp(String t, String p) {
        char[] target = t.toCharArray();
        char[] pattern = p.toCharArray();
        //目标字符串下标
        int i = 0;
        //搜索词下标
        int j = 0;
        //整体右移一位的部分匹配表
        int[] next = getNext(pattern.toString());

        while (i < target.length || target[i] == pattern[j]) {
            if (j == -1 || target[i] == pattern[j]) {
                i++;
                j++;
                //匹配失败时,查询部分匹配表,得到搜索词的位置j以前的最大共同前后缀长度
                //将j移动到最大共同前后缀长度的后一位,然后再继续进行匹配
            } else {
                j = next[j];
            }
        }
        //搜索词的每一位都能匹配成功,返回匹配的起始位置
        if (j == pattern.length)
            return i - j;
        else
            return -1;
    }


}
