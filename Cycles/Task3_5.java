package by.epam_tc.step1.t1;
//найти сумму тех членов ряда, модуль которых >=
//заданного числа е

import java.util.Scanner;

public class Task3_5 {
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

    public static double sequence(int n) {

        return (1.0 / Math.pow(2, n) + 1.0 / Math.pow(3, n));
    }

    public static void main(String[] args) {
        double e;
        double sum;
        int n;

        e = enterFromConsole("Ввведите е");
        sum = 0;
        n = 0;

        while (sequence(n) >= Math.abs(e)) {
            sum += sequence(n);
            n++;
        }

        System.out.println("Сумма членов ряда, модуль которых >= модуля заданного числа=" + sum);
    }
}
