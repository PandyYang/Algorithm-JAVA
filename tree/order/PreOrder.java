package tree.order;



/**
 * @author Pandy
 * @version 1.0
 * @date 10:02
 */
public class PreOrder {
    public void preorder(TreeNode root){
        if (root == null) return;
        preorder(root);
        preorder(root.left);
        preorder(root.right);
    }
}
