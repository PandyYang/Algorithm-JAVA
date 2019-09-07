package leetcode.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Pandy
 * @Date: 2019/5/10 17:39
 * @Version 1.0
 * 重复字母出现的次数进行输出
 */
public class FrequenceSort {
    public String frequenceSort(String s){
        Map<Character,Integer> frequencyForNum = new HashMap<>();
        //转化成字符数组并且依次取出
        for (char c : s.toCharArray()) {
            //map中放置对应的值 有的话 获取相应的值 然后加上一 没有的话默认是0
            frequencyForNum.put(c,frequencyForNum.getOrDefault(c,0)+1);
        }
        //创建一个list数组 其中放置的是list
        List<Character>[] frequencyBucket = new ArrayList[s.length()+1];
        //取到map中的key以及value属性
        for (Character c : frequencyForNum.keySet()) {
            //f是相应的map中的键
            int f = frequencyForNum.get(c);
            //数组中的第一个list  是null
            if (frequencyBucket[f] == null){
                //构建空的list
                frequencyBucket[f] = new ArrayList<>();
            }
            //不为null 的话 向后追加对象
            frequencyBucket[f].add(c);
        }
        StringBuffer str = new StringBuffer();
        //现在此bucket中是对象以及相应的数量
        for (int i = frequencyBucket.length-1;i>=0;i--){
            if (frequencyBucket[i]==null){
                continue;
            }
            for (Character c : frequencyBucket[i]) {
                for (int j = 0;j<i;j++){
                    //相应位置上出现的重复字符
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
