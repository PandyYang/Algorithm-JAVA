package leetcode.list;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:40
 */
public class FindKthToTail {
    public ListNode findKth(ListNode head,int k){
        if (head == null)
            return null;
        ListNode p1 = head;
        //k1先移动k个位置
        while (p1 != null && k-->0)
            p1 = p1.next;
        //当p1 到达了链表尾部
        if (k > 0)
            return null;
        ListNode p2 = head;
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
