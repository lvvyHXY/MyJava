package TreeMap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Demo3 {
    public static void main(String[] args) {
        //统计字符串中每个字母出现的个数 "abcbcbdabdcce"
        String s = "abcbcbdabdcce";
        //获取每一个字符
        //创建一个集合来统计数据
        //对结果无排序要求：HashMap
        //有排序要求:TreeMap
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                tm.put(c,1);
            }
        }
        //用StringBuilder,StringJoinerL来规范输出
        StringBuilder sb = new StringBuilder();
        tm.forEach((key,value) ->sb.append(key).append('(').append(value).append(')'));
        System.out.println(sb);

    }
}