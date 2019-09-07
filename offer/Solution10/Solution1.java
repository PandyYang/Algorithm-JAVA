package offer.Solution10;

/**
 * @Author: Pandy
 * @Date: 2019/5/11 9:48
 * @Version 1.0
 * 合并两个有序的链表
 */
public class Solution1 {

    class ListNode {
        int val;
        ListNode next;
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = null;
        head.next = null;
        ListNode root = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null){
            head.next = list1;
        }
        if (list2!=null){
            head.next = list2;
        }
        return root.next;
    }
}