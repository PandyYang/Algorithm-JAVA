package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 14:56
 */
public class TreeDepth {
    public int treeDepth(TreeNode root){
        return root == null ? 0 : 1+Math.max(treeDepth(root.left),treeDepth(root.right));

    }
}
