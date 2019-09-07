package offer.solution20;

import java.util.LinkedList;

/**
 * @Author: Pandy
 * @Date: 2019/5/13 9:37
 * @Version 1.0
 * 圆圈中最后剩下的数
 */
public class Solution13 {
    public int LastRemaining(int n,int m){
        if (n < 1 || m <1)
            return -1;
        LinkedList<Integer> link = new LinkedList<>();
        //创建n个节点
        for (int i = 0; i < n; i++){
            link.add(i);
        }
        int index = -1;
        while (link.size() > 1){
            index = (index + m) % link.size();
            link.remove(index);
            index--;
        }
        return link.get(0);
    }
}
