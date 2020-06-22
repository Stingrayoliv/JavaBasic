package Exercises.Array03;

import java.util.Arrays;

/**
 * BC12-Morning
 * 6/22/20 17: 57
 */
public class ExercisesArrays02AndArray03 {
    public static void main(String[] args) {
        //Ee
        System.out.println("Exercises-Arrays-03 - 03");
        System.out.println(Arrays.toString(seriesUp(3)));//[1,....1, 2,....1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));//[1,...1, 2,...1, 2, 3,...1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));//[1,...1, 2]

        // Exercises-Arrays-02 - 23
        int[] a = {0, 5, 0, 3}; //[5, 5, 3, 3]
        int[] b = {0, 4, 0, 3}; //[3, 4, 3, 3]
        int[] c = {0, 1, 0}; //[1, 1, 0] Если справа от нуля нет нечетного значения, оставьте ноль как ноль.
        System.out.println("Exercises-Arrays-02 - 23");
        System.out.println(Arrays.toString(zeroMax(a)));
        System.out.println(Arrays.toString(zeroMax(b)));
        System.out.println(Arrays.toString(zeroMax(c)));
    }


    //Exercises-Arrays-03-03
    //Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} (spaces added to show
    // the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
    // which is known to sum to exactly n*(n + 1)/2.
    //Учитывая n> = 0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
    // (пробелы добавлены, чтобы показать группировку). Обратите внимание,
    // что длина массива будет 1 + 2 + 3 ... + n,
    // которая, как известно, суммируется ровно с n * (n + 1) / 2.

    public static int[] seriesUp(int n) {
        int[] array = new int[n * (n + 1) / 2];
        int index = 0; // инициализируем номер индекса
        for (int i = 1; i <= n; i++) {// в группе могут быть значения от 1 до n включительно;
            for (int j = 1; j <= i; j++) {// значения начинаются от 1
                array[index] = j;// array[0] = j(будет равен 1)
                index++;
            }
        }
        return array;
    }
    //Exercises-Arrays-02-23

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
