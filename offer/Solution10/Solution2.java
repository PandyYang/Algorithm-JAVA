package offer.Solution10;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author: Pandy
 * @Date: 2019/5/11 10:06
 * @Version 1.0
 * O(1)时间复杂度删除栈中最小的元素
 */
public class Solution2 {
    Stack<Integer> stack = new Stack();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        Iterator<Integer> iterator = stack.iterator();
        int min1 =stack.peek();
        if (!stack.isEmpty()){
            Integer temp = stack.peek();
            if (min1 > temp){
                min1 = temp;
            }
        }
        return min1;
    }
}
