package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    /*
    * */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //1.add
        coll.add("jack");
        coll.add("tom");
        coll.add("mike");
        System.out.println(coll);
        //2.clear
        /*coll.clear();
        System.out.println(coll);*/


        //3.remove
        //只能通过元素删除，因为set集合里没有索引
        coll.remove("jack");
        System.out.println(coll);

        //4.contains
        //contains底层是调用Object类的equals方法，默认是比较地址，所以要重写equals方法，如果你用的是自定义对象的话
        Collection<Student> coll2 = new ArrayList<Student>();
        Student s1 = new Student("zhangsan",17);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",21);
        coll2.add(s1);
        coll2.add(s2);
        coll2.add(s3);
        boolean b = coll2.contains(s1);
        System.out.println(b);

        //5.isEmpty
        System.out.println(coll2.isEmpty());

        //6.size
        System.out.println(coll2.size());
    }
}
