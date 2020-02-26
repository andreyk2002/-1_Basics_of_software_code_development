package by.epam_tc.step1.t1;
//вычислить значение функции

import java.util.Scanner;

public class Task2_5 {
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
        if (x <= 3) {
            return (x * x - 3 * x + 9);
        }
        return (1 / (x * x * x + 6));
    }

    public static void main(String[] args) {
        System.out.println("Введите x:");
        double x;

        x = enterFromConsole("x");

        System.out.println("Result=" + fx(x));
    }
}
