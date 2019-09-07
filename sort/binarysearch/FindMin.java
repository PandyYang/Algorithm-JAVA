package sort.binarysearch;

/**
 * @author Pandy
 * @version 1.0
 * @date 21:38
 * 旋转数组的最小数字
 */
public class FindMin {
    public int find(int[] nums){
        int l = 0,h = nums.length-1;
        while (l < h){
            int m = l+(h - l)/2;
            if (nums[m] <= nums[h]){
                h = m;
            }else{
                l = m+1;
            }
        }
        return nums[l];
    }
}
