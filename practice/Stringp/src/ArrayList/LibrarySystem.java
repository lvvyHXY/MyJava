package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    //1、提供操作菜单，可以选择要进行的操作。
    //
    //2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
    //

    //

    //

    //
    //6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
    //
    //7、可以退出系统，结束程序运行。
    //
    //提示：
    //
    //1、所有图书信息由键盘录入
    //
    //2、图书的价格可以定义为字符串类型，因为在键盘录入时，不可以先使用nextInt()方法获取整数然后再使用next()方法获取字符串，这样会导致next()方法获取不到数据。
    public static void main(String[] args) {
        //创建一个集合来管理图书
        ArrayList<Book> books = new ArrayList<>();
        //帮我显示一个菜单，实现上述功能的选择
        System.out.println("欢迎来到图书管理系统");
        System.out.println("1、添加图书");
        System.out.println("2、查询图书");
        System.out.println("3、根据书名查询图书");
        System.out.println("4、删除图书");
        System.out.println("5、修改图书信息");
        System.out.println("6、退出系统");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
            while(choice != 6)
            {
                    choice = sc.nextInt();
                    switch(choice) {
                        case 1 -> {
                            System.out.println("添加图书");
                            addBook(books);
                        }
                        case 2 -> {
                            System.out.println("查询图书");
                            searchBook(books);
                        }
                        case 3 -> {
                            System.out.println("根据书名查询图书");
                            searchBookByName(books);
                        }
                        case 4 -> {
                            System.out.println("删除图书");
                            deleteBook(books);
                        }
                        case 5 -> {
                            System.out.println("修改图书信息");
                        }
                        default -> {
                            System.out.println("退出系统");
                            break;
                        }
                    }
            }
//        for (int i = 0; i < books.size(); i++) {
//            System.out.println(books.get(i).getId());
//            System.out.println(books.get(i).getName());
//            System.out.println(books.get(i).getAuthor());
//            System.out.println(books.get(i).getPrice());
//        }
    }
    public static void deleteBook(ArrayList<Book> books){
        //5、可以删除图书，通过编号删除，删除成功后，返回到菜单
        System.out.println("请输入要删除书籍的编号");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId().equals(id))
            {
                books.remove(i--);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("抱歉，未找到您要的书,无法删除");
    }
    public static void searchBookByName(ArrayList<Book> books){
        //4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
        Scanner sc = new Scanner(System.in);
        String targetName = sc.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getName().equals(targetName))
            {
                System.out.println(books.get(i).getId());
                System.out.println(books.get(i).getName());
                System.out.println(books.get(i).getAuthor());
                System.out.println(books.get(i).getPrice());
                return;
            }
        }
        System.out.println("抱歉，未找到您要的书");
    }
    public static void searchBook(ArrayList<Book> books){
        //3、可以查询图书，显示所有图书信息，然后返回到菜单。
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getId());
            System.out.println(books.get(i).getName());
            System.out.println(books.get(i).getAuthor());
            System.out.println(books.get(i).getPrice());
        }
        System.out.println("查询完毕");
    }

    public static boolean isExist(ArrayList<Book> list ,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id))
                return true;
        }
        return false;
    }

    public static void addBook(ArrayList<Book> list) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书信息：");
        System.out.println("编号：");
        String bookId;
        while (true) {
            bookId = sc.next();
            // 查询编号是否存在
            if (isExist(list, bookId)) {
                System.out.println("该编号已经存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("名称：");
        String name = sc.next();
        System.out.println("作者：");
        String author = sc.next();
        System.out.println("价格：");
        double price = sc.nextDouble();
        // 将信息封装到图书对象
        Book b = new Book(name,author,price,bookId);
        // 添加到集合
        list.add(b);
        System.out.println("~~~添加成功~~~");
    }
}
