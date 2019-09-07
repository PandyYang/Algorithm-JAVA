package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pandy
 * @version 1.0
 * @date 9:38
 * 重建二叉树
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class ReConstructBinaryTree {
    private Map<Integer,Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstruct(int[] pre,int[] in){
        for (int i = 0;i<in.length;i++)
            indexForInOrders.put(in[i],i);
        return reConstruct(pre,0,pre.length-1,0);
    }
    private TreeNode reConstruct(int[] pre,int preL,int preR,int inL){
        if (preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstruct(pre,preL+1,preL+leftTreeSize,inL);
        root.right = reConstruct(pre,preL+leftTreeSize +1,preR,inL+leftTreeSize+1);
        return root;
    }
}
