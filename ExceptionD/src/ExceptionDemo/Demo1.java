package ExceptionDemo;

public class Demo1 {
    public static void main(String[] args) {
        //异常的作用：1.让编写者知道哪里出错了，查询bug
/*        Student[] stu = new Student[3];
        System.out.println(stu[3]);*/
        //2.作为方法内部一种特殊的返回值返回，通知调用者底层的情况
        Student s = new Student();
        s.setAge(100);//在调用出返回异常，可以自己偷偷处理也可以打印到控制台
    }
}
