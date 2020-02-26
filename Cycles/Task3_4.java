package by.epam_tc.step1.t1;

//  Составить программу нахождения произведения квадратов первых двухсот чисел


public class Task3_4 {
    public static void main(String[] args) {
        long multSquare;
        long prev;
        int i;

        i = 1;
        multSquare = 1L;
        for (; i <= 200; i++) {
            prev = multSquare;
            long sq;
            sq = i * i;

            multSquare *=  sq;
            if(prev > multSquare){
                System.out.println("На " + i +"-том числе вызвано перполнение. Последнее правильно" +
                        " вычисленное произведение равно " + prev);
                break;
            }
        }
        if(i == 200) {
            System.out.println("Произведение квадратов первых двухсот натуральных чисел равно\n" + multSquare);
        }
    }
}
