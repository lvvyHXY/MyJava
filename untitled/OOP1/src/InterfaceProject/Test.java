package InterfaceProject;

public class Test {
    public static void main(String[] args) {
        //1.定义学生类，创建对象封装数据
        //2.准备学生数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 100);
        allStudents[1] = new Student("李四", '女', 90);
        allStudents[2] = new Student("王五", '男', 80);
        allStudents[3] = new Student("赵六", '女', 70);
        allStudents[4] = new Student("钱七", '男', 60);
        allStudents[5] = new Student("孙八", '女', 50);
        allStudents[6] = new Student("周九", '男', 40);
        allStudents[7] = new Student("吴十", '女', 30);
        allStudents[8] = new Student("郑十一", '男', 20);
        allStudents[9] = new Student("王十二", '女', 10);
        //3.提供两套方案，支持解耦合,面向接口编程
        //定义一个实现类，必须完成打印全班信息和平均分
        //定义一个实现类，实现接口，完成打印学生信息（男女），去掉最高最低的平均数
        ClassDataInter cdi = new ClassDataInterimpl1(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }

}
