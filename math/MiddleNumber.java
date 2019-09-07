package math;

import java.util.PriorityQueue;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:53
 * 数据流中的中位数
 */
public class MiddleNumber {
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2) -> o2-o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N = 0;
    public void insert(Integer val){
        if (N % 2 == 0){
            left.add(val);
            right.add(left.poll());
        }else{
            right.add(val);
            left.add(right.poll());
        }
        N++;
    }
    public Double GetMedian(){
        if (N % 2 == 0)
            return (left.peek() + right.peek())/2.0;
        else
            return Double.valueOf(right.peek());
    }
}
