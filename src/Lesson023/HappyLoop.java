package Lesson023;

/**
 * FirstProject
 * 5/26/20 10: 02
 */
public class HappyLoop {
    public static void main(String[] args) {
//        findHappyPelmen(10);
//        findNumber(1, 100, 3);
//        findNumber(1, 100, 7);

//        mySecondLine(1, 1000, 2);
//        mySecondLineTwo(1, 1000, 2);

        alphabet();
        fibonacci(10);


    }

    // 08.01 Существует такая традиция: при приготовлении пельменей в один из них кладут монетку на счастье.
// Считается, что тому, кому попадется пельмень с монеткой, улыбнется удача.
//Представим, что у нас есть кастрюля, в которой лежит 10 пельменей.
//Один из них счастливый — а именно пятый пельмень.
//Давайте напишем программу, которая ищет счастливый пельмень.
//Программа перебирает пельмени в кастрюле по одному,
//и когда доходит до пятого пельменя — напишет "Вот счастливый пельмень!" и выходит из цикла.
    public static void findHappyPelmen(int number) {
        for (int i = 1; i <= number; i++) {
            if (i == 5) {
                System.out.println("You have it");
            }
        }
    }

    // 08.02 Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void findNumber(int min, int max, int checkNumber) {
        for (int i = min; i <= max; i++) {
            if (i % checkNumber == 0) {
                System.out.print(i + ",");
            }
        }
    }

    // Необходимо вывести на консоль такую последовательность чисел:
    //1 2 4 8 16 32 64 128 256 512
    public static void mySecondLine(int min, int max, int number) {
        int result = 0;
        int count = 0;
        while (result <= max) {
            result = (int) Math.pow(number, count);
            System.out.println(Math.pow(number, count));
            count++;
        }
    }

    public static void mySecondLineTwo(int min, int max, int number) {
        int result = 0;
        int count = min;

        do {
            result = (int) Math.pow(number, count);
            if (result > max) break;
            System.out.println(Math.pow(number, count));
            count++;
        } while (result <= max);
    }

    // 08.05 Вывести алфавит от A-Z по 4 шт. в строку
    public static void alphabet() {
        String az = "az"; // диапазон выйдет от 97 до 122
        int firstLetterInAlphabet, myLastLetterInAlphabet;
        firstLetterInAlphabet = az.codePointAt(0);
        myLastLetterInAlphabet = az.codePointAt(1);

        System.out.println(firstLetterInAlphabet);
        System.out.println(myLastLetterInAlphabet);

        for (int i = firstLetterInAlphabet; i <= myLastLetterInAlphabet; i++) {
            char c = (char) i;
            String result = "";
            System.out.println(result + c + " " + c + " " + c + " " + c+ " ");
            System.out.println("");
        }
    }
    // 08.06 Выведите на экран первые 11 членов последовательности Фибоначчи.
    //первый и второй члены последовательности равны единицам
    //а каждый следующий — сумме двух предыдущих
    //То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
    public static void fibonacci(int lastLine) {
        //  1 1 2 3 5 8 13 21 34 55 89
        int n0 =0;
        int n1 = 1;

        for (int i = 1; i <lastLine ; i++) {
            int myFibonacciNow =n0 +n1;
            n0 = n1;
            n1=myFibonacciNow;

            System.out.println(myFibonacciNow);
        }
    }


}





