package Exercises;

/**
 * FirstProject
 * 6/9/20 22: 53
 */
public class Ls29Exercises_June04 {
    public static void main(String[] args) {

        //System.out.println(countX("xxhixx")); //4
        //System.out.println(changePi("xpix")); //x3.14x
        //System.out.println(changePi("pixpix")); //3.14x3.14x

        //findDigits(99999, 11);

        //int[] a = new int[]{2, 1, 2, 3, 4, 13, 2};
        //System.out.println(countEvents(a));

        //System.out.println(sum13(a));

//        int[] a = new int[]{0, 2, 4}; //true
//        int[] b = new int[]{0, 3, 1}; //false
//
//        System.out.println(lucky13(a));
//        System.out.println(lucky13(b));

        //System.out.println(Arrays.toString(fizzArray(10)));

//        int[] a = new int[]{1, 2, 3};
//        int[] b = new int[]{2, 3, 10};
//        System.out.println(matchUp(a, b));


        int[] a1 = new int[]{2, 1, 3, 5}; //true
        int[] a2 = new int[]{2, 4, 2, 5}; //true
        int[] a3 = new int[]{2, 1, 4, 3, 2, 5}; //false

        System.out.println(modThree(a1));
        System.out.println(modThree(a2));
        System.out.println(modThree(a3));

    }

    //Array2-7 Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
    //Для данного массива целых чисел вернуть true, если массив содержит либо 3 четных, либо 3 нечетных значения, все рядом друг с другом.
    public static boolean modThree(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                result = true;
            }
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i + 2] % 2 == 1) {
                result = true;
            }
        }
        return result;
    }

    //Array2-6 Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding
    // element in nums2 (at the same index).
    // Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

    public static int matchUp(int[] a, int[] b) {
        //a[0] - b[0] <= 2 && a[0] != b[0];
        //Math.abs(a[0] - b[0]) == 2 || Math.abs(a[0] - b[0]) == 1;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - b[i]) == 2 || Math.abs(a[i] - b[i]) == 1) {
                count++;
            }
        }
        return count;
    }

    //Array2-4 Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    // The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for
    // the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
    // The syntax to make a new int array is: new int[desired_length]
    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }


    //Rec1-4 Получив строку, вычислите рекурсивно (без циклов) количество строчных символов 'x' в строке.
    public static int countX(String line) {
        char check = 'x';
        if (line.length() == 0) {
            return 0;
        }
        if (line.charAt(0) == check) {
            return 1 + countX(line.substring(1));
        }
        return countX(line.substring(1));
    }

    //Rec1-5 Получив строку, вычислите рекурсивно (без циклов) новую строку, в которой все появления "pi" были заменены на "3.14".
    public static String changePi(String line) {
        String check = "pi";
        final String PI_VALUE = "3.14";
        if (line.length() < 2) {
            return line;
        }
        if (check.equals(line.substring(0, 2))) { //проверяем два первых символа
            return PI_VALUE + changePi(line.substring(2)); // присоединяем пи к обрезанному массиву вместо первых и дальше проверяем массив без первых двух символов
        }
        return line.substring(0, 1) + changePi(line.substring(1)); //добавляем первый символ, если он не пи
    }

    //Loop1-9 Найдите в заданном диапазоне хотя бы одно натуральное число, которое делится на 11, а при делении на 2, 3, 4, ..., 10 дает в остатке 1.
    public static void findDigits(int max, int number) {
        for (int digit = 0; digit < max; digit++) {
            int count = 0;
            int check = 9; //количество проверок от 2 до 10
            for (int i = 2; i < 2 + check; i++) {
                if (digit % i == 1) {
                    count++;
                }
            }
            if (count == check && digit % number == 0) {
                System.out.println(digit);
            }
//            if (digit % number == 0 && digit % 2 == 1 && digit % 3 == 1
//                    && digit % 4 == 1 && digit % 5 == 1
//                    && digit % 6 == 1 && digit % 7 == 1
//                    && digit % 8 == 1 && digit % 9 == 1 && digit % 10 == 1) {
//                System.out.println(digit);

        }
    }

    //Array2-1 Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    public static int countEvents(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    //Array2-2 Return the sum of the numbers in the array, returning 0 for an empty array.
    // Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
    public static int sum13(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                //break;
                return sum;
            }
            sum = sum + array[i];
        }
        return sum;
    }

    //Array2-3 Given an array of ints, return true if the array contains no 1's and no 3's.
    public static boolean lucky13(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return false;
            }
        }
        return true;
    }

}
