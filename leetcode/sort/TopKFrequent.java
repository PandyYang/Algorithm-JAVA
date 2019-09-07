package leetcode.sort;

import java.util.*;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 13:35
 * @Version 1.0
 * 出现频率最多的k个数
 */
public class TopKFrequent {
    public List<Integer> getMaxFrequenceK(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List<Integer> resList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            resList.add(entry.getValue());
            if (resList.size() == k)
                break;
        }
        return resList;
    }
}
