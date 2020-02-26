package by.epam_tc.step1.t1;
//задана длительность прошедшего времени в секундах
//вывести данное значение длительности в часах, минутах, секундах
// в формате HH MM SS

import java.util.Scanner;

public class Task1_5 {
    public static long enterFromConsole(String message)
    {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print(message + ">>");
        long aLong;
        // aDouble = in.nextDouble();
        while (!in.hasNextLong()) {
            in.next();
            System.out.print(message + ">>");
        }
        aLong = in.nextLong();
        return aLong;
    }
    public static void main(String[] args) {
        long allSeconds;
        allSeconds = enterFromConsole("Введите длительность прошедшего времени в секундах");

        long hours;
        int minutes;
        int seconds;

        hours = 0;
        minutes = 0;
        seconds = 0;

        while (allSeconds >= 3600) {
            hours++;
            allSeconds -= 3600;
        }
        while (allSeconds >= 60) {
            minutes++;
            allSeconds -= 60;
        }
        seconds = (int) allSeconds;

        System.out.println("Ваше время:" + hours + "ч " + minutes + "м "
                + seconds + "c.");

    }
}
