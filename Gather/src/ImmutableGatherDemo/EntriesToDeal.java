package ImmutableGatherDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntriesToDeal {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("001", "zhangsan");
        hm.put("002", "lisi");
        hm.put("003", "wangwu");
        hm.put("004", "zhaoliu");
        //1.获取Entry对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //2.由于可变参数本质上是一个数组，所以把entries装入数组中
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray
        //先比较长度 集合长度 > 数组长度则会创建一个新数组，长度为集合长度，然后把集合元素拷贝进去，返回新数组
        //集合长度 <= 数组长度则会按拷贝集合，但是长度是数组的长度
        //所以上式是[0]
        Map.Entry[] arr2 = entries.toArray(arr1);
        Map map = Map.ofEntries(arr2);
        //map.put("005", "tom");

        //简化写法
        Map<Object, Object> map1 = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        System.out.println(map1);
        //map1.put("005", "tom");

        //JDK10之后
        Map<String, String> map2 = Map.copyOf(hm);
        map2.put("005", "tom");
    }
}
