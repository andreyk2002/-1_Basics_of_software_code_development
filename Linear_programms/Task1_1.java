package by.epam_tc.step1.t1;

// Найдите значение функции=((a - 3 ) * b / 2) + c;

import java.util.Scanner;

public class Task1_1 {

    public static double enterFromConsole(String message)
    {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print(message + ">>");
        double aDouble;
       // aDouble = in.nextDouble();
        while (!in.hasNextDouble()) {
            in.next();
            System.out.print(message + ">>");
        }
        aDouble = in.nextDouble();
        return aDouble;
    }

    public static double resultZ(double a, double b, double c) {

        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.println("Enter function parameters");

        double a;
        double b;
        double c;

        a = enterFromConsole("a");
        b = enterFromConsole("b");
        c = enterFromConsole("c");
        System.out.println("result=" + resultZ(a, b, c));

    }
}








