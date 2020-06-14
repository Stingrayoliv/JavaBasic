package Exercises.Array02;

/**
 * FirstProject
 * 6/11/20 19: 13
 */
public class Array18and19 {
    public static void main(String[] args) {
        // Exercises-Arrays-02-18
//        int[] aa = {7, 1, 7}; // true
//        int[] ab = {1, 7, 1, 7}; //true
//        int[] ac = {1, 7, 1, 1, 7}; //false
//        System.out.println(has77(aa));
//        System.out.println(has77(ab));
//        System.out.println(has77(ac));
// Exercises-Arrays-02-19
        int[] first = {3, 1, 3, 1, 3}; //true
        int[] second = {3, 1, 3, 3}; //false
        int[] third = {3, 4, 3, 3, 4}; //false

//        System.out.println(haveThree(first));
//        System.out.println(haveThree(second));
//        System.out.println(haveThree(third));

    }

    // Exercises-Arrays-02-19
// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next
// to each other
    private static boolean haveThree(int[] array) {
        int count = 0;
        if (array.length >= 1 && array[0] == 3)
            count++;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == 3 && array[i] == 3)
                return false;
            if (array[i] == 3)
                count++;

        }
        return count == 3;
    }

    // Exercises-Arrays-02-18
    // Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
    // separated by one element, such as with {7, 1, 7}.
    private static boolean has77(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 7) {

                if (array[i + 1] == 7 || array[i + 2] == 7) {
                    return true;
                }

            }

        }
        return false;
    }


}
