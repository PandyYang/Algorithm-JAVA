package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:56
 * 三个指针 如果是0 和0指针的下一个元素交换
 * 如果是2 和2的前一个元素交换
 */
public class SortColors {
    public void sort(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            }else if (nums[one] == 2){
                swap(nums,--two,one);
            }else{
                ++one;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
