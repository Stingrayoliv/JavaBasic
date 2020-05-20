package LessonPrimitivesByteShortIntLong02;

/**
 * знакомство с базовыми типами данных:
 */
public class HalloInteger {

    // определение, обьячвление, инициализация переменных
    // Defenition, declaration, initialization
    public static void main(String[] args) {
        //goodMorningIntenger();
        //goodMorningByte();
        //goodMorningShort();
        goodMorningLong();
    }

    public static void goodMorningDefenition() {
        int a, b, c, d, g;
        a = 1;
        b = 2;
        c = 3;
        d = a + b + c;
        g = 5;
    }

    public static void goodMorningLong() {
        long a = 12345L;
        long b = 23456L;
        Long c = 223_372_036_854_775_807L;
        System.out.println("Сумма всех переменных в методе: " + (a + b + c));

    }

    public static void goodMorningShort() {
        short firstVariable = 1000;
        short secondVariable = 15000;
        short thirdVariable = (short) (firstVariable + secondVariable);

        System.out.println("Если сложить переменную: " + firstVariable
                + " \n и переменную " + secondVariable
                + " \n \t то скорее всего мы получим значение thirdVariable" + thirdVariable);
    }

    public static void goodMorningByte() {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a + b);
        System.out.println("странный байт: " + c);

        byte x = 120;
        byte y = 10;
        byte z = (byte) (x + y);
        System.out.println("угадай значение: " + z);
        // -126 до 127
    }

    public static void goodMorningIntenger() {
        // создаем переменные и присваиваем этим переменным значения
        int a = 2;
        int b = 3;
        int с = a + b;
        System.out.println("мы хотим увидеть сумму переменных а и б: " + с);
        // найдем периметр квадрата со стороной равной 4
        System.out.println("периметр квадрата со стороной 4 равен: " + 4 * 4);
        // найдем площадь прямоугольника со сторонами 5 и 7:
        int x = 5;
        int y = 7;
        int square = 5 * 7;
        System.out.println("площадь: " + square);
    }
}

