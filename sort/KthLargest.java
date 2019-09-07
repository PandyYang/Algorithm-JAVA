package sort;

import java.util.PriorityQueue;

/**
 * @Author: Pandy
 * @Version 1.0
 * 找出数据流中的第k大的元素
 * 使用小顶堆实现 因为堆的容量是k 所以堆顶永远都是第
 * k大的元素 与添加的元素进行对比 比堆顶元素大 那么入堆继续进行
 * 排序并对比
 */
public class KthLargest {
    public PriorityQueue<Integer> queue;
    public final int k;
    public KthLargest(int k,int[] nums){
        queue = new PriorityQueue<>(k);
        this.k = k;
        for (int num : nums) {
            if (queue.size() < k){
                queue.add(num);
            }else {
                if (num > queue.peek()){
                    queue.poll();
                    queue.add(num);
                }
            }
        }
    }
    public int add(int val){
        if (queue.size() < k){
            queue.add(val);
        }else if (val > queue.peek()){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}
