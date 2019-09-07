package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Pandy
 * @version 1.0
 * @date 15:20
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> find(int[] array,int sum){
        int i = 0,j = array.length-1;
        while (i < j){
            int cur = array[i] + array[j];
            if (cur == sum)
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            if (cur < sum)
                i++;
            else
                j--;
        }
        return new ArrayList<>();
    }
}
