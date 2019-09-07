package leetcode.pandy.test.solution10;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:49
 * 数组和一个目标值
 * 数组中的两个数值和为目标值
 * 返回这两个数值的坐标
 */
public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0;i<nums.length;++i){
            int num = target - nums[i];
            if (m.containsKey(num))
                return new int[]{m.get(num),i};
            m.put(nums[i],i);
        }
        throw new RuntimeException("no answer!");
    }
}
