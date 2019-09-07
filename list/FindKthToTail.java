package list;

/**
 * @Author: Pandy
 * @Version 1.0
 * 链表倒数第k个节点
 * 使用快慢指针
 * 首先两个节点/指针，一个节点 node1 先开始跑，
 * 指针 node1 跑到 k-1 个节点后，另一个节点 node2 开始跑，
 * 当 node1 跑到最后时，node2 所指的节点就是倒数第k个节点也就是正数第(L-K+1)个节点。
 */
public class FindKthToTail {
    public ListNode test(ListNode head,int k){
        if (head == null ||k < 0){
            return null;
        }
        ListNode node1 = head,node2 = head;
        int count = 0;
        int index = k;
        while (node1 != null){//k-1跑完 node2停在l-k+1位置 也就是倒数第k个节点
            node1 = node1.next;
            count ++;
            if (k < 1){//先跑k-1个节点
                node2 = node2.next;
            }
            k--;
        }
        //节点个数小于所求的倒数第k个节点
        if (count < index){
            return null;
        }
        return node2;
    }
}
