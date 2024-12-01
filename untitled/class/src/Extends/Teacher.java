package Extends;

public class Teacher extends People{
    private String subject;
    public Teacher(){}
    public Teacher(String name,int age,String subject)
    {
        super(name,age);
        this.subject = subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
