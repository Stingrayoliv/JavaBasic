package Bubblesort;

import java.util.Arrays;

/**
 * FirstProject
 * 6/5/20 09: 34
 */
public class CoctailSort {
    public static void main(String[] args) {
        int[] myLittleArray = {100, 24, 56, 24, 87, 45, 15, 98, 1};
        //System.out.print(Arrays.toString(cocktailSort(myLittleArray));
    }

    public static int[] cocktailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int count = 0;
        while (start <= end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] ^ array[i + 1];
                    array[i + 1] = array[i + 1] ^ array[i];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i] > array[i - 1]) {
                    array[i] = array[i] ^ array[i - 1];
                    array[i - 1] = array[i - 1] ^ array[i];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
            start++;
            count++;
            System.out.println(count);
        }
        return array;
    }

}
