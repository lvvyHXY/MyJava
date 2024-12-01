package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class WalkThrough3 {
    //Lambda表达式
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("接口","Interface");
        map.put("类","class");
        map.put("祖宗集合","Collection");
        /*map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "=" + s2);
            }
        });*/
        /*default void forEach(BiConsumer<? super K, ? super V> action) {
        Objects.requireNonNull(action);
        for (Map.Entry<K, V> entry : entrySet()) {
            K k;
            V v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch (IllegalStateException ise) {
                // this usually means the entry is no longer in the map.
                throw new ConcurrentModificationException(ise);
            }
            action.accept(k, v);
        }
    }*///可以看到，底层是调用拿键值对遍历的方法
        map.forEach((s,s2) -> System.out.println(s + "=" + s2));
    }
}
