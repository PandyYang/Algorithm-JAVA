package list;

/**
 * @Author: Pandy
 * @Version 1.0
 * 反转链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head){
        ListNode next = null;
        ListNode pre = null;

        while (head != null){
            next = head.next;
            //将当前节点的后一个节点指向前一个节点
            head.next = pre;
            //将前一个节点指向当前节点
            pre = head;
            //将当前节点指向后一个节点
            head = next;
        }
        return pre;
    }
}
