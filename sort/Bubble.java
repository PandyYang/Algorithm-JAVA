package sort;

import java.util.Arrays;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 10:09
 * @Version 1.0
 */
public class Bubble {
    public static void bubbleSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
