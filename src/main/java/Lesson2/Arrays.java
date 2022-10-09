package Lesson2;

public class Arrays {
    public static void main(String[] args) {
        //Объявление с указанием размера
        int[] arr = new int[6];

        //Инициализация
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 7;
        arr[5] = 1;

        //Объявление и инициализация
        int[] arrInit = {4, 2, 3, 5, 7, 1};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("Длина массива: " + arr.length);

        //Прохождение массива
        System.out.println("\nПеребор массива циклом");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Прохождение массива обратным порядком
        System.out.println("\nПеребор массива циклом обратно");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //Continue - переходит на следующую итерацию
        System.out.println("\nРабота с continue");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }

        //Break - завершение цикла
        System.out.println("\nРабота с break");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                break;
            }
            System.out.print(arr[i] + " ");
        }

        //Двумерные массивы
        System.out.println("\n\nДвумерные массивы");
        int [][] doubleArray = {{1, 4, 2}, {9, 5, 3}};
        System.out.print(doubleArray[0][0] + " ");
        System.out.print(doubleArray[0][1] + " ");
        System.out.print(doubleArray[0][2] + " ");
        System.out.println();
        System.out.print(doubleArray[1][0]  + " ");
        System.out.print(doubleArray[1][1]  + " ");
        System.out.print(doubleArray[1][2]  + " ");

        System.out.print("\n\nПроход двумерного массива циклами");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println();
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
        }

        System.out.print("\n\nПроход не равномерного двумерного массива циклами");
        int [][] doubleArrayTwo = {{1, 4, 2}, {9, 5}, {4, 2, 7, 8, -1}};
        for (int i = 0; i < doubleArrayTwo.length; i++) {
            System.out.println();
            for (int j = 0; j < doubleArrayTwo[i].length; j++) {
                System.out.print(doubleArrayTwo[i][j] + " ");
            }
        }
    }
}
