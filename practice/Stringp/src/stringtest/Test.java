package stringtest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String rightUsername = "zhang";
        String rightPassword = "123";

        System.out.println("请输入用户名和密码");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String username = sc.next();
            String password = sc.next();
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                return;
            } else {
                System.out.println("登录失败");
            }
        }
        System.out.println("账号被锁定");
        return;
    }
}
