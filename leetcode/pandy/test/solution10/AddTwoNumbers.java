package leetcode.pandy.test.solution10;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:16
 * 两个链表相加返回新的链表 考虑进位
 */

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = next;
    }
}
public class AddTwoNumbers {
    public ListNode add(ListNode l1,ListNode l2){
        int carry = 0;
        ListNode lResult = new ListNode(0);
        ListNode lPointer = lResult;
        while(l1 != null || l2 != null){
            int n1 = 0,n2 = 0;
            if (l1 != null){
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                n2 = l2.val;
                l2 = l2.next;
            }
            int temp = n1 + n2 + carry;
            carry = temp/10;//进位
            temp %= 10;     //显示的值
            lPointer.next = new ListNode(temp);
            lPointer = lPointer.next;
        }
        if (carry > 0){
            lPointer.next = new ListNode(carry);
        }
        return lResult.next;
    }
}
