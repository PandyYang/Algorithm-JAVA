package offer.Solution10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Pandy
 * @Date: 2019/5/11 10:20
 * @Version 1.0
 * 最小的k个数
 */
public class Solution3 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (k>length || k==0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0;i<length;i++){
            if (maxHeap.size()!=k){
                maxHeap.offer(input[i]);
            }else if (maxHeap.peek() > input[i]){
                Integer temp = maxHeap.poll();//注意是poll 是从队首获取元素
                temp = null;
                maxHeap.add(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }
}
