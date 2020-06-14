package Lesoon035;

import java.sql.Array;
import java.util.Arrays;

/**
 * FirstProject
 * 6/12/20 09: 54
 */
public class ExArray {
    public static void main(String[] args) {
        // складываем 2 массива (слияние);
        int[] a1 = {15, 14, 2, 18, 36};
        int[] a2 = {1, 2, 3, 4, 5};
        int[] c = new int[a1.length + a2.length]; // длина с массива: длин 1 массива + длина 2 массива
        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];
        }
//        System.out.println("a1" + a1.length);
//        System.out.println("c=" + c.length);

        for (int i = 0; i < a2.length; i++) {
            c[i + a1.length] = a2[i];
        }
        System.out.println(Arrays.toString(c));


    }


}
