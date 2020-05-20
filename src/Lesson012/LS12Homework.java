package Lesson012;
/**
 * FirstProject
 * 5/7/20 10: 06
 */

public class LS12Homework {
    public static void main(String[] args) {
        int n = 5; //  сколько раз нужно вывести
        //randomDigits(n);
        randomSymbol(n);
        System.out.println(latineAlphabet(10));
        System.out.println(smallAlphabetLetters(10));

    }

    //Выведите в консоль N раз случайное целое число.
    public static void randomDigits(int n) {
        int result = 0;
        final int MIN = 28;
        final int MAX = 100;
        for (int i = 0; i < n; i++) {
            result = (int) (Math.random() * (MAX - MIN)) + MIN;
            System.out.print(result + ", ");
        }
    }

    //10. Выведите в консоль N раз случайный символ.
    public static void randomSymbol(int n) {
        char symbol1 = 0;
        final int MIN = 60;
        final int MAX = 90;
        for (int i = 0; i < n; i++)
            symbol1 = (char) ((int) (Math.random() * (MAX - MIN)) + MIN);
        System.out.println(symbol1 + " ");
    }

    public static int random(int min, int max) { // метод уникальный для всех
        int result = (int) (Math.random() * (max - min)) + min;
        return result;

    }

    public static String latineAlphabet(int length) {
        String result = "";
        char symbol = 0;
        final int MIN = 61;
        final int MAX = 90;
        for (int i = 0; i < length; i++) {
            symbol = (char) (random(MIN, MAX));
            result = result + symbol;
        }
        return result;
    }
    public static String smallAlphabetLetters(int length) {
        String result = "";
        char symbol = 0;
        String convertSymbol = "";
        final int MIN = 61;
        final int MAX = 90;
        for (int i = 0; i < length; i++) {
            symbol = (char) (random(MIN, MAX));
            convertSymbol = String.valueOf(symbol);

            if (i %2 == 0) {
                convertSymbol = convertSymbol.toLowerCase();
            }
            result = result + convertSymbol;
        }
        return result;
    }

    }

