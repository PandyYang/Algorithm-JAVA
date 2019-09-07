package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:45
 */
public class MaxDepth {
    public int max(TreeNode root){
        return root == null ? 0 :Math.max(max(root.left),max(root.right)) +1;
    }
}
