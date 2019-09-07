package tree.order;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:40
 */
public class InOrder {
    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur!=null || !stack.isEmpty()){
            if (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
}
