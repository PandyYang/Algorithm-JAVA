package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 14:51
 * 二叉树第k个节点,根据二叉树中序遍历有序的性质进行!
 */
public class TheKthNode {
    private TreeNode ret;
    private int cnt = 0;

    public TreeNode kthNode(TreeNode pRoot,int k){
        inOrder(pRoot,k);
        return ret;
    }
    private void inOrder(TreeNode root,int k){
        if (root == null || cnt >= k)
            return;
        inOrder(root.left,k);
        cnt++;
        if (cnt == k)
            ret = root;
        inOrder(root.right,k);
    }
}
