package by.epam_tc.step1.t1;
// вычислить значения функции на отрезке [a,b] с шагом h

import java.util.Scanner;

public class Task3_2 {
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

    public static double fx(double x) {
        double v = (x > 2) ? x : -x;
        return v;
    }

    public static void main(String[] args) {
        System.out.println("Введите интервал [a,b]");
        double a;
        double b;

        a = enterFromConsole("a");
        b = enterFromConsole("b");

        System.out.print("Введите шаг h");
        double h;

        h = enterFromConsole("h");

        double i;

        i = a;

        while (i <= b) {

            System.out.println("x=" + i + ";F(x)=" + fx(i));
            i += h;
        }

    }
}
