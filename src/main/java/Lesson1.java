public class Lesson1 {
    //Это комментарий
    //Модифкатор достыпа / статический или не статический / имя метода / его параметры в скобках ()
    public static void main(String[] args) {
        //переменная состоит из типа и имени. Имя задаем сами
        //Примитивные типы byte / short / int / long / char / boolean / float / double

        //Целочисленные типы
        byte b = 120; // -128 for 127 2^8

        short s; // –32768 до 32767 2^16
        int i; //–9223372036854775808 до 9223372036854775807 2 ^ 32
        long l; // 2 ^ 64

        //Дробные типы (вещественные)
        float f = 12.23f;
        double d = 12.23;

        //Символьный типа
        char c = '/';
        System.out.println(c);

        //Логический
        boolean bool = true; //false или true
        System.out.println(bool);

        //Строковый
        String string = "some string";
        System.out.println(string);

        //Объявление переменной
        int x;

        //Инициализации переменной
        x = 5;

        //Объявление и инициализация
        int y = 6;

        System.out.println(x);
        System.out.println("x");

        System.out.println("выводим строку");

        //Арифметический операции
        System.out.println();
        System.out.println("Арифметические операции:");
        int add = 1 + 2; //3
        int sub = 2 - 6; //-4
        int multi = add * sub;
        double div = (double) 5 / 3; // 1.33
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);

        //Деление по модулю
        System.out.println();
        System.out.println("\nДеление по модулю:");
        int mod = 11 % 3;
        System.out.println(mod);

        //Инкремент и декремент. C++
        //Инкремент - увеличение на 1
        //декремент - уменьшение на 1
        System.out.println("\nИнкремент и декремент:");
        int inc = 5;
        System.out.println(inc);
        inc++;
        System.out.println(inc);

        int dec = 8;
        System.out.println(dec);
        dec--;
        System.out.println(dec);
    }
}
