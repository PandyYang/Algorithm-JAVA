package leetcode.twopointer;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 12:41
 * @Version 1.0
 * 判断数组中是否存在两数和为target
 */
public class TwoSum {
    public int[] twoSum(int[] arr,int target){
        int i = 0,j = arr.length-1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if (sum == target){
                return new int[]{i+1,j+1};
            }else if (sum < target){
                i++;
            }else {
                j--;
            }
        }
        return null;
    }
}
