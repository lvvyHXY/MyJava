package Map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class UsualAPI {
    public static void main(String[] args) {
        //Map是一个接口，需要使用实现类来创建对象 <K,V>
        Map<String,String> map = new HashMap<>();
        //put方法添加键值对
        //细节：1.当集合中键不存在时，会返回null
        //2.当集合中键存在时，会覆盖原有的值，并且返回被覆盖的值
        map.put("A","A1");
        map.put("B","B1");
        map.put("C","C1");
        map.put("A","A2");
        //remove(K key) 返回被删除的值
        System.out.println(map.remove("A"));
        //clear 清空集合
        //map.clear();
        //containsKey(K key) 判断集合中是否包含指定的键
        //containsValue(V value) 判断集合中是否包含指定的值
        System.out.println(map.containsKey("B"));
        System.out.println(map.containsValue("B1"));
        //isEmpty 判断集合是否为空
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}
