package offer.Solution10;

/**
 * @Author: Pandy
 * @Date: 2019/5/12 22:50
 * @Version 1.0
 * 给定一个二叉树其中的一个节点
 * 找出中序遍历的下一个节点并且返回
 */


/**
 * 如果当前节点为空，直接返回空；
 * 如果当前节点有右子树，则返回右子树的最左子树；
 * 如果当前节点没有右子树，再分两种情况：
 * 看看当前节点是不是它的父节点的左子树，如果是，则返回它的父节点；
 * 如果当前节点不是它的父节点的左子树，则把父节点赋给当前节点，
 * 再判断当前节点是不是它的父节点的左子树，
 * 直到当前节点是不是它的父节点的左子树，返回它的父节点。
 */
public class Solution9 {
    class TreeLinkNode{
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        public TreeLinkNode(int val) {
            this.val = val;
        }
    }


    public TreeLinkNode getNext(TreeLinkNode pNode){
        //如果当前节点是空  直接返回空
        if (pNode == null)
            return null;
        //如果当前节点有右子树 则返回右子树的最左子树
        if (pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left!=null){
                node = node.left;
            }
            return node;
        }
        //如果当前节点没有右子树
        while (pNode.next != null){
            TreeLinkNode root = pNode.next;
            //看看当前节点是不是父节点的左子树 如果是返回父节点
            if (pNode == root.left)
                return root;
            pNode = root;
        }
        return null;
    }
}
