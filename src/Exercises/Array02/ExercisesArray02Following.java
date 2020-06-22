package Exercises.Array02;

import java.util.Arrays;

/**
 * FirstProject
 * 6/19/20 11: 31
 */
public class ExercisesArray02Following {
    public static void main(String[] args) {
        //Exercises-Arrays-02 - 23
        int[] a = {0, 5, 0, 3}; //[5, 5, 3, 3]
        int[] b = {0, 4, 0, 3}; //[3, 4, 3, 3]
        int[] c = {0, 1, 0}; //[1, 1, 0] Если справа от нуля нет нечетного значения, оставьте ноль как ноль.

        System.out.println(Arrays.toString(zeroMax(a)));
        System.out.println(Arrays.toString(zeroMax(b)));
        System.out.println(Arrays.toString(zeroMax(c)));

        //Exercises-Arrays-02 - 24
//        int[] k = {1, 2, 3, 4, 100}; //3
//        int[] l = {1, 1, 5, 5, 10, 8, 7};//5
//        int[] m = {-10, -4, -2, -4, -2, 0};//-3
//        System.out.println(centeredAverage(k));
//        System.out.println(centeredAverage(l));
//        System.out.println(centeredAverage(m));

//        System.out.println(findMin(k)); //1
//        System.out.println(findMin(l));//1
//        System.out.println(findMin(m));//-10

    }

    //Exercises-Arrays-02 - 24
    //Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
    // ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore
    // just one copy, and likewise for the largest value. Use int division to produce the final average.
    // You may assume that the array is length 3 or more.
    public static int centeredAverage(int[] array) {
        int result = 0;
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }

        result = (sum - max - min) / (array.length - 2);
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("sum " + sum);

        return result;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    //Exercises-Arrays-02 - 23
    //Return a version of the given array where each zero value in the array is replaced by the largest odd value to the
    //right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
    //Вернуть версию данного массива, где каждое нулевое значение в массиве заменяется наибольшим нечетным значением
    //справа от нуля в массиве. Если справа от нуля нет нечетного значения, оставьте ноль как ноль.
    public static int[] zeroMax(int[] array) {
        int max = array[0]; // максимальное значение
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j <= array.length - 1; j++) {//i+1 потому что берется правая часть массива
                    // после нулевого значения
                    if (array[j] % 2 == 1 && array[j] > max) {// если array[j] не четное и array[j]> max
                        max = array[j];
                    }

                }

                array[i] = max; //замена
                max = 0; // обнуление max
            }
        }
        return array;
    }


}

