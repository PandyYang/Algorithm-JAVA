package sort;

/**
 * @Author: Pandy
 * @Version 1.0
 */
public class ChooseSort {
    public static void sort(int arr[]){
        int temp = 0;
        for (int i = 0;i < arr.length-1;i++){
            int minIndex = i;
            for (int j = minIndex + 1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
