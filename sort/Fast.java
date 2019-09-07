package sort;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 10:13
 * @Version 1.0
 */
public class Fast {
    public static void sort(int[] arr,int low,int high){
        int start = low;
        int end = high;
        int key = arr[low];

        while (end>start && arr[end]>=key){
            end--;
            if (arr[end]<=key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
        }
        while (end>start && arr[start]<=key){
            start++;
            if (arr[start]>=key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        if (start > low) sort(arr,low,start-1);
        if (end < high) sort(arr,end +1,high);
    }
}
