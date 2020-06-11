package Exercises.Array02;
import java.util.Arrays;
// Упражнения Arrays2-8
/**
 * FirstProject
 * 6/5/20 12: 16
 */
public class Ls30Exercises_June05 {
    public static void main(String[] args) {
        // Arrays2-8 первый способ
        int[] a = {5, 6, 45, 99, 13, 5, 6};
//        System.out.println(sameEnds(a, 1)); //false
//        System.out.println(sameEnds(a, 2)); // → true
//        System.out.println(sameEnds(a, 3)); // → false

        //Arrays2-8 - второй способ
        System.out.println(sameEndsTwo(a, 1));
        System.out.println(sameEndsTwo(a, 2));
        System.out.println(sameEndsTwo(a, 3));

    }

    public static boolean sameEndsTwo(int[] array, int n) {
        String numbers = "";
        for (int i = 0; i < array.length; i++) {
            numbers = numbers + array[i];
        }
        if (numbers.substring(0, n).equals(numbers.substring(numbers.length() - n))) {
            return true;
        }
        return false;
    }

    //Arrays2-8 Вернуть true, если группа из N чисел в начале и конце массива совпадает.
    // Например, с {5, 6, 45, 99, 13, 5, 6} концы одинаковы для n = 0 и n = 2, и ложны для n = 1 и n = 3.
    // Вы можете предположить, что n находится в диапазоне 0..nums.length включительно.
    public static boolean sameEnds(int[] array, int n) {
        int count = 0;
        for (int i = 0, j = n; i < n && j > 0; i++, j--) {
            if (array[i] == array[array.length - j]) {
                count++;
            }
            System.out.print(array[i] + " ");
            System.out.println(array[array.length - j] + " ");
        }
        //System.out.println(count);
        if (count == n) {
            return true;
        }
        return false;
    }
}