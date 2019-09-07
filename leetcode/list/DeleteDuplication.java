package leetcode.list;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:
 * 删除链表中重复的节点
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        if (head.val == next.val){
            while (next!=null && head.val == next.val){
                next = next.next;
            }
            return deleteDuplication(next);
        }else{
            head.next = deleteDuplication(head);
        }
        return head;
    }
}
