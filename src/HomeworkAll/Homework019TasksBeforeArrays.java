package HomeworkAll;

/**
 * FirstProject Задачи перед массивами. Урок 19
 * 5/19/20 17: 50
 */
public class Homework019TasksBeforeArrays {
    public static void main(String[] args) {
//        System.out.println(backAround("cat"));
//        System.out.println(backAround("Hello"));
//        System.out.println(backAround("a"));

//        System.out.println(startHi("hi there")); //true
//        System.out.println(startHi("hi")); //true
//        System.out.println(startHi("hello hi")); // false

//        System.out.println(hasTeen(13, 20, 10)); //true
//        System.out.println(hasTeen(11, 11, 10)); // false

//        System.out.println(mixStart("mix snacks")); // true
//        System.out.println(mixStart("pix snacks")); // true
//        System.out.println(mixStart("piz snacks")); // false

//        System.out.println(close10(8, 13)); //8
//        System.out.println(close10(13, 8)); //8
//        System.out.println(close10(13, 7)); //0

//        System.out.println(stringE("Hello")); //true
//        System.out.println(stringE("Heelle")); //true
//        System.out.println(stringE("Heelele")); //false

//        System.out.println(everyNth("Miracle", 2)); //"Mrce"
//        System.out.println(everyNth("abcdefg", 2)); //"aceg"
//        System.out.println(everyNth("abcdefg", 3)); //"adg"

        System.out.println(monkeyTrouble(true, true)); // true
        System.out.println(monkeyTrouble(false, false)); // true
        System.out.println(monkeyTrouble(true, false)); //false
    }

    // 19.5
    //Given a string, take the last char and return a new string with the last char added at the front and back,
    //so "cat" yields "tcatt". The original string will be length 1 or more.
    public static String backAround(String firstStr) {
        String result = "";
        String lastSymbol = "";
        lastSymbol = String.valueOf(firstStr.charAt(firstStr.length() - 1));// new String
        result = lastSymbol + firstStr + lastSymbol;
        return result;
    }

    //19.6 Given a string, return true if the string starts with "hi" and false otherwise.
    public static boolean startHi(String first) {
        String second = first.substring(0, 2); // due to receive "hi"
        if (first.length() < 2) return false;
        if (second.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    // 19.7 We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
    // return true if 1 or more of them are teen.
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        int min = 13; // min Age for teen
        int max = 19;// max Age for teen
        return ageOne >= min && ageOne <= max || ageTwo >= min && ageTwo <= max || ageThree >= min && ageThree <= max;
    }

    // 19.8 Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix"
    // .. all count.
    public static boolean mixStart(String first) {
        String second = first.substring(1, 3);
        if (first.length() < 3) return false;
        if (second.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    // 19.9 Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    // Note that Math.abs(n) returns the absolute value of a number.
    public static int close10(int a, int b) {
        int с = 10;
        int result = 0;
        if (Math.abs(a - с) == Math.abs(b - с)) {
            result = 0;
        } else if (Math.abs(a - с) > Math.abs(b - с)) {
            result = b; // return with the smallest value
        } else {
            result = a;
        }
        return result;
    }

    // 19.10 Return true if the given string contains between 1 and 3 'e' chars.
    public static boolean stringE(String a) {
        int amount = 0; // amount value 'e'
        boolean result;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'e') {
                amount++;
            }
        }
        if (amount >= 1 && amount <= 3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    // 19.11
    //Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the
    //string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    public static String everyNth(String first, int n) {
        String result = "";
        for (int i = 0; i < first.length(); i = i + n) {
            String temp = String.valueOf(first.charAt(i));// should receive String
            result = result + temp;
        }
        return result;
    }

    //19.12 We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble
    // if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //return aSmile == true && bSmile == true || aSmile == false && bSmile == false;
        return !(aSmile^bSmile); // второй вариант решения
    }
}
