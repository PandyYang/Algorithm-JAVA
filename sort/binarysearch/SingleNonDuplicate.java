package sort.binarysearch;

/**
 * @author Pandy
 * @version 1.0
 * @date 21:29
 * 一个有序数组只有一个数出现的次数不超过两次求出这个数
 */
public class SingleNonDuplicate {
    public int find(int[] nums){
        int l = 0,h = nums.length-1;
        while (l < h){
            int m = l+(h-l)/2;
            if (m % 2 == 1){
                m--;
            }
            if (nums[m] == nums[m+1]){
                l = m+2;
            }else {
                h = m;
            }
        }
        return nums[l];
    }
}
