package StreamHuoQu;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("1","张三");
        hm.put("2","李四");
        hm.put("3","王五");
        //双列集合只能通过keyset entryset获取stream流
        hm.entrySet().stream().forEach(stringStringEntry -> System.out.println(stringStringEntry));
        hm.keySet().stream().forEach(s ->System.out.println(s + " = " + hm.get(s)));
    }
}
