package by.epam_tc.step1.t1;

import java.util.Scanner;

//поменять местами целую и дробную части числа nnn.ddd
public class Task1_4 {
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

    public static void main(String[] args) {

        System.out.println("Введите число вещественное число (три разряда в целой и три в дробной части)");
        double r;
        r = enterFromConsole("r");
        System.out.println("Вы ввели:" + r);

        double reverseNumber;
        reverseNumber = (int) (r * 1000) % 1000;
        reverseNumber += ((int) r) / 1000.0;

        System.out.println("'Перевёртыш':" + reverseNumber);
    }
}
