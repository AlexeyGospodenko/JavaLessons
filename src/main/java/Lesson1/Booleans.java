package Lesson1;

public class Booleans {
    public static void main(String[] args) {
        //Операторы сравнения
        //>, <, >=, <=, ==, !=
        int x = 5, y = 5;
        boolean boolFalse = x == y;
        System.out.println(boolFalse);

        boolean boolTrue = x <= y;
        System.out.println(boolTrue);

        //Оператор ветвления if
        /*
        if () {
        } else if () {
        } else {
        };
        */

        if (x == 1) {
            System.out.println("x = 1");
        } else if (x == 2) {
            System.out.println("x = 2");
        } else if (x == 3) {
            System.out.println("x = 3");
        } else {
            System.out.println("x not in (1, 2, 3)");
        }
    }
}
