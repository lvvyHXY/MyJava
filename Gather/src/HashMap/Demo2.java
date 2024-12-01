package HashMap;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        /*模拟80个学生投票四个景点A,B,C,D；看那个票数最多*/
        //用一个数组装景点
        String[] arr = {"A","B","C","D"};
        //用一个集合装投票结果，Random模拟投票
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            list.add(arr[index]);
            //System.out.println(arr[index]);
        }
        //用HashMap统计投票结果，键为景点，值为票数
        HashMap<String,Integer> hm = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (String name : list){
            //如果已经添加了，则++后覆盖原来的
            if(hm.containsKey(name)){
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }else{//没添加则票数为1添加进去
                hm.put(name,1);
            }
        }
        //计算投票最大值
        int max = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            //System.out.println(entry.getValue());
            if(entry.getValue()>max){
                max = entry.getValue();
                //System.out.println(max);
            }
        }
        //看哪个key对应的value是max，就是那个景点票数最多
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
