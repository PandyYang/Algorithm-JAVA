package sort;

/**
 * @Author: Pandy
 * @Version 1.0
 */
public class FastSort {
    public static void sort(int[] arr,int low,int hight){
        int start = low;
        int end = hight;
        int key = arr[low];

        while (end > start){
            while (end > start && arr[end] >= key){
                end--;
            }
            if (arr[end] <= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            while (end > start&&arr[start]<=key){
                start++;
            }
            if(arr[start] >= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = arr[end];
            }
            if (start > low) sort(arr, low,start-1);
            if (end < hight) sort(arr,end+1,hight);
        }
    }
}
