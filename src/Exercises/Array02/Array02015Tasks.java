package Exercises.Array02;

import java.util.Arrays;

/**
 * FirstProject
 * 6/10/20 10: 43
 */
public class Array02015Tasks {
    public static void main(String[] args) {
        // Exercises-Arrays-02 - 14
//        int[] a = {1, 2, 2}; //5
//        int[] b = {1, 2, 2, 6, 99, 99, 7, 25}; //5
//        int[] c = {1, 1, 6, 7, 2}; //4
////        System.out.println(sum67(a));
//        System.out.println(sum67(b));
////        System.out.println(sum67(c));

        // Exercises-Arrays-02 - 15
//        int[] k = {2, 3, 2, 2, 4, 2}; //true
//        int[] l = {2, 3, 2, 2, 4, 2, 2}; //false
//        int[] m = {1, 2, 3, 4}; //false
//        System.out.println(sum28(k));
//        System.out.println(sum28(l));
//        System.out.println(sum28(m));

        // Exercises-Arrays-02 - 16
//        int[] k1 = {1, 4, 1, 4}; //true
//        int[] k2 = {1, 4, 2, 4};//false
//        int[] k3 = {1, 1}; //true
//        System.out.println(only14(k1));
//        System.out.println(only14(k2));
//        System.out.println(only14(k3));

        // Exercises-Arrays-02 - 17
        int[] l0 = {1, 2, 2, 1, 3}; // true
        int[] l1 = {1, 2, 1, 3}; // true
        int[] l2 = {1, 2, 1, 3}; // false
        int[] l3 = {1, 2, 1, 3, 4}; //false
        int valueOne = 1;
        int valueTwo = 2;
        int valueThree = 1;
        System.out.println(isEverywhere(l0, valueOne));
        System.out.println(isEverywhere(l1, valueOne));
        System.out.println(isEverywhere(l2, valueTwo));
        System.out.println(isEverywhere(l3, valueThree));


    }

    // Exercises-Arrays-02 - 17
    // We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least
    // one of the pair is that value. Return true if the given value is everywhere in the array.
    // Мы скажем, что значение «везде» в массиве, если для каждой пары смежных элементов в массиве, по крайней мере,
// одна из пары является этим значением. Вернуть true, если данное значение находится повсюду в массиве.
    private static boolean isEverywhere(int[] array, int value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != value && array[i + 1] != value) return false;
            //System.out.println(array[i + 1]);
        }
        return true;
    }

    // Exercises-Arrays-02 - 16
// Given an array of ints, return true if every element is a 1 or a 4
    private static boolean only14(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) return false;
        }
        return true;
    }


    // // Exercises-Arrays-02 - 15
    // Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    private static boolean sum28(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                sum += array[i];
            }
        }
        return sum == 8;
    }

    // Exercises-Arrays-02 - 14
    // Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending
    // to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    public static int sum67(int[] array) {
        int sum = 0;
        boolean sixMode = false; // mode - режим работы

        for (int i = 0; i < array.length; i++) {

            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) {
                sixMode = true;
            } else {
                sum += array[i];
            }

        }
        return sum;
    }


}
