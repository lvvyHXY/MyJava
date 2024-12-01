package com.hxy.myreflect5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //从配置文件中读取
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("methodname");

        Class clazz = Class.forName(className);
        Constructor cons = clazz.getDeclaredConstructor();
        Method method = clazz.getDeclaredMethod(methodName);
        //给权限创建对象并运行方法
        Object o = cons.newInstance();
        System.out.println(o);

        method.setAccessible(true);
        method.invoke(o);//空参的方法


    }
}
