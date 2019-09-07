package leetcode.pandy.test.solution10;

import java.util.Scanner;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:05
 */
public class Main {
    /*public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String strA = in.nextLine();
        String strB = in.nextLine();
        test(strA,strB);
    }

    public static void test(String strA,String strB){
        int count = 0;
        for (int i = 0;i<strB.length();i++){
            for (int j = i;j<=strB.length();j++){
                if (strB.substring(i,j).equals(strA))
                    count++;
            }
        }
        System.out.println(count);
    }*/

    static int M,N,dx,dy,gx,gy;
    static char[][] a;
    static int[][] deep;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        M=s.nextInt();
        N=s.nextInt();
        a = new char[M][N];
        deep = new int[M][N];
        for (int i = 0;i<M;i++){
             a[i] = s.next().toCharArray();
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0;j<N;j++){
                if (a[i][j] == 'm'){
                    dx = i;
                    dy = j;
                }
                //if (a[])
            }
        }
    }
}
