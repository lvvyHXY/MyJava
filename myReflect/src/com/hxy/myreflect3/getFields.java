package com.hxy.myreflect3;

import java.lang.reflect.Field;

public class getFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.hxy.myreflect3.Student");
        //获取成员变量数组,公有的
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //clazz.getDeclaredFields();//所有的

        //获取单个成员变量对象
        Field name = clazz.getDeclaredField("name");
        //name.getType()获取成员变量类型
        System.out.println(name.getType());
        //name.getName() 获取成员变量名字
        System.out.println(name.getName());
        //获取成员变量的值
        Student s = new Student("zhangsan",23);
        //先过权限
        name.setAccessible(true);
        String n =(String) name.get(s);
        System.out.println(n);
        //修改值
        name.set(s,"lisi");
        System.out.println(s);
    }
}
