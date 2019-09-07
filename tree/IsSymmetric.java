package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:38
 * 判断是否是对称二叉树
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){
        if (root == null)
            return true;
        return isSymmertric(root.left,root.right);
    }
    private boolean isSymmertric(TreeNode t1,TreeNode t2){
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
        return isSymmertric(t1.left,t2.right) && isSymmertric(t1.right,t2.left);
    }
}
