package InterfaceProject;

public class ClassDataInterimpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterimpl2(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        int malecount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if(s.getSex()=='男')
                malecount++;
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }
        System.out.println("男学生个数："+malecount);
        System.out.println("女学生个数："+(students.length-malecount));
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
            if(max < students[i].getScore())
                max = students[i].getScore();
            if(min > students[i].getScore())
                min = students[i].getScore();
        }
        sum = sum - max - min;
        System.out.println("平均成绩为：" + sum/students.length);
    }
}
