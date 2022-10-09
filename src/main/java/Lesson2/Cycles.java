package Lesson2;

public class Cycles {
    public static void main(String[] args) {

        //Простой цикл
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println(i);
        }

        //Сумма чисел в каком-то числовом диапазоне
        int sum = 0;
        for (int i = 0; i <= 9; i ++) {
            sum = sum + i;
            System.out.println("Шаг №" + i + " sum = " + sum);
        }

        //Возведение в степень
        int x = 5, sqr = 4;
        int result = x;
        for (int i = 1; i < sqr; i++) {
            result = result * x;
        }
        System.out.println(result);
    }

    //В уроке будут также циклы while do и do while
}
