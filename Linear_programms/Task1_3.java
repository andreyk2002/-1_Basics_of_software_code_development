package by.epam_tc.step1.t1;
//вычислить значение по формуле

import java.util.Scanner;

public class Task1_3 {
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

    public static double result(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

    public static void main(String[] args) {
        System.out.println("Enter function parameters");
        double x;
        double y;

        x = enterFromConsole("x");
        y = enterFromConsole("y");

        System.out.println("Result is: " + result(x, y));
    }
}
