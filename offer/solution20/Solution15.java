package offer.solution20;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Pandy
 * @Date: 2019/5/13 14:26
 * @Version 1.0
 * 获取数据流中的中位数
 * 最大堆装左边的数据，取出堆顶（最大的数）的时间复杂度是O(1)
 * 最小堆装右边的数据，同样，取出堆顶（最小的数）的时间复杂度是O(1)
 *
 */
public class Solution15 {
    //最小堆
    private PriorityQueue<Integer> rHeap = new PriorityQueue<>();
    //最大堆
    private PriorityQueue<Integer> lHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    });

    public void insert(Integer num){
        if (lHeap.isEmpty() || num < lHeap.peek()){
            lHeap.offer(num);
        }else {
            rHeap.offer(num);
        }
    }

}
