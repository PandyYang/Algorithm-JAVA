package offer.Solution10;


/**
 * @Author: Pandy
 * @Date: 2019/5/12 22:40
 * @Version 1.0
 * 删除链表中的重复的节点
 */
public class Solution8 {
    class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode head = new ListNode(-1);
        head.next = pHead;



        ListNode first = head;
        ListNode second = first.next;
        while (second!=null){
            if (second.next!=null && second.val == second.next.val){
                while (second.next != null && second.val == second.next.val){
                    second = second.next;
                }
                first.next = second.next;
            }else {
                first = first.next;
            }
            second = second.next;
        }
        return head.next;
    }
}
