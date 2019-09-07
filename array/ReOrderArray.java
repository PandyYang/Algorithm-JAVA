package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:28
 * 将数组中的偶数移动到最右边
 * 使用冒泡的思想
 */
public class ReOrderArray {
    public void reOrderArray(int[] nums){
        int N = nums.length;
        for (int i = N-1;i>0;i--){
            for (int j = 0;j<i;j++){
                if (isEven(nums[j]) && !isEven(nums[j+1])){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    private boolean isEven(int x){
        return x%2 == 0;
    }
    private void swap(int[] nums,int i,int j){

    }
}
