package ExceptionDemo;

import java.util.Scanner;

public class Demo7 {
        public static void main(String[] args) {
            //学生年龄在18-40，不能有abc之类,名字长度在二到十之间
            Scanner sc = new Scanner(System.in);
            Student s1 = new Student();
            while (true) {
                try {
                    System.out.println("请输入学生姓名");
                    String name = sc.nextLine();
                    s1.setName(name);
                    System.out.println("请输入学生年龄");
                    String ageStr = sc.nextLine();
                    int age = Integer.parseInt(ageStr);
                    s1.setAge(age);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("年龄不能有除了数字以外的东西");
                } catch (NameFormatException e){
                    e.printStackTrace();
                } catch (AgeOutOfBoundsException e){
                    e.printStackTrace();
                }
            }

            System.out.println(s1);
        }
    }
