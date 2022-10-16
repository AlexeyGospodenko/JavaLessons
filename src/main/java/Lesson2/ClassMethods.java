package Lesson2;

import java.lang.Integer;
import java.math.BigDecimal;

public class ClassMethods {
    public static void main(String[] args) {
        sayHello();

        //ООП - Объектно Ориентированное Программирование. C - не ООП. С++, C#, Java, Python - ООП.
        String str = "Какая-то строка и еще какие-то значения";
        //КАКАЯ-ТО СТРОКА
        int ln = str.length();
        System.out.println(ln);
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("ти"));
        System.out.println(str.substring(5));
        String[] arrStr = str.split(" ");
        printArray(arrStr);

        BigDecimal cInt = new BigDecimal("-67");
        System.out.println(cInt.signum());

        TestClass testClass = new TestClass();
        testClass.sayHelloWorld();
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void printArray(String[] array) {
        System.out.println("call String[]: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "] = " + array[i] + "\n");
        }
        System.out.println();
    }
}
