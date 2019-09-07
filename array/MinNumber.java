package array;

/**
 * 使用二分查找 求旋转数组的最小数字
 */
public class MinNumber {
    public int min(int[] arr){
       if (arr.length == 0)
           return 0;
       int low = 0;
       int high = arr.length-1;
       int mid = low;
       while (arr[low] >= arr[high]){
           if (high - low == 1){
               mid = high;
               break;
           }
           mid = (low + high)/2;
           if (arr[mid] >= arr[low]){
               low = mid;
           }else if (arr[mid] <= arr[high]){
               high = mid;
           }
       }
       return arr[mid];
    }
}
