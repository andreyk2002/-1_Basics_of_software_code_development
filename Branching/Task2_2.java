package by.epam_tc.step1.t1;
//найти МАХ(min(a,b), min(c,d))

import java.util.Scanner;

public class Task2_2 {
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
        double a;
        double b;
        double c;
        double d;

        a = enterFromConsole("a");
        b = enterFromConsole("b");
        c = enterFromConsole("c");
        d = enterFromConsole("d");

        double minAB;
        double minCD;
        minAB = (a < b) ? a : b;
        minCD = (c < d) ? c : d;

        double result;
        result = (minAB > minCD) ? minAB : minCD;

        System.out.println("Result is: " + result);
    }
}
