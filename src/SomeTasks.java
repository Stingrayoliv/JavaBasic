import java.util.Arrays;
/**
 * FirstProject
 * 26.06.20 23: 10
 */
public class SomeTasks {
    public static void main(String[] args) {
        // 10_2.
        int n = 2;

        // 10_1.
        String[] l = {"Olga", "Oleg", "Svetlana", "Oleg"}; //2
        String a1 = "Oleg";
        //System.out.println(findTimes(l, a1));

        // 10_3
        int[] m = {10, 2, 4, 56, 34, 5, 6, 98, 3, 2, 45};
        //System.out.println(findDifference(m));// -> 96 // (98-2)

        // 10_5
        String[] l1 = {"Oleg", "Oleg", "Svetlana", "Oleg"}; //true
        String[] l2 = {"Oleg", "Svetlana", "Gleb", "Oleg"}; //false
//        System.out.println(checkArray(l1));
//        System.out.println(checkArray(l2));

        //10_4
        int[] s = {10, 2, 4, 56, 34, 5, 6, 98, 3, 2, 45};// -> {98,45,4,56,34,5,6,10,3,2,2}
        System.out.println(Arrays.toString(makeSwap(s)));


    }
    // 10_2. Реализуйте метод, который возвращает массив, который содержит первые n членов
    //последовательности Фибоначчи
    //Например: (10) -> {1,1,2,3,5,8,13,21,34,55}
    public static int[] showFibonacci(int n) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i <array.length-1 ; i++) {
            array[i] = array[i-1]+array[i-2];

        }

        return array;
    }

    // 10_1. Given an array of Strings. Implement a method that return how many times a given String appears in the array
//For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”}, ”Oleg”) -> 2
    private static int findTimes(String[] array, String a) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(a))
                times++;
        }
        return times;
    }

    //10.3 Реализовать метод, который возвращает разность, между самым большим и самым
    //маленьким значением массива.
    //Например: {10,2,4,56,34,5,6,98,3,2,45} -> 96 // (98-2)
    public static int findDifference(int[] array) {
        int difference = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min>array[i]) {
                min = array[i];
            }
        }
        difference = max-min;
        return difference;
    }
    //10_5.
    // Дан массив строк. Реализуйте метод, который возвращает true, если в нем есть два или более
    //одинаковых элемента, расположенных рядом друг с другом.
    public static boolean checkArray(String[] array) {
        boolean result;
        for (int i = 0; i <array.length-1; i++) {
            if (array[i].equals(array[i+1])) return true;
        }
        return false;
    }
    //10_4. Дан массив int. Написать метод, который ищет максимальный элемент массива и меняет его
    //местами с первым элементом массива. Потом меняет местами самый маленький и последний
    //элемент массива.
    //Например: {10,2,4,56,34,5,6,98,3,2,45} -> {98,45,4,56,34,5,6,10,3,2,2}
    public static int[] makeSwap(int[] array) {
        int max = array[0];
        int min = array[0];
        int n = array.length-1;
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]) {
                max = array[i];
            }
            if (min>array[i]) {
                min = array[i];
            }
        }
        //System.out.println(max);
        int temp = max;
        max = array[0];
        array[0]= temp;

        //System.out.println(min);
        int tempTwo = min;
        min = array[n];
        array[n] = tempTwo;
        return array;
    }


}
