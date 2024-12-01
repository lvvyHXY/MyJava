package com.zouht.oopmt;

public abstract class User {
    private String name;
    private String password;
    private String role;

    User(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public abstract void showMenu();

    public void setName(String value) {
        name = value;
    }

    public void setPassword(String value) {
        password = value;
    }

    public void setRole(String value) {
        role = value;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void showFileList() {
        String menu_str = """
                ========文件列表========
                WIP
                """;
        System.out.println(menu_str);
    }

    public void downloadFile() {
        String menu_str = """
                ========下载文件========
                WIP
                """;
        System.out.println(menu_str);
    }

    public void changeSelfPassword() {
        String menu_str = """
                ========修改密码========
                WIP
                """;
        System.out.println(menu_str);
    }

    public void exitSystem() {
        System.out.println("系统退出");
        System.exit(0);
    }
}

