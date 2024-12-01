package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class staticReference {
    public static void main(String[] args) {
        //类名::方法
        //要求，把字符串转化为数字输出
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7");
        //在stream流map方法中有函数式接口
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));*/
        //上式可以被方法引用简化
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}
