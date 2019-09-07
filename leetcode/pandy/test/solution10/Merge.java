package leetcode.pandy.test.solution10;

/**
 * @author Pandy
 * @version 1.0
 * @date 22:30
 * 合并两个有序的数组
 */
public class Merge {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int index1 = m - 1;
        int index2 = n - 1;
        int indexMerge = m+n-1;
        while(index1 >= 0 || index2 >= 0){
            //说明nums1无效 直接将num2 按照index递减的顺序 从后往前赋给新的容量的数组
            if (index1 < 0){
                nums1[indexMerge--] = nums2[index2--];
                //说明index2无效 直接将index1 从后
            }else if (index2 < 0){
                nums1[indexMerge--] = nums1[index1--];
                //遇见大的值 先将大值从后往前赋值  保证递增性质
            }else if (nums1[index1] > nums2[index2]){
                nums1[indexMerge--] = nums1[index1--];
            }else{
                nums2[indexMerge] = nums2[index2--];
            }
        }
    }
}
