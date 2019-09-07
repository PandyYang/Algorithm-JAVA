package leetcode;

import java.util.Stack;

/**
 * 输出最简的Linux路径
 * .是当前目录
 * ..是上层目录
 */
public class LinuxPath {
    public static String path(String path){
        String[] str = path.split("/");
        Stack<String> S = new Stack<String>();
        for (int i = 0; i < str.length; i++){
            //.是当前目录 遇见.  不进行操作
            if (".".equals(str[i]) || "".equals(str[i])){
                continue;
                //..是上层目录 相应的从栈中弹出最后输入的路径
            }else if ("..".equals(str[i])){
                if (!S.empty())
                    S.pop();
                //将普通目录压入栈中
            }else{
                S.push(str[i]);
            }
        }
        StringBuilder arr = new StringBuilder();
        while(!S.empty()){
            //栈中的元素依次压入 压入数组中的一个元素 然后压入反斜线
            arr.insert(0,S.pop());
            arr.insert(0,"/");
        }
        //
        if (arr.length() == 0){
            arr.append("/");
        }

        return arr.toString();
    }

    public static void main(String[] args) {
        String stringPath = "../home/temp/";
        System.out.println(path(stringPath));
    }
}
