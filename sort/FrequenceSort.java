package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Pandy
 * @Version 1.0
 * 输入一串字符串按照字符串中字母出现的次数进行输出
 */
public class FrequenceSort {
    public String frequenceSort(String s){
        //构造map用来存储每个字符串出现的相应的次数
        Map<Character,Integer> frequenceNum = new HashMap<>();
        for (char c : s.toCharArray()){
            //注意这个方法 将每次循环遍历出现的 重复次数加一 没有出现重复的次数默认就是1
            frequenceNum.put(c,frequenceNum.getOrDefault(c,0)+1);
        }
        List<Character>[] frequencyBucket = new ArrayList[s.length() + 1];
        //取出map中的元素
        for (Character c : frequenceNum.keySet()) {
            //获取元素对象
            Integer f = frequenceNum.get(c);
            if (frequencyBucket[f] == null){//给每个元素创建一个列表存储重复值
                frequencyBucket[f] = new ArrayList<>();
            }
            //向list中添加重复值
            frequencyBucket[f].add(c);
        }
        StringBuffer stringBuffer = new StringBuffer();
        //总的长度 进行遍历
        for (int i = frequencyBucket.length-1;i>=0;i--){
            //出现空字符串 不进行任何操作 从下一位继续开始
            if (frequencyBucket[i] == null){
                continue;
            }
            //计算每个元素的数量 然后添加对应的数量
            for (Character c : frequencyBucket[i]) {
                for (int j = 0;j<i;j++){
                    stringBuffer.append(c);
                }
            }
        }
        return stringBuffer.toString();
    }
}
