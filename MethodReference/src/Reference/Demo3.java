package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张三","张无忌","罗翔","特朗普","马斯克");
        //筛选姓张，并且名字为三个字的
        //stream
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s -> System.out.println(s));
        //用方法引用
        list.stream().filter(new StringDemo()::StringJudge).forEach(s-> System.out.println(s));
        //本类呢 报错，因为main方法是一个静态方法，静态方法没有this
        //list.stream().filter(this::StringJudge1).forEach(s-> System.out.println(s));
        list.stream().filter(new Demo3()::StringJudge1).forEach(s-> System.out.println(s));
    }
    //注意，要对象引用不能写静态方法？？？
    public boolean StringJudge1(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
