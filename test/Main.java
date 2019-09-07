package test;

public class Main {
    /**
     * 冒泡排序 每趟相邻比较 N个数N-1趟排序,没i趟排序N-i次
     * 平均复杂度O(n²)
     * 最坏O(n²)
     * 最好O(n)
     * @param arr
     */
    public static void test(int[] arr){
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0;j<arr.length -1 -i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序 每次选出最小的值依次从前往后交换
     * 最好 最坏 平均O(n²)
     * @param arr
     */
    public static void test2(int[] arr){
        int temp = 0;
        for (int i = 0;i<arr.length-1;i++){
            int min = i;
            for (int j = min+1; j<arr.length;j++){
                //min是标兵 用于记录之后的 更小值
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
           temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * 插入排序
     * 最好O(n)
     * 平均O(n²)
     * 最坏O(n²)
     * @param arr
     */
    public static void test3(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j>0;j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     * 最好时间复杂度O(nlgn)
     * 平均时间复杂度O(nlgn)
     * 最坏时间复杂度(n²)
     * @param arr
     * @param low
     * @param high
     */
    public static void test4(int[] arr,int low,int high){

        int start = low;
        int end = high;
        int key = arr[low];
        while(end > start){
            while(end > start && arr[end] >= key){
                end--;
            }
            if (arr[end] <= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            while (end > start && arr[start] <= key){
                start++;
            }
            if (arr[start] >= key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            if (start > low)test4(arr,low,start-1);
            if (end < high)test4(arr,end+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2};
        test(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        double b = 0.5;
        float a = 0.5f;
        System.out.println(a == b);
    }
}
