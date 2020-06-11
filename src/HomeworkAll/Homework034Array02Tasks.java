package HomeworkAll;

import java.util.Arrays;

/**
 * FirstProject
 * 6/11/20 21: 01
 */
public class Homework034Array02Tasks {
    public static void main(String[] args) {
        // Exercises-Arrays-02-20
        int[] one = {1, 4, 5, 6, 2}; //true
        int[] two = {1, 2, 3}; //true
        int[] three = {1, 2, 4}; //false
        System.out.println(tripleUp(one));
        System.out.println(tripleUp(two));
        System.out.println(tripleUp(three));

        //Exercises-Arrays-02-21
        int[] q = {2, 10, 3, 4, 20, 5}; //→ [2, 10, 10, 10, 20, 20]
        int[] w = {10, 1, 20, 2}; //[10, 10, 20, 20]
        int[] e = {10, 1, 9, 20}; //[10, 10, 10, 20]
        System.out.println(Arrays.toString(tenRun(q)));
        System.out.println(Arrays.toString(tenRun(w)));
        System.out.println(Arrays.toString(tenRun(e)));

    }

    // Exercises-Arrays-02-21
    // For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until
    // encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
// Для каждого кратного 10 в данном массиве измените все значения, следующие за ним, на кратные 10, пока не встретите
// еще одно кратное 10. Таким образом, {2, 10, 3, 4, 20, 5} дает {2, 10, 10, 10, 20, 20}.
    private static int[] tenRun(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] % 10 == 0) {
                while (input[i + 1] % 10 != 0) { // до тех пор пока след. значение не кратное 10
                    input[i + 1] = input[i];
                }
            }
        }
        return input;
    }

    // Exercises-Arrays-02-20
    // Return true if the array contains, somewhere, three increasing adjacent numbers
    // like .... 4, 5, 6, ... or 23, 24, 25
    public static boolean tripleUp(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] + 2 == array[i + 2]) return true;

        }
        return false;
    }

}
