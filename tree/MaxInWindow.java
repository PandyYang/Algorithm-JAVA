package tree;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:34
 */
public class MaxInWindow {
    public ArrayList<Integer> maxInWindows(int[] num,int size){
        ArrayList<Integer> ret = new ArrayList<>();
        if (size>num.length || size < 1)
            return ret;
        //默认是小顶堆 重写方法 构造大顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2-o1));
        for (int i = 0;i < size;i++)
            heap.add(num[i]);
        ret.add(heap.peek());
        //维护一个执行大小的大顶堆 大顶堆中的值绝对是滑动窗口大小的最大值
        for (int i = 0,j=i+size;j<num.length;i++,j++){
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
