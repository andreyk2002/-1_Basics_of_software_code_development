package by.epam_tc.step1.t1;
//определить, пройдёт ли кирпич через отверстие

import java.util.Scanner;

public class Task2_4 {
    public static double enterFromConsole(String message)
    {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print(message + ">>");
        double aDouble;
        while (!in.hasNextDouble()) {
            in.next();
            System.out.print(message + ">>");
        }
        aDouble = in.nextDouble();
        return aDouble;
    }
    public static void main(String[] args) {
        System.out.println("Введите размеры отверстия");
        double a;
        double b;

        a = enterFromConsole("A");
        b = enterFromConsole("B");

        System.out.println("Введите размеры кирпича:");
        double x;
        double y;
        double z;

        x = enterFromConsole("x");
        y = enterFromConsole("y");
        z = enterFromConsole("z");

        double minBrickLen;

        minBrickLen = Math.min(x, y);
        minBrickLen = Math.min(minBrickLen, z);

        double midBrickLen;
        midBrickLen = ((x <= y && x >= z) || (x >= y && x <= z)) ? x : 0;

        if (midBrickLen == 0) {
            midBrickLen = ((y <= x && y >= z) || (y >= x && y <= z)) ?
                    y : z;
        }
        if (Math.min(a, b) >= minBrickLen && Math.max(a, b) >= midBrickLen) {
            System.out.println("Кирпич пройдёт через отверстие");
        } else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}
