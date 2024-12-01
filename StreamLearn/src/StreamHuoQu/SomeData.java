package StreamHuoQu;

import java.util.stream.Stream;

public class SomeData {
    public static void main(String[] args) {
        //一些零散的数据转化为stream流直接调用Stream接口中的方法
        Stream.of(1,2,3,4,5).forEach(i -> System.out.println(i));
        Stream.of("a","b","c").forEach(s -> System.out.println(s));
    }
}
