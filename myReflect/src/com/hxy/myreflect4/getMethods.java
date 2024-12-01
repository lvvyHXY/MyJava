package com.hxy.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class getMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.hxy.myreflect4.Student");
        //获取所有共有方法，包含父类的
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //获取补刀父类的了
        clazz.getDeclaredMethods();
        //单个
        Method m = clazz.getDeclaredMethod("eat", String.class);
        //获取方法名
        System.out.println(m.getName());
        //获取修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);
        //获取参数
        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //运行 invoke
        //参数一：创建的对象
        //参数二：形参
        //返回值：有返回值可以接收，没有不用管
        m.setAccessible(true);
        Student s = new Student("zhangsan",23);
        String ret = (String) m.invoke(s, "hamburger");
        System.out.println(ret);
        //还可以获取所有异常的名字
        m.getExceptionTypes();
    }
}
