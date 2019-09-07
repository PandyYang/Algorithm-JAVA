package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 15:16
 * 找出数组中不重复的两个数
 */
public class FindNumsAppearOnce {
    public void find(int[] nums,int num1[],int num2[]){
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff ^= -diff;
        for (int num : nums){
            if ((num & diff) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }
}
