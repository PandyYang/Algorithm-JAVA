package sort;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 9:55
 * @Version 1.0
 * 选择排序 每次选出最大的数 然后将其移动到最前面
 */
public class Select {
    public static void selectSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            //标志位
            int position = i;
            //找出最大值
            for (int j = position+1;j<arr.length;j++){
                if (arr[j] > arr[position]){
                    //互换标志位 使得标志位在当前轮次中最大
                    position = j;
                }
            }
            //position不是当前位置 说明当前位置不是最大值 更换
            if (i != position){
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,4,8,5,9,0,1};
        Select.selectSort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
