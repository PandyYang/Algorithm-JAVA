package sort;

/**
 * @Author: Pandy
 * @Version 1.0
 */
public class BubbleSort {
    public static void sort(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
