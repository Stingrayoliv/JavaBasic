package Lesson025;

/**
 * FirstProject
 * 5/28/20 12: 11
 */
public class TasksArray {
    public static void main(String[] args) {
        //1
//        int[] d = new int[]{1, 2, 3,4, 5, 6, 7, 8}; //[1, 2, 0]
//        int[] k = new int[]{2, 3, 5}; //[2, 0, 5]
//        int[] n = new int[]{1, 2, 1}; //[1, 2, 1]
//        myIntArrayPrint(fix23(d));
//        myIntArrayPrint(fix23(k));
//        myIntArrayPrint(fix23(n));

        //2
        int[] mm1 = {1, 2, 3, 4};
        int[] mm2 = {7, 1, 2, 3, 4, 9};
        int[] mm3 = {1, 2};
        myIntArrayPrint(makeMiddleEven(mm1)); //[2,3]
        myIntArrayPrint(makeMiddleEven(mm2)); //[2,3]
        myIntArrayPrint(makeMiddleEven(mm3)); //[2,3]

    }

    public static void myIntArrayPrint(int[] input) { // для распечатки
        for (int elementik : input) {
            System.out.println(elementik);
        }
    }

    // 06 Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    // Return the changed array.
    public static int[] fix23(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 3) {
                array[i + 1] = 0;
            }
            System.out.println("-----------------");
        }
        return array;
    }

    // 07 Given an array of ints of even length, return a new array length 2 containing the middle two elements
    // from the original array. The original array will be length 2 or more.
    public static int[] makeMiddleEven(int[] array) {
        int[] output = new int[2];
        output[0] = array[array.length / 2 - 1];
        output[1] = array[array.length / 2];
        return output;
    }
}




