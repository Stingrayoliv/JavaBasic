package Exercises;

/**
 * FirstProject
 * 5/23/20 11: 06
 */
public class ExercisesLogic01 {
    public static void main(String[] args) {
//        System.out.println(cigarParty(30, false));// → false
//        System.out.println(cigarParty(50, false));// → true
//        System.out.println(cigarParty(70, true));// → true
//
//        System.out.println(caughtSpeeding(60, false));//0
//        System.out.println(caughtSpeeding(65, false));// → 1
//        System.out.println(caughtSpeeding(65, true));// → 0

//        System.out.println(love6(6, 4));// → true
//        System.out.println(love6(4, 5));// → false
//        System.out.println(love6(1, 5));// → true

//        System.out.println(more20(20));// → false
//        System.out.println(more20(21));// → true
//        System.out.println(more20(22));// → true

        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true

//        System.out.println(teaParty(6, 8));//→1
//        System.out.println(teaParty(3, 8));// →0
//        System.out.println(teaParty(20, 6));// →2

//        System.out.println(twoAsOne(1, 2, 3));// → true
//        System.out.println(twoAsOne(3, 1, 2));// → true
//        System.out.println(twoAsOne(3, 2, 2));// → false

//        System.out.println(lastDigit(23, 19, 13));// → true
//        System.out.println(lastDigit(23, 19, 12));// → false
//        System.out.println(lastDigit(23, 19, 3));// → true

//        System.out.println(maxMod5(2, 3));// → 3
//        System.out.println(maxMod5(6, 2));// → 6
//        System.out.println(maxMod5(3, 2));// → 3

//        System.out.println(blueTicket(9, 1, 0));// → 10
//        System.out.println(blueTicket(9, 2, 0));// → 0
//        System.out.println(blueTicket(6, 1, 4));//→ 10

    }

    //19.01. When squirrels get together for a party, they like to have cigars. A squirrel party is successful when
    // the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper
    // bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
    public static boolean cigarParty(int cigaretNumber, boolean day) {
        if (day == false & cigaretNumber > 40) { //not a day off
            return true;
        } else if (day == true & cigaretNumber > 40 & cigaretNumber <= 60) {//a day off
            return false;
        }
        return false;
    }

    // 19.02 You are driving a little too fast, and a police officer stops you. Write code to compute the result,
    // encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is
    // your birthday -- on that day, your speed can be 5 higher in all cases.
    public static int caughtSpeeding(int speed, boolean birthday) {
        if (speed <= 60 & birthday == false) {
            return 0;
        } else if (speed >= 61 & speed <= 80 & birthday == false) {
            return 1;
        } else if (speed > 81 & birthday == false) {
            return 2;
        } else if (speed <= 65 & birthday == true) {
            return 0;
        } else if (speed >= 66 & speed <= 85 & birthday == true) {
            return 1;
        } else if (speed > 86 & birthday == true) {
            return 2;
        }
        return 0;
    }

    // 19.03 The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if
    // their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
    public static boolean love6(int a, int b) {
        if ((a == 6 | b == 6) ^ (a + b == 6 | Math.abs(b - a) == 6)) return true;
        return false;
    }

    // 19.04 Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also:
    // Introduction to Mod
    public static boolean more20(int a) {
        if (a == 20 + 1 ^ a == 20 + 2) return true;
        return false;
    }

    // 19.05 Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is
    // the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
    public static boolean nearTen(int num) {
        if ((num % 10 <= 2) | (num % 10 >= 8)) return true;
        return false;
    }

    // 19.06 We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad,
    // 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
    // However, if either tea or candy is at least double the amount of the other one, the party is great (2).
    // However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
    public static int teaParty(int teaAmount, int candyAmount) {
        if (teaAmount < 5 | candyAmount < 5) {
            return 0;
        } else if (teaAmount >= 5 & (candyAmount >= 2 * teaAmount)) {
            return 2;
        } else if ((teaAmount >= 2 * candyAmount) & candyAmount >= 5) {
            return 2;
        } else if (teaAmount >= 5 | candyAmount >= 5) {
            return 1;
        }
        return 0;
    }

    //19.07. Given three ints, a b c, return true if it is possible to add two of the ints to get the third
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c | b + c == a | a + c == b) return true;
        return false;
    }

    //19.08 Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    // The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    public static boolean lastDigit(int a, int b, int c) {
        if ((a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10)) return true;
        return false;
    }

    // 19.09 Given two int values, return whichever value is larger. However if the two values have the same remainder
    // when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same,
    // return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else
            return Math.max(a, b);
    }

    // 19.10 You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab,
    // bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10,
    // the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
    // Otherwise the result is 0.
    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 | b + c == 10 | a + c == 10) {
            return 10;
        } else if ((a + b) - (b + c) == 10 ^ (a + b) - (a + c) == 10) {
            return 5;
        } else
            return 0;
    }

}
