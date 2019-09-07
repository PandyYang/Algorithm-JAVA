package offer.solution20;

import java.util.ArrayList;

/**
 * @Author: Pandy
 * @Date: 2019/5/13 8:41
 * @Version 1.0
 * 找出升序数组中和为sum的两个数字 如果有多个 找出乘积最小的
 * 夹逼法 双指针从前往后 遍历 因为是有序的所以往中间的时候 乘积是小的
 */
public class Solution11 {
    public ArrayList<Integer> findNumberWithSum(int[] arr,int sum){
        ArrayList<Integer> res = new ArrayList<>();
        if (arr.length < 2)
            return res;
        int i = 0,j = arr.length-1;
        while (i != j){
            if (arr[i] + arr[j] == sum){
                res.add(arr[i]);
                res.add(arr[j]);
                break;
            }else if (arr[i] + arr[j] > sum){
                j--;
            }else {
                i++;
            }
        }
        return res;
    }
}
