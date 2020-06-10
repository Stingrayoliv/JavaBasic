package Exercises;
import java.util.Arrays;
/**
 * FirstProject
 * 6/4/20 10: 13
 */
public class Ls26HWArrayExs {
    public static void main(String[] args) {

//        int[] a1 = {1, 3, 4, 5}; //true
//        int[] a2 = {2, 1, 3, 4, 5}; //true
//        int[] a3 = {2, 7, 3, 1, 3}; //true
//        int[] a4 = {2, 7, 1, 3, 7}; //false
//        int[] a5 = {1, 1, 1}; //false
//        System.out.println(unlucky1(a1));
//        System.out.println(unlucky1(a2));
//        System.out.println(unlucky1(a3));
//        System.out.println(unlucky1(a4));
//        System.out.println(unlucky1(a5));

//        //01-08
//        int[] a1 = {1, 2, 3, 4, 5};
//        int[] a2 = {8, 6, 7, 5, 3, 0, 9};
//        int[] a3 = {1, 2, 3};
//        System.out.println(Arrays.toString(midThree(a1)));
//        System.out.println(Arrays.toString(midThree(a2)));
//        System.out.println(Arrays.toString(midThree(a3)));

//        int[] a1 = {1, 2, 3};
//        int[] a2 = {1, 2, 3, 1};
//        int[] a3 = {1, 2, 1};
//        System.out.println(sameFirstLast(a1));
//        System.out.println(sameFirstLast(a2));
//        System.out.println(sameFirstLast(a3));

//          //12
//        int[] m1 = {1, 2, 3}; // [3, 3, 3]
//        int[] m2 = {11, 5, 9}; // [11, 11, 11]
//        int[] m3 = {2, 11, 3}; // [3, 3, 3]
//        System.out.println(Arrays.toString(maxEnd3(m1)));
//        System.out.println(Arrays.toString(maxEnd3(m2)));
//        System.out.println(Arrays.toString(maxEnd3(m3)));

//          //14
//        int[] a1 = {4, 5, 6};
//        int[] a2 = {1, 2};
//        int[] a3 = {3};
//        System.out.println(Arrays.toString(makeLast(a1)));
//        System.out.println(Arrays.toString(makeLast(a2))); // → [0, 0, 0, 2]
//        System.out.println(Arrays.toString(makeLast(a3))); // → [0, 3]

        //15
        int[] test11 = {1, 2, 3};
        int[] test12 = {1, 3};
        int[] test21 = {7, 2, 3};
        int[] test22 = {1};
        int[] anotherTest1 = {1, 2};
        int[] anotherTest2 = {};
        System.out.println(start1(test11, test12));
        System.out.println(start1(test21, test22));
        System.out.println(start1(anotherTest1, anotherTest2));

    }

    public static int start1(int[] a1, int[] a2) {
        //15. Start with 2 int arrays, a and b, of any length.
        // Return how many of the arrays have 1 as their first element.

        int count = 0;
        for (int element : a1) {
            if (element == 1) count++;
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] == 1) count++;
        }
        return count;
    }

    public static double[] makeLast(int[] array) {
        //01-14 Given an int array, return a new array with double the length
        // where its last element is the same as
        // the original array, and all the other elements are 0.
        // The original array will be length 1 or more.
        // Note: by default, a new int array contains all 0's.
        double[] output = new double[array.length * 2];
        output[output.length - 1] = array[array.length - 1];

        return output;

    }

    public static int[] maxEnd3(int[] array) {
        //12. Дан массив длиной 3, определите, какой из них больше, первый или последний элемент в массиве,
        // и установите для всех остальных элементов это значение. Вернуть измененный массив.

        //int[] output = new int [array.length];

        if (array[0] > array[array.length - 1]) {
            Arrays.fill(array, array[0]);
        } else if (array[array.length - 1] > array[0]) {
            Arrays.fill(array, array[array.length - 1]);
        }
        return array;
    }

    public static boolean sameFirstLast(int[] array) {
        //10. Given an array of ints, return true if the array is length 1 or more,
        // and the first element and the last element are equal.

        return array.length > 1 && array[0] == array[array.length - 1];
    }

    public static boolean unlucky1(int[] myArray) {
        //#9.Cкажем, что 1, за которой в массиве сразу следует 3, является «неудачной» 1.
        // Верните true, если данный массив содержит неудачную 1 в первых 2 или последних 2 позициях в массиве.
        boolean result = false;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == 1 & myArray[i + 1] == 3) {//если цифра unlucky
                if (i <= 1 || i >= myArray.length - 2) {//номер unlucky на двух первых или последних позициях
                    result = true;
                }
            }
        }
        return result;
    }

    public static int[] midThree(int[] array) {
        //8. Given an array of ints of odd length, return a new array length 3
        // containing the elements from the middle of the array.
        // The array length will be at least 3.
        int[] output = new int[3];
        output[0] = array[array.length / 2 - 1];
        output[1] = array[array.length / 2];
        output[2] = array[array.length / 2 + 1];
        return output;
    }
}