package list;

/**
 * @Author: Pandy
 * @Version 1.0
 * 两数相加
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1,q = l2,curr = dummyHead;//设立哑节点为了防止头结点为空
        //carry表示进位
        int carry = 0;
        while (p!=null || q!=null){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = carry+x+y;
            carry = carry / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            if (carry > 0 )
                curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
