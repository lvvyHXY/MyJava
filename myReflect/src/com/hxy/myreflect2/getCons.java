package com.hxy.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class getCons {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        //可以获取构造方法的 修饰符，参数类型，参数个数，用其创建对象

        //先获取class对象
        Class clazz = Class.forName("com.hxy.myreflect2.Student");

        //获取所有公有构造方法
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor constructor : cons1) {
            System.out.println(constructor);
        }
        System.out.println("----------------------");
        //获取所有构造方法
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons2) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------");
        //获取单个共有,要填入对应参数
        Constructor con3 = clazz.getConstructor();
        //获取修饰符
        //每一个修饰符由对应数字展现
        System.out.println(con3.getModifiers());
        System.out.println("--------------------------");
        //个数：con3.getParameterCount() 类型：con3.getParameterTypes()
        Constructor constructor = clazz.getConstructor(String.class);
        //获取所有参数：类型
        Parameter[] parameters = constructor.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("-------------------------");
        //获取单个
        Constructor con4 = clazz.getDeclaredConstructor(String.class,int.class);//参数是class对象
        //由于我获取的是private构造方法，没有权限；但是可以通过 con4.setAccessible(true); 临时无视权限检验
        con4.setAccessible(true);

        Student s = (Student) con4.newInstance("张三", 23);
        System.out.println(s);


    }
}
