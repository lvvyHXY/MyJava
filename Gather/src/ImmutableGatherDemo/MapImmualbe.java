package ImmutableGatherDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapImmualbe {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("张三", "23", "李四", "24", "王五", "25","赵六","26");
        System.out.println(map);
        //但是最多只能添加10个键值对数据
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-----------------------------------");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey() + "=" + next.getValue());
        }

        //如何解决呢？直接把键值对作为可变参数即可.Map中有一个方法 ofEntries（）；
        //见
    }
    //对于只能添加10个键值对，由于可变参数只能有一个并且出现在最后，所以Map.of没有可变参数的重载
    /*public static<K,V> void of(K ...key,V ...value){

    }*/
}
