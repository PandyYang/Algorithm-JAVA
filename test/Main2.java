package test;

import java.util.Scanner;

/**
 * @author Pandy
 * @version 1.0
 * @date 14:56
 */

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int value){
        this.value = value;
    }
}

public class Main2 {
    public static BinaryTreeNode test(int[] preOrder,int[] inOrder,int prestart,int preend,int instart,int inend){
        int rootValue = preOrder[prestart];
        BinaryTreeNode root = new BinaryTreeNode(rootValue);

        int rootinorder = instart;
        for (int i = instart;i<=inend;i++){
            if (rootValue == inOrder[i]){
                rootinorder = i;
                break;
            }
            if (i == inend && rootValue!=inOrder[i]){
                break;
            }
        }
        int leftlen = rootinorder - instart;
        int leftprelen = prestart + leftlen;
        if (rootinorder > instart){
            root.left = test(preOrder,inOrder,prestart +1,leftprelen,instart,rootinorder-1);
        }
        if (rootinorder < inend){
            root.right = test(preOrder,inOrder,leftprelen+1,preend,rootinorder+1,inend);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] split = str.split(",");
            String s1 = split[0];
            String s2 = split[1];
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            for (char c : c1) {

            }
            int i1 = Integer.parseInt(String.valueOf(c1));
            int i2 = Integer.parseInt(String.valueOf(c2));
            //test(i1,i2,i1[0],21[0],c1[c1.length],c2[0],c2[c2.length]);
        }
    }
}
