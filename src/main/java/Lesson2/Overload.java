package Lesson2;

public class Overload {
    public static void main(String[] args) {
        //Перегрузка - это приём программирования, который позволяет разработчику в одном классе для методов с разными
        // параметрами использовать одно и то же имя
        int[] intArray = {0, 5, 7, 9};
        printArray(intArray);
        String[] strArray = {"String1", "String 2", "String3"};
        printArray(strArray);
    }

    static void printArray(int[] array) {
        System.out.println("call int[]: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printArray(String[] array) {
        System.out.println("call String[]: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
