package offer.solution20;

/**
 * @Author: Pandy
 * @Date: 2019/5/13 9:48
 * @Version 1.0
 */
public class Solution14 {

    class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode entryNodeofloop(ListNode phead){
        if (phead.next == null || phead.next.next == null)
            return null;
        ListNode slow = phead.next;
        ListNode fast = phead.next.next;

        while (fast != null){
            //快慢指针第一次相遇之后
            if (fast == slow) {
                fast = phead;//其中的一个指针再次指向头结点
                while (fast != slow) {//两者向后移动再次相遇时
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;//即为环形入口
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
