package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 14:59
 * 平衡二叉树 左右深度不超过1
 */
public class Is_Balanced_Solution {
    private boolean isBanlanced = true;
    public boolean isBalance(TreeNode root){
        height(root);
        return isBanlanced;
    }
    private int height(TreeNode root){
        if (root == null || !isBanlanced){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            isBanlanced = false;
        return 1+Math.max(left,right);
    }
}
