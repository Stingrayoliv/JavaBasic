package Lesson013;

/**
 * FirstProject
 * 5/11/20 09: 48
 */
public class AOExercise1201 {
    public static void main(String[] args) {
        System.out.println(intReverse(123));
        //System.out.println(intReverse());
        //oddEven(123);
        //printLineNtimes();
        primeNumber(2, 100);
        //cyrillicTest();
    }

    // Задача: 1: Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке
    //Задача №2 :Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа. Например
    static int intReverse(int digit) {
        // х%100= это у нас сотни
        // (х - cотни) %10 это у нас десятки
        // (х минус сотки и десятки) = это у нас единицыж
        // сначала единицы умножаем на сто, десятки на десять, сотни = новое трехнозначное число наоборот
        int hundreds = 0; // сотни
        int decimal = 0; // десятки
        int units = 0;
        // если мы знаем разрядность числа, то мы знаем сколько знаков в числе
        // то есть мы знаем n
        int n = 3;
        for (int i = 0; i > n; i++) {

        }
        //hundreds = (digit - digit % 100)/100;
        hundreds = digit / 100;
        System.out.println("наши сотни" + hundreds);
        //decimal = (digit - hundreds) % 10;
        decimal = (digit - hundreds * 100) / 10;
        System.out.println("наши сотни" + hundreds);
        units = (digit - hundreds * 100 - decimal * 10);
        System.out.println(hundreds + decimal + units);


        return units * 100 + decimal * 10 + hundreds;
        // задача 2

    }

    public static void veryClever(int digit) {
        String temp = String.valueOf(digit);
        String reverse;
        reverse = new StringBuffer(temp).reverse().toString();
    }

    // Задано 3:
    // Дано целое трехзначное число. Написать метод, который определит четность/ нечетность разрядов этого числа. Например:
    public static void oddEven(int a) {
        if (a % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }

    }

    // Задача 4: Реализовать метод, который выводит на экран заданную строку N раз.
    //printLineNtimes(“hello”,3)
    //hello
    //hello
    //hello
    public static void printLineNtimes(String sayWhat, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(sayWhat);
        }

    }

    // простое число, это то число которое ТОЛЬКО делится на самого себя или единицу делится без остатка
    // N%1 ==0 Или N %N==0;
    // Задание 7 к уроку 12. Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
    public static void primeNumber(int min, int max) {
        for (int i = min; i < max; i++) {
            int count = 0; //проверяем остаток деления
            for (int j = min; j <= i && count < 2; j++) { //  count<2 - простые числа начинаеются от 1
                if (i % j == 0) {
                    count = count + 1; // // увеличиваем темпоральную вспомогательную переменную, если остаток деления 0
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
    public static void cyrillicTest() {
        String firstOne = "апролдджэйцукенгшщзячсмитьбющшгунр";
        String name = "Андрей";
        System.out.println(name.codePointAt(0));
        System.out.println(name.codePointAt(1));

        for (int i = 1040; i < 1071; i++) {
            char temp = (char) i;
            System.out.println(temp);
        }
    }
}
