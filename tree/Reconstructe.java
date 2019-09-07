package tree;

/**
 * @author Pandy
 * @version 1.0
 * @date 14:30
 */
public class Reconstructe {
    public static TreeNode reconstruct(int[] preOrder,int[] inOrder){
        if (preOrder == null || inOrder == null || preOrder.length == 0 || inOrder.length == 0 || preOrder.length == inOrder.length){
            return null;
        }
        //二叉树的根节点
        TreeNode root = new TreeNode(preOrder[0]);
        root.setLeft(null);
        root.setRight(null);

        //左子树的个数
        int leftNum = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (root.getVal() == inOrder[i])
                break;
            else
                leftNum++;
        }
        //右子树的个数
        int rightNum = inOrder.length-1-leftNum;

        //重建左子树
        if (leftNum > 0){
            //左子树的先序序列
            int[] leftPreOrder = new int[leftNum];
            //左子树的中序序列
            int[] leftInOrder = new int[leftNum];
            for (int i = 0;i<leftNum;i++){
                leftPreOrder[i] = preOrder[i+1];
                leftInOrder[i] = inOrder[i];
            }
            TreeNode leftRoot = reconstruct(leftPreOrder,leftInOrder);
            root.setLeft(leftRoot);
        }
        //重建右子树
        if (rightNum > 0){
            int[] rightPreOrder = new int[rightNum];
            int[] rightInOrder = new int[rightNum];
            for (int i = 0; i < rightNum; i++) {
                rightPreOrder[i] = preOrder[leftNum +1 +i];
                rightInOrder[i] = inOrder[leftNum +1 +i];
            }
            TreeNode rightRoot = reconstruct(rightPreOrder,rightInOrder);
            root.setRight(rightRoot);
        }
        return root;
    }
    public static void printPostOrder(TreeNode root){
        if (root == null){
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.println(root.getVal());
        }
    }
}
