package HashSetDemo;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        //哈希值，调用hashcode求出
        //默认使用地址值计算，所以不同对象的哈希值会不同
        //但重写hashcode（）后可以通过属性值来计算hashcode
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);
        //重写hashcode（）前不同
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //重写后相同
        //不同的属性哈希值可能相同，称为哈希碰撞，小概率事件
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
