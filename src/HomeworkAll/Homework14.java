package HomeworkAll;
/**
 * FirstProject
 * 5/12/20 13: 25
 */
public class Homework14 {
    public static void main(String[] args) {
        int a = 3;
        multiplicationTableFor(a);
        multiplicationTableWhile(a);
        multiplicationTableWhileDo(a);

        int yearOne = 2000;
        int yearTwo = 2021;
        printLeapYearsFor(yearOne, yearTwo);
        printLeapYearsWhile(yearOne, yearTwo);
        printLeapYearsDoWhile(yearOne, yearTwo);

        //System.out.println(checkLeapYear(2020)); для проверки метода
        System.out.println("Решение через for для первой задачи: "+findSumForTwo(2, 4));
        System.out.println("Решение через while для первой задачи: "+findSumForWhile(2, 4));
        System.out.println("Решение через do while для для первой задачи: "+findSumForDoWhile(2, 4));
    }

    // Задача 1. Дано два числа (a и b). Написать метод, который вернет сумму всех чисел между (a и b).
    public static int findSumForOne(int a, int b) { //
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    // Способ 1. Через for.
    public static int findSumForTwo(int a, int b) { //не включительно а и b
        int sum = 0;
        if (a == b) {
            sum = a + b;
        } else {
            for (int i = a + 1; i < b; i++) {
                sum += i;
            }
        }
        return sum;
    }

    // Способ 2. Через while.
    public static int findSumForWhile(int a, int b) {
        int sum = 0;
        int i = a + 1;

        if (a == b) {
            sum = a + b;
        } else {
            while (i < b) {
                sum += i;
                i++;
            }
        }
        return sum;
    }

    // Способ 2. Через while.
    public static int findSumForDoWhile(int a, int b) {
        int sum = 0;
        int i = a + 1;
        if (a == b) {
            sum = a + b;
        } else {
            do {
                sum += i;
                i++;
            }
            while (i < b);
        }
        return sum;
    }

    // Задача 2. Реализовать метод печатающий таблицу умножения для заданного числа Пример: multiplicationTable(3)
    // Способ 1. Через for.
    public static void multiplicationTableFor(int a) {
        System.out.println("решение таблицы через for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + "=" + (a * i));
        }
    }

    // Способ 2. Через while.
    public static void multiplicationTableWhile(int a) {
        System.out.println("решение таблицы через while");
        int i = 1;
        while (i <= 10) {
            i++;
            System.out.println(a + "x" + i + "=" + (a * i));
        }
    }
    // Способ 2. Через do while.
    public static void multiplicationTableWhileDo(int a) {
        System.out.println("решение таблицы через do while");
        int i = 1;
        do {
            System.out.println(a + "x" + i + "=" + (a * i));
            i++;
        }
        while (i <= 10);

    }

    // Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
    // Способ 1. Через for.
    public static int printLeapYearsFor(int yearOne, int yearSecond) {
        int leapYearnumber = 0;
        System.out.println("Решение через for для высокосного года");
        for (int i = yearOne; i < yearSecond; i++) {
            if (checkLeapYear(i) == true) {
                System.out.println(i);
            }
        }
        System.out.println("\n");
        return leapYearnumber;
    }

    public static boolean checkLeapYear(int year) {
        int y400 = 400;
        int y100 = 100;
        int y4 = 4;
        return year > 0 && (year % y400 == 0) ^ !(year % y100 == 0) && (year % y4 == 0);
    }

    // // Способ 2. Через while.
    public static void printLeapYearsWhile(int min, int max) {
        int i = min;
        System.out.println("Решение через while для высокосного года");
        while (i < max) {
            if (checkLeapYear(i) == true) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printLeapYearsDoWhile(int min, int max) {
        int i = min;
        System.out.println("Решение через do while для высокосного года");
        do {
            if (checkLeapYear(i) == true) {
                System.out.println(i);
            }
            i++;
        } while (i < max);

    }


}

