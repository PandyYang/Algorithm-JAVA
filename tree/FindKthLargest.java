package tree;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:51
 * 倒数第k大的元素
 */
public class FindKthLargest {
    public int find(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();//小顶堆
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
    //
    public int find2(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
