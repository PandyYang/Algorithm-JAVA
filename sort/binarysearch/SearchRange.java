package sort.binarysearch;

/**
 * @author Pandy
 * @version 1.0
 * @date 21:46
 * 查找数字区间
 */
public class SearchRange {
    public int[] search(int[] nums,int target){
        int first = binarySearch(nums,target);
        int last = binarySearch(nums,target+1) -1;
        if (first == nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }else {
            return new int[]{first,Math.max(first,last)};
        }
    }
    private int binarySearch(int[] nums,int target){
        int l = 0,h = nums.length;
        while (l < h){
            int m = l + (h-l)/2;
            if (nums[m] > target){
                h = m;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}
