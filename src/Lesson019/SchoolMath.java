package Lesson019;

/**
 * FirstProject
 * 5/19/20 10: 11
 */
public class SchoolMath {
    public static void main(String[] args) {
        //System.out.println(largestCommonDenomination(7, 5));
        //System.out.println(leastCommonMultiple(15, 20));
        boolean weekday = true;
        boolean vacation = true;
        //System.out.println(sleepIn(weekday, vacation));
        //System.out.println(diff21(21));
        //System.out.println(nearHundred(250));// true
        System.out.println(missingChar("Andrey", 16));


    }

    public static int leastCommonMultiple(int a, int b) {
        int lsm;
        int result;
        return a * b / largestCommonDenomination(a, b);
    }

    public static int largestCommonDenomination(int a, int b) {
        int result = 0;
        //int lcd = 5; для проверки
        int minNumber;
        if (a < b) {
            minNumber = a;
        } else {
            minNumber = b;
        }
        for (int i = 1; i < minNumber; i++) {
            if (a % i == 0 & b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday & vacation;
    }

    // 19.02
    //Если задано int n, вернуть абсолютную разницу между n и 21, за исключением возврата вдвое по абсолютной разнице,
    // если n больше 21.
    //diff21(19) → 2
    //diff21(10) → 11
    //diff21(21) → 0
    public static int diff21(int n) {
        int result = 0;
        int magicNumber = 21;
        if (n < magicNumber) {
            result = 2 * Math.abs(n - magicNumber);
        } else {
            result = Math.abs(n - magicNumber);
        }
        return result;
    }

    public static boolean nearHundred(int a) {
        boolean result = false;
        int range = 10;
        int pylonOne = 100;
        int pylonTwo = 200;
        return a >= pylonOne - range & a <= pylonOne + range || a >= pylonTwo - range & a <= pylonTwo + range;
    }

    //Если задана непустая строка и int n, вернуть новую строку, в которой символ с индексом n был удален.
    //Значение n будет действительным индексом символа в исходной строке (т.е. n будет в диапазоне 0..str.length () - 1 включительно).
    public static String missingChar(String str, int index) {
        String result = "";
        if (index >= str.length()) {
            result = "Sorry, not possible";
        } else {
            result = str.substring(0, index) + str.substring(index, str.length());
        }
        //System.out.println(str.charAt(index)); для проверки
        return result;

    }


}

