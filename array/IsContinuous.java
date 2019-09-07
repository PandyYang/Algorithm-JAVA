package array;

import java.util.Arrays;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:46
 */
public class IsContinuous {
    public boolean isContinuous(int[] nums){
        if (nums.length != 5)
            return false;
        Arrays.sort(nums);
        int cnt = 0;
        for (int num : nums) {
            if (num == 0)
                cnt++;
        }
        for (int i = cnt;i<nums.length-1;i++){
            if (nums[i+1] == nums[i])//连续的牌 不能出现相同的
                return false;
            cnt -= nums[i+1] - nums[i]-1;//使用cnt 替换无法连续的
        }
        return cnt>=0;
    }
}
