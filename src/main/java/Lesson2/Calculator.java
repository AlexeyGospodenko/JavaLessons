package Lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Пример работы сканера
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите арифметическую операцию: ");
        String operation = sc.next();
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();

        //if (operation == 5)

        int result;
        if (operation.equals("+")) {
            result = add(a, b);
        } else if (operation.equals("-")) {
            result = sub(a, b);
        } else if (operation.equals("*")) {
            result = multi(a, b);
        } else if (operation.equals("/")) {
            result = div(a, b);
        } else {
            System.out.println("Не знаю такой операции");
            return;
        }
        System.out.println("a " + operation + " b = " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int multi(int a, int b) {
        return a * b;
    }
}
