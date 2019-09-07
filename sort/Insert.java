package sort;

import java.util.Arrays;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 10:05
 * @Version 1.0
 */
public class Insert {
    public static void insertSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            for (; j>=0 && arr[j] > temp;j--){
                //大于temp的值向后移动
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Insert.insertSort(arr);
    }
}
