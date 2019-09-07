package leetcode.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:02
 * 链表是否有环
 */
public class IsCycle {
    /**
     * 方法1,使用双指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    /**
     * 方法2使用哈希表
     *  哈希值重复 则说明有环
     */
    public boolean hasCycle2(ListNode head){
        Set demoset = new HashSet<String>();
        while(head!=null){
            if (demoset.contains(head))
                return true;
            else
                demoset.add(head);
            head = head.next;
        }
        return false;
    }
}
