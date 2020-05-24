package Exercises;
/**
 * FirstProject
 * 5/22/20 10: 03
 */
public class ExercisesLogic02 {
    public static void main(String[] args) {
//        System.out.println(roundSum(16, 17, 18));// → 60
//        System.out.println(roundSum(12, 13, 14));// → 30
//        System.out.println(roundSum(6, 4, 4));// → 10

//        System.out.println(luckySum(1, 2, 3));// → 6
//        System.out.println(luckySum(1, 2, 13));// → 3
//        System.out.println(luckySum(1, 13, 3));// → 1

//        System.out.println(closeFar(1, 2, 10));// → true
//        System.out.println(closeFar(1, 2, 3));// → false
//        System.out.println(closeFar(4, 1, 3));// → true

//        System.out.println(makeChocolate(4, 1, 9));// → 4
//        System.out.println(makeChocolate(4, 1, 10));// → -1
//        System.out.println(makeChocolate(4, 1, 7));// → 2

        System.out.println(evenlySpaced(2, 4, 6));// → true
        System.out.println(evenlySpaced(4, 6, 2));// → true
        System.out.println(evenlySpaced(4, 6, 3)); //false
    }

    //19.05 For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or
    // more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is
    // less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
    // To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
    // Write the helper entirely below and at the same indent level as roundSum().
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 >= 5) return num + 10 - num % 10;
        return num - num % 10;
    }

    //19.06 Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards
    // the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
    public static int luckySum(int a, int b, int c) {
        if (a != 13 & b != 13 & c != 13) {
            return a + b + c;
        } else if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else
            return 0;
    }

    // 19.07 Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the
    // other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute
    // value of a number.
    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) == 1 & Math.abs(c - a) >= 2 & Math.abs(c - b) >= 2) {
            return true;
        } else if (Math.abs(c - a) == 1 & Math.abs(b - a) >= 2 & Math.abs(c - b) >= 2) {
            return true;
        } else {
            return false;
        }
    }

    // 19.08 We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars
    // (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars.
    // Return -1 if it can't be done.
    public static int makeChocolate(int numberSmall, int numberBig, int goalKilo) {
        int sizeSmall = 1; //small bars (1 kilo each)
        int sizeBig = 5; // big bars (5 kilos each)
        if (goalKilo % sizeBig == 0 && goalKilo / sizeBig == numberBig) { // we can without small bars
            return 0;
        } else if (goalKilo % sizeBig == 0 && goalKilo / sizeBig != numberBig) {// we don't have enough big bars
            return -1;
        } else {
            return (goalKilo - sizeBig * numberBig) / sizeSmall;// return a number of small bars
        }
    }

    //19.09 Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three
    // values are evenly spaced, so the difference between small and medium is the same as the difference
    // between medium and large.

    public static boolean evenlySpaced(int a, int b, int c) {
        if (Math.abs(findMedium(a, b, c) - findSmallestNumber(a, b, c)) == Math.abs(findLargestNumber(a, b, c) - findMedium(a, b, c)))
            return true;
        return false;
    }

    public static int findSmallestNumber(int a, int b, int c) {
        if (a < b & a < c) {
            return a;
        } else if (b < a & b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static int findLargestNumber(int a, int b, int c) {
        if (a > b & a > c) {
            return a;
        } else if (b > a & b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int findMedium(int a, int b, int c) {
        if (a != findSmallestNumber(a, b, c) & a != findLargestNumber(a, b, c)) {
            return a;
        } else if (b != findSmallestNumber(a, b, c) & b != findLargestNumber(a, b, c)) {
            return b;
        } else
            return c;
    }
}
