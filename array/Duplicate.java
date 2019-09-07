package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 8:59
 */
public class Duplicate {
    public boolean duplicate(int[] nums,int length,int[] duplication){
        if (nums == null ||length <= 0) {
            return false;
        }
        //将数组对应的几号元素 移动到下标为几的位置上
        for (int i = 0; i < length; i++) {
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums,i,nums[i]);
            }
        }
        return false;
    }
    private static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
