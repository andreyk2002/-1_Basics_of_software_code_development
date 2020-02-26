package by.epam_tc.step1.t1;

//Вычислить значение выражения по формуле (b^2+(b^2+4ac))/2a-....

import java.util.Scanner;

public class Task1_2 {
    public static double result(double a, double b, double c) {
        double squarePart = Math.sqrt(b * b + 4 * a * c);

        return ((b + squarePart) / 2 * a) - (a * a * a * c)
                + (1 / (b * b));
    }

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
        System.out.println("Enter function parameters");

        double a;
        double b;
        double c;

        a = enterFromConsole("a");
        b = enterFromConsole("b");
        c = enterFromConsole("c");
        System.out.println("result=" + result(a, b, c));

    }
}
