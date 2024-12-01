package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapWalkThrough {
    public static void main(String[] args) {
        //1:用键找值的方法遍历map集合
        //创建集合对象
        Map<String,String> map = new HashMap<>();
        map.put("脉动","5元");
        map.put("雪碧","2元");
        map.put("芬达","3元");
        //把键装入set集合
        Set<String> keys = map.keySet();
        //用set遍历:迭代器，增强for，foreach的Lambda表达式
        for (String k : keys) {
            String value = map.get(k);
            System.out.println(k + "=" + value);
        }
        System.out.println("--------------------------------------");
        //迭代器
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str + "=" +map.get(str));
        }
        System.out.println("--------------------------------------");
        //Lambda
        keys.forEach(s -> System.out.println(s + "=" + map.get(s)));
    }
}
