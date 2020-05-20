package LessonModulo08;

/**
 * FirstProject
 * 4/30/20 12: 04
 */

public class HelloModulo {

    public static void main(String[] args) {
        helloHelloModulo();
        findLeapYear(190);
        // System.out.println(findLeapYear(190));
        // System.out.println(findLeapYear(1900));
        // System.out.println(findLeapYear(2020));
        // System.out.println(findLeapYear(2019));

        System.out.println(findLeapYearSimple(10));
        System.out.println(findLeapYearSimple(2010));

        System.out.println(findNumber(576798983));
    }

    private static boolean findLeapYear(int year) {
        int leap = year %4; // modulo - год делиться без остатка
        if (leap ==0) { // если остаток будет 0
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean findLeapYearSimple(int year) {
        return year % 4 ==0;
    }

    public static void helloHelloModulo() {
    // 56 % 24 = 8;
    // 56 /24 = 2
    int a = 1;
    int b = 10;
    int c = a/b; // ответ Ноль

    int d = a % 10; // Модуло (остаток от деления)

    System.out.println("Рузультат деления " + c);
    System.out.println("Остаток деления " + d);

    int first = 75;
    int second = 13;
    int f = 9 % 2;
    int ffff = first - (first /second)* second;
    int j = 7 % 2;

    System.out.println(f);
    System.out.println(ffff);
}
    public static boolean findNumber(int number) {
        return number % 2 ==0;
    }
    }

