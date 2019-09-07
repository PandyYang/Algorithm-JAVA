package offer.solution20;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: Pandy
 * @Date: 2019/5/12 23:00
 * @Version 1.0
 * 滑动窗口的最大值
 */
//使用双向队列求出滑动窗口的最大值
public class Solution10 {
    public ArrayList<Integer> maxInWindows(int[] num,int size){
        ArrayList<Integer> res = new ArrayList();
        LinkedList<Integer> deque = new LinkedList();
        if (num.length == 0 || size == 0)
            return res;
        for (int i=0;i<num.length;i++){
            //
            if (!deque.isEmpty() && deque.peekFirst() <= i-size)
                deque.poll();
            //队列中末尾的值 小于即将进入队列中的值  直接将末尾的值进行移除
            while (!deque.isEmpty() && num[deque.peekLast()] < num[i])
                deque.removeLast();
            deque.offer(i);
            if (i+1 >= size)
                //最大值添加到数组中
                res.add(num[deque.peekFirst()]);
        }
        return res;
    }
}
