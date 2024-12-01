package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBinali {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");
        //用迭代器遍历
        //1.获取迭代器对象
        Iterator<String> it = coll.iterator();
        //hasNext（） ： 判断下一个是否有元素
        while(it.hasNext()){
            String next = it.next();//next() :获取元素并且移动指针
            System.out.println(next);
        }
        //迭代器遍历完后指针不会复位，所以再遍历得再创建迭代器对象
        System.out.println(it.hasNext());
        Iterator<String> it2 = coll.iterator();
        /*while(it2.hasNext()){
            String next = it2.next();//next() :获取元素并且移动指针
            System.out.println(next);
        }*/
        //循环中只能用一次next，不然可能会越界
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
            //System.out.println(it2.next());
            //迭代器遍历时不能用集合方法增删改，会抛出异常,可以用迭代器方法删除
            if("bbb".equals(str))
                it2.remove();
        }
        System.out.println(coll);
    }
}
