package HomeworkAll;
/**
 * FirstProject
 * 5/28/20 22: 10
 */
public class Homework025 {
    public static void main(String[] args) {
        //09
        int[] k = new int[]{1, 3, 4, 5}; //true
        int[] l = new int[]{2, 1, 3, 4, 5}; //true
        int[] n = new int[]{1, 1, 1}; //false
        System.out.println(unlucky1(k));
        System.out.println(unlucky1(l));
        System.out.println(unlucky1(n));

        //010
        int[] a = new int[]{1, 2, 3}; //false
        int[] b = new int[]{1, 2, 3, 1}; //true
        int[] c = new int[]{1, 2, 1}; //true
        System.out.println(sameFirstLast(a));
        System.out.println(sameFirstLast(b));
        System.out.println(sameFirstLast(c));

        //011
        int[] array1 = new int[]{1, 2, 3}; //6
        int[] array2 = new int[]{5, 11, 2}; //18
        int[] array3 = new int[]{7, 0, 0}; //7
        System.out.println(sum3(array1));
        System.out.println(sum3(array2));
        System.out.println(sum3(array3));
    }

    // 09. We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    public static boolean unlucky1(int[] array1) {
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] == 1 && array1[i + 1] == 3 && (array1[0] == 1 || array1[0] == 2
                    || array1[array1.length - 1] == 1 || array1[array1.length - 2] == 1)) return true;
        }
        return false;
    }

    // 010 Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
    public static boolean sameFirstLast(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[0] == array1[array1.length - 1]) return true;
        }
        return false;
    }

    //011 Given an array of ints length 3, return the sum of all the elements.
    public static int sum3(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum;
    }
}
