package sort.binarysearch;

/**
 * @author Pandy
 * @version 1.0
 * @date 21:22
 */
public class BinarySearch {
    public int find(int[] nums,int key){
        int l = 0,h = nums.length-1;
        while (l < h){
            int m = l + (l-h)/2;
            if (nums[m] == key){
                return m;
            }else if (nums[m] > key){
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return -1;
    }
}
