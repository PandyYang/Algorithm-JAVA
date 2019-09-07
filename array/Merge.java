package array;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:43
 */
public class Merge {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int index = m-1,index2 = n-1;
        int indexMerge = m+ n-1;
        //从尾部开始遍历
        while (index >= 0 || index2 >= 0){
            if (index < 0){
                nums1[indexMerge --] = nums2[index2--];
            }else if (index2 < 0){
                nums1[indexMerge--] = nums1[index--];
            }else if (nums1[index] > nums2[index2]){
                nums1[indexMerge--] = nums1[index--];
            }else{
                nums1[indexMerge] = nums2[indexMerge];
            }
        }
    }
}
