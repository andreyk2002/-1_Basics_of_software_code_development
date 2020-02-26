package by.epam_tc.step1.t1;

//  Найти сумму квадратов первых ста чисел

public class Task3_3 {
    public static void main(String[] args) {
        long sumSquare = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquare += i * i;
        }

        System.out.println("Сумма квадратов первых ста натуральных чисел равна " + sumSquare);
    }
}
