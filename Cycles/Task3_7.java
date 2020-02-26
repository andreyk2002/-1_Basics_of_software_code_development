package by.epam_tc.step1.t1;
//для каждого натуралького числа в промежутке от m до n
//вывести все делители, кроме единицы и самого числа

import java.util.Scanner;

public class Task3_7 {
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
        System.out.println("Введите промежуток [m,n]");
        int m;
        int n;

        m = enterFromConsole("m");
        n = enterFromConsole("n");

        for (int i = m; i <= n; i++) {
            System.out.println("Число:=" + i + "\tделетили:");

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    if (j * j != i) {
                        System.out.print(i / j + " ");
                    }
                }
            }
        }
    }
}
