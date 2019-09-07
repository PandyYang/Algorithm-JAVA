package leetcode.list;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:06
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head,ListNode tobeDelete){
        if (head == null || tobeDelete == null){
            return null;
        }
        //删除的节点不是尾节点
        if (tobeDelete.next != null){
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        }else{
            if (head == tobeDelete)
                head = null;
            else{
                ListNode cur = head;
                while (cur.next!=tobeDelete){
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
        return head;
    }
}
