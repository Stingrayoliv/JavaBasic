package Exercises.Array02;

import java.util.Arrays;

/**
 * FirstProject
 * 6/12/20 12: 16
 */
public class LS035Array022 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 2, 5, 2};
        int[] a3 = {3, 4};

        System.out.println(Arrays.toString(notAlone(a1, 2)));
        System.out.println(Arrays.toString(notAlone(a2, 2)));
        System.out.println(Arrays.toString(notAlone(a3, 3)));

    }

    // We'll say that an element in an array is "alone" if there are values before and after it, and those values are
// different from it. Return a version of the given array where every instance of the given value which is alone is
// replaced by whichever value to its left or right is larger.
    private static int[] notAlone(int[] array, int digit) {
        if (array.length < 3) {
            return array;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == digit && array[i + 1] != digit && array[i - 1] != digit) {
                int bigNumber = array[i - 1];
                if (array[i + 1] > array[i - 1]) {
                    bigNumber = array[i + 1];
                }

                array[i] = bigNumber;
            }
        }

        return array;
    }

}
