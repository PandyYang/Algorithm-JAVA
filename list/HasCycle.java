package list;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:49
 */
public class HasCycle {
    public boolean hasCycle(ListNode head){
        if (head == null)
            return false;
        ListNode l1 = head,l2=head.next;
        while (l1!=null && l2!=null && l2.next !=null){
            if (l1 == l2){
                return true;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return false;
    }
}
