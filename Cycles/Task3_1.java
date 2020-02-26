package by.epam_tc.step1.t1;
//программа сумирует все числа от 1 до введённого пользователем числа

import java.util.Scanner;

public class Task3_1 {
    public static int enterFromConsole(String message)
    {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print(message + ">>");
        int aInt;
        while (!in.hasNextInt()) {
            in.next();
            System.out.print(message + ">>");
        }
        aInt = in.nextInt();
        return aInt;
    }
    public static void main(String[] args) {

        int limit;
        long sum;

        limit = enterFromConsole("Введите предел вычислений (целое положительное число)");
        sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("Сумма от 1 до введённого вами числа равна " + sum);
    }

}
