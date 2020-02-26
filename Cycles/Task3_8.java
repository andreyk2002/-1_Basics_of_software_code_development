package by.epam_tc.step1.t1;
//определить цифры, входящие в запись как перевого,так и второго заданного числа

import java.util.Scanner;

public class Task3_8 {
    public static String enterFromConsole(String message) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.print(message + ">>");
        String string;

        while (!in.hasNextInt()) {
            in.next();
            System.out.print(message + ">>");
        }
        string = in.next();
        return string;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа:");
        String firstDigit;
        String secondDigit;

        firstDigit = enterFromConsole("a");
        secondDigit = enterFromConsole("b");

        int[] equalNumbers;
        equalNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            equalNumbers[i] = -1;
        }

        for (int i = 0; i < firstDigit.length(); i++) {
            int index;
            index = firstDigit.charAt(i) - 48;

            if (equalNumbers[index] == -1) {
                equalNumbers[index]++;
            }
        }
        for (int i = 0; i < secondDigit.length(); i++) {
            int index;
            index = secondDigit.charAt(i) - 48;
            if (equalNumbers[index] == 0) {
                equalNumbers[index]++;
            }
        }

        System.out.print("Общие цифры в записи первого и второго числа - ");
        for (int i = 0; i < 10; i++) {
            if (equalNumbers[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
