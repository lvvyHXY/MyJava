package HomeWork;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylinder c = new cylinder(sc.nextDouble(),sc.nextDouble());
        cuboid cu = new cuboid(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        c.show();
        cu.show();
    }
}
