package Exercises.Array03;
import java.util.Arrays;

/**
 * FirstProject
 * 6/23/20 10: 12
 */
public class Array0304 {
    public static void main(String[] args) {
        // Exercises-Arrays-03-06
        int[] k1 = {1, 2, 3, 8, 9, 3, 2, 1}; // 3
        int[] k2 = {1, 2, 1, 4}; //3
        int[] k3 = {7, 1, 2, 9, 7, 2, 1}; //2
        System.out.println(maxMirror(k1));
        System.out.println(maxMirror(k2));
        System.out.println(maxMirror(k3));

//        System.out.println("K1: сам массив");
//        System.out.println(Arrays.toString(k1));
//        System.out.println("перевернуый массив");
//        System.out.println(Arrays.toString(reverse(k1)));


        // Exercises-Arrays-03-05
        int[] outer1 = {1, 2, 4, 6};
        int[] b2 = {1, 2, 4, 6};
        int[] b3 = {1, 2, 4, 4, 6};

        int[] inner1 = {2, 4}; //true
        int[] c2 = {2, 3, 4}; // false
        int[] c3 = {2, 4}; //true
//        System.out.println(linearIn(outer1, inner1));
//        System.out.println(linearIn(b2, c2));
//        System.out.println(linearIn(b3, c3));

//        System.out.println(linearInOne(outer1, inner1));
//        System.out.println(linearInOne(b2, c2));
//        System.out.println(linearInOne(b3, c3));


        // Exercises-Arrays-03-04
        int[] a1 = {1, 3, 1, 4};
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};
        int[] a3 = {3, 2, 2, 4};
//        System.out.println(Arrays.toString(fix34(a1)));// [1, 3, 4, 1]
//        System.out.println(Arrays.toString(fix34(a2))); //[1, 3, 4, 1, 1, 3, 4]
//        System.out.println(Arrays.toString(fix34(a3))); //[3, 4, 2, 2]
    }

    // Exercises-Arrays-03-06
    //We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
    // the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
    // is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

    /*
     Решение через 2 метода:
     1) метод reverse ,чтобы перевернуть массив
     2) делаем 2 цикла в методе maxMirror для массива из условия и перевернутого
     3) пока array[i] == array2[j] и значения не выходят за пределы массива, то i++; j++; в это же время увеличивается
     число совпадений: size++
     4) находим максимальное число совпадений с помощью Math.max
     */
    public static int maxMirror(int[] array) {
        int max = 0;
        int[] array2 = reverse(array);

        for (int start = 0; start < array.length; start++) {
            for (int begin = 0; begin < array2.length; begin++) {


            int size = 0;
            int i = start;
            int j = begin;

            while (i < array.length && j<array2.length && array[i] == array2[j]) {
                size++;
                i++;
                j++;
            }

            max = Math.max(max, size);
        }
    }
        return max;
}
    public static int[] reverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[input.length - i - 1] = input[i];

        }

        return output;
    }
    // Exercises-Arrays-03-06 Решение с помощью одного метода(без reverse).  Работает
//    public static int maxMirror(int[] array) {
//        int max = 0;
//
//        for(int start = 0; start < array.length; start++) {
//            for(int begin = array.length - 1; begin >= 0; begin--) {
//                int size = 0;
//                int i = start;
//                int j = begin;
//
//                while(i < array.length && j >= 0 && nums[i] == nums[j]) {
//                    size++;
//                    i++;
//                    j--;
//                }
//
//                max = Math.max(max, size);
//            }
//        }
//
//        return max;
//    }



    // Exercises-Arrays-03-05
    //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner
    // appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage
    // of the fact that both arrays are already in sorted order.
    //неверный вариант
//    public static boolean linearIn(int[] outer, int[] inner) {
//        boolean notFound;
//        for (int i = 0; i < inner.length; i++) {
//            notFound = true;
//
//            for (int j = 0; j < outer.length; j++) {
//                if (inner[i] == outer[j]) {
//                    notFound = false;
//                }
//                if (notFound) return false;
//            }
//        }
//        return true;
//    }

    //верное решение
    public static boolean linearInOne(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;
        while (i < inner.length && j < outer.length) { // пока внутренний массив во внешнем
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false; // такоe не может быть в массиве отсортированном
            } else {
                i++;
            }
        }
        return true;
    }

    // Exercises-Arrays-03-04
    //Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3
    // is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains
    // the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array
    // before any 4.
    /*
    1 Найти индекс тройки
    2 Узнать, что идет за тройкой
    3 Найти индексы четверок
    4 Поменять на четверки
     */
    // данный вариант работает не до конца
    public static int[] fix34(int[] array) {
        int count;

        do {
            count = 0;
            int indexAfterKey = array[0];
            int indexKeySingleFor = array[0];

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 3 && array[i + 1] != 4) {
                    indexAfterKey = i + 1; // запомни индекс за тройкой
                }
                if (array[i] == 4 && array[i - 1] != 3) {
                    indexKeySingleFor = i; // запомни индекс где 4-ка
                }
            }
            int temp = array[indexAfterKey];
            array[indexKeySingleFor] = array[indexKeySingleFor];
            array[indexKeySingleFor] = temp;
            count++; // показатель обмена

        } while (count == 0);
        return array;
    }


}
