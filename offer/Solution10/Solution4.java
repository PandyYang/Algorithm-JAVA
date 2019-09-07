package offer.Solution10;

/**
 * @Author: Pandy
 * @Date: 2019/5/12 8:53
 * @Version 1.0
 * 连续子数组的最大值
 */
public class Solution4 {
    public int findGreatestSumOfSunArray(int[] arr){
        if (arr.length == 0)
            return 0;
        int cur = arr[0],max = arr[0];
        for (int i = 1;i<arr.length;i++){
            cur = cur > 0 ? cur+arr[i] : arr[i];
            if (max < cur)
                max = cur;
        }
        return max;
    }
}
