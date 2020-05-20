package Password;
/**
 * Домашняя работа к уроку 12
 * <p>
 * FirstProject
 * 5/9/20 20: 21
 */
public class Password {
    public static void main(String[] args) {
        int start = 2;
        int end = 100;
        showNumber(start, end);

        final int MIN = 60;
        final int MAX = 90;
        //randomNumber(MIN, MAX);

        int times = 10;
        //showRandomNTimes(times); // вывести

        randomSymbol(times);
        randomSymbolLatinAlphabet(); // случайный метод из латыни
        System.out.print("\n чередование символов латыни (чередуя строчную и прописную букву): " + smallAlphabetLetters(times));// чередование символов латыни (чередуя строчную и прописную букву)
        randomSymbolСyrillicAlphabet(); // случайный метод из кириллицы
        System.out.println("\n чередование латинских и кириличных символов: "+LatinThroughСyrillic(times));// чередование латинских и кириличных символов


    }

    // Задача 7. Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
    public static int showNumber(int a, int b) {
        int result = 0;
        System.out.println("простые числа в промежутке от 2 до 100: ");
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        System.out.println("\n");
        return result;
    }

    // Задача 8. Выведите в консоль N раз случайное целое число.
    public static int randomNumber(int min, int max) {
        int result = (int) (Math.random() * (max - min)) + min;
        return result;
    }

    // Задача 9 (дополнение к 8-ой). Запишите этот ряд чисел в строку.
    public static int showRandomNTimes(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            //System.out.print(randomNumber(28, 100) + ", "); // с использованием метода randomNumber
        }
        return result;
    }

    // Задача 10. Выведите в консоль N раз случайный символ.
    public static char randomSymbol(int n) {
        char result = 0;
        char randomSymbol = (char) randomNumber(60, 90);
        System.out.println("n раз случайный символ в рядок:  ");
        for (int i = 0; i <= n; i++) {
            System.out.print(randomSymbol + ", ");
        }
        return result;
    }

    // Задача 11. Выведите случайный символ из латиницы.
    public static char randomSymbolLatinAlphabet() { // символы для латинского алфавита от 65 до 90
        char result = 0;
        result = (char) randomNumber(65, 90);
        System.out.println("\n\nслучайный выбор из латыни: "+ result);
        return result;
    }

    // Задача 12.Выведите случайный символ из латиницы чередуя строчную и прописную букву.
    public static String smallAlphabetLetters(int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            String newTypeSymbol = String.valueOf((char) randomNumber(65, 90));
            if (i % 2 == 0) {
                newTypeSymbol = newTypeSymbol.toLowerCase();
            }
            result += newTypeSymbol;
        }
        return result;
    }

    // Задача 13. Выведите случайный символ из кириллицы.
    public static String randomSymbolСyrillicAlphabet() { // символы кирилицы от 128 до 255
        String result = "";
        char resultOne = (char) randomNumber(1040, 1072);
        System.out.println("\n\n случайный выбор из кириллицы: "+ resultOne);
        return result;
    }

    // Задача 14. Выведите случайный символ из латиницы и кириллицы чередую один другой.
    public static String LatinThroughСyrillic(int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            String latinSymbol = String.valueOf((char) randomNumber(65, 90)).toLowerCase();
            String cyrillicSymbol = String.valueOf((char) randomNumber(1040, 1072)).toLowerCase();
            result += latinSymbol + cyrillicSymbol;
        }
        return result;
    }

}

