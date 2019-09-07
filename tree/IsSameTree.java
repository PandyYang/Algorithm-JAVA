package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:35
 * 判断两个数是否相同
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null && q==null)
            return true;
        if (p!=null && q!=null &&p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
