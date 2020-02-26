package by.epam_tc.step1.t1;
  /*определить, существует ли треугольник с заданными углами
     и если да, то является ли он прямоугольным
 */

import java.util.Scanner;

public class Task2_1 {
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
        System.out.println("Введите два угла треугольника:");

        double firstCorner;
        double secondCorner;

        firstCorner = enterFromConsole("A");
        secondCorner = enterFromConsole("B");

        if (firstCorner == 90.0
                || secondCorner == 90.0
                || 180.0 - firstCorner - secondCorner == 90.0) {
            System.out.println("Заданный треугольник прямоугольный");
        } else if (firstCorner + secondCorner < 180) {
            System.out.println("Заданный треугольник не прямоугольный");
        } else {
            System.out.println("Заданный треугольник не существует");
        }
    }
}
