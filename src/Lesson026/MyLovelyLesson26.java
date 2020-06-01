package Lesson026;
import java.util.Arrays;

/**
 * FirstProject
 * 5/29/20 09: 49
 */
public class MyLovelyLesson26 {
    public static void main(String[] args) {
/*		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {8, 6, 7, 5, 3, 0, 9};
		int[] a3 = {1, 2, 3};
		System.out.println(Arrays.toString(midThree(a1)));
		System.out.println(Arrays.toString(midThree(a2)));
		System.out.println(Arrays.toString(midThree(a3)));*/

/*		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3, 1};
		int[] a3 = {1, 2, 1};
		System.out.println(sameFirstLast(a1));
		System.out.println(sameFirstLast(a2));
		System.out.println(sameFirstLast(a3));*/

/*		int[] m1 = {1, 2, 3};
		int[] m2 = {11, 5, 9};
		int[] m3 = {2, 11, 3};
		int[] m4 = {2, 11, 2};
		System.out.println(Arrays.toString(maxEnd3(m1))); // [3, 3, 3]
		System.out.println(Arrays.toString(maxEnd3(m2))); //[11, 11, 11]
		System.out.println(Arrays.toString(maxEnd3(m3))); // [3, 3, 3]
		System.out.println(Arrays.toString(maxEnd3(m4))); // [2, 11, 2]*/
/*		int[] a1 = {4, 5, 6};
		int[] a2 = {1, 2};
		int[] a3 = {3};
		System.out.println(Arrays.toString(makeLast(a1)));// [0, 0, 0, 0, 0, 6]
		System.out.println(Arrays.toString(makeLast(a2)));//  [0, 0, 0, 2]
		System.out.println(Arrays.toString(makeLast(a3)));// [0, 3]*/
//        int[] myTest1 = {1, 2, 3};
//        int[] myTest2 = {1, 3};
//        int[] yourTest1 = {7, 2, 3};
//        int[] yourTest2 = {1};
//        int[] anotherTest1 = {1, 2};
//        int[] anotherTest2 = {};
//
//        System.out.println(start1(myTest1, myTest2));
//        System.out.println(start1(yourTest1, yourTest2));
//        System.out.println(start1(anotherTest1, anotherTest2));

        int[] a1 = {1, 3, 4, 5}; // true
        int[] a2 = {2, 1, 3, 4, 5}; // true
        int[] a3 = {2, 7, 3, 1, 3}; // true
        int[] a4 = {2, 7, 1, 3, 7}; // false
        int[] a5 = {1, 1, 1}; // false

        System.out.println(unlucky1(a1));
        System.out.println(unlucky1(a2));
        System.out.println(unlucky1(a3));
        System.out.println(unlucky1(a4));
        System.out.println(unlucky1(a5));
    }

    // 01_15
    public static int start1(int[] a1, int[] a2) {
        int count = 0;
        for (int element : a1) {
            if (element == 1) count++;
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] == 1) count++;
        }
        return count;
    }


    //01_14
    public static double[] makeLast(int[] array) {
        double[] output = new double[array.length * 2];
        output[output.length - 1] = array[array.length - 1];
        return output;
    }

    // 01_12
    public static int[] maxEnd3(int[] array) {
        if (array[0] > array[array.length - 1]) {
            Arrays.fill(array, array[0]);
        } else if (array[array.length - 1] > array[0]) {
            Arrays.fill(array, array[array.length - 1]);
        }
        return array;
    }

    // 01_10
    public static boolean sameFirstLast(int[] array) {

        return array.length > 1 && array[0] == array[array.length - 1];
    }

    // 01-08
    public static int[] midThree(int[] array) {
        int[] output = new int[3];
        output[0] = array[array.length / 2 - 1];
        output[1] = array[array.length / 2];
        output[2] = array[array.length / 2 + 1];
        return output;
    }

    //09We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
// Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    private static boolean unlucky1(int[] myArray) {
        boolean result = false;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == 1 && myArray[i + 1] == 3) {
                if (i <= 1 || i >= myArray.length - 2) {
                    result = true;
                }
            }
        }
        return result;
    }
}




