package Reference;

import java.util.ArrayList;
import java.util.function.Function;

public class Practice2 {
    public static void main(String[] args) {
        /*
需求：
创建集合添加学生对象
学生对象属性：name, age
要求：
获取姓名并放到数组当中
使用方法引用完成
*/

// 1. 创建集合
        ArrayList<Student> list = new ArrayList<>();

// 2. 添加元素
        list.add(new Student("zhangsan",  23));
        list.add(new Student( "lisi",  24));
        list.add(new Student( "wangwu",  25));

// 3. 获取姓名并放到数组当中
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
