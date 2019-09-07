package sort;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 10:19
 * @Version 1.0
 */
public class Merge {
    public static void merge(int arr[],int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while (i<mid && j<right){
            if (arr[i] <arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<mid){
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left < right){
            arr[left++] = temp[t++];
        }
    }
    public static void sort(int[] arr,int left,int right,int[] temp){
        if (left<right){
            int mid = (left + right) / 2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
}
