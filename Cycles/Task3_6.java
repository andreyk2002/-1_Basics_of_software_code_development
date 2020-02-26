package by.epam_tc.step1.t1;
//вывести на экран соответствия между символами и их
//численными обозначениями в памяти компьютера

import java.util.Scanner;

public class Task3_6 {
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
        System.out.println("Введите численный интервал (a,b) для отображения символов");
        int a;
        int b;

        a = enterFromConsole("a");
        b = enterFromConsole("b");

        for (int i = a; i < b; i++) {
            System.out.println("Код символа=" + i + "\tсимвол=" + (char) i);
        }
    }
}
