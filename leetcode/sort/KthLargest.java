package leetcode.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 13:05
 * @Version 1.0
 * 找到第k大的元素
 */
public class KthLargest {
    /**
     * 底层使用了双轴快排算法
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    /**
     * 优先队列底层使用了堆排序
     */
    public int findKthLargest1(int[] nums,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
    /**
     * 快速排序
     */
    public int findKthLargest2(int[] arr,int k){
        k = arr.length-k;
        int low = 0,high = arr.length-1;
        while (low < high){
            int j = partition(arr,low,high);
            if (j==k){
                break;
            }else if (j < k){
                low = j + 1;
            }else {
                high = j-1;
            }
        }
        return arr[k];
    }

    private int partition(int[] a,int low,int high){
        int i = low,j = high+1;
        while (true){
            while (a[++i] < a[low] && i<high);
            while (a[--j]>a[low] && j>low);
            if (i>=j){
                break;
            }
            swap(a,i,j);
        }
        swap(a,low,j);
        return j;
    }

    private void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
