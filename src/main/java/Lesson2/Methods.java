package Lesson2;

public class Methods {
    //Переменная на уровне класса
    static int x = 3;

    public static void main(String[] args) {
        System.out.println("Запуск main");

        //Для того чтобы обратиться к методу необходимо указать его имя и параметры
        emptyMethod();
        sayHelloWorld();

        String someName = "John";
        sayHelloName(someName);

        System.out.println("x = " + x);

        sayValue(5);

        int five = getFive();
        System.out.println("getFive = " + five);
        System.out.println("getFive = " + getFive());

        System.out.println("a + b = " + add(1, 2));
        System.out.println("a + b = " + addShort(3, 4));

        isPositive(-3);
        System.out.println("Число положительное: " + isPositiveModify(-3));
        System.out.println("Число положительное: " + isPositiveOptimization(3));
    }

    //Метод состоит из сигнатуры и тела
    //Сигнатура: Модификатор доступа (не обязательно) / статический или не статический (не обязательно) /
    //           возвращаемое значение (обязательно) /имя метода (обязательно) / его параметры в скобках () (обязательно)
    //Тело: код между фигурных скобок
    static void emptyMethod() {
    }

    static void sayHelloWorld() {
        System.out.println("Hello world!");
    }

    static void sayHelloName(String name) {
        System.out.println("Hello " + name);
    }

    static void sayValue (int val) {
        System.out.println("Значение переменной = " + val);
        System.out.println("x = " + x);
    }

    static int getFive() {
        return 5;
    }

    static int add(int a, int b) {
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        int result;
        result = a + b;
        return result;
    }

    static int addShort(int a, int b) {
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        return a + b;
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное;
    // Замечание: ноль считаем положительным числом.
    static void isPositive(int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isPositiveModify(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPositiveOptimization(int value) {
        return value >= 0;
    }

}
