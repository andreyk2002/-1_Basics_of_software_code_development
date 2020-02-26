package by.epam_tc.step1.t1;
// определить лежат ли три точки на одной прямой

import java.util.Scanner;

public class Task2_3 {
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
        System.out.println("Введите координаты точек на плоскости");

        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;

        x1 = enterFromConsole("x1");
        y1 = enterFromConsole("y1");
        x2 = enterFromConsole("x2");
        y2 = enterFromConsole("y2");
        x3 = enterFromConsole("x3");
        y3 = enterFromConsole("y3");

        boolean isLine = (x3 - x1) / (x1 - x2) == (y3 - y1) / (y1 - y2);

        System.out.println("Точки лежат на одной прямой: " + isLine);
    }
}
