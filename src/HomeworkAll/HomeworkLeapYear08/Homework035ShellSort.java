package HomeworkAll.HomeworkLeapYear08;

import java.util.Arrays;

/**
 * FirstProject
 * 6/14/20 11: 50
 */
public class Homework035ShellSort {
    public static void main(String[] args) {
        int[] myArray = {7, 8, 100, 44, 1};
        System.out.println(Arrays.toString(makeShellSort(myArray)));
    }

    private static int[] makeShellSort(int[] array) {
        boolean unsorted;
        //  находим промежуток (gap) между проверяемыми элементами array.length / 2,
        //  постепенно уменьшая делением на 2 до 1;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            do {
                unsorted = false; // флаг обмена элементов
                for (int i = 0; i + gap < array.length; i++) {
                    if (array[i + gap] < array[i]) {
                        int temp = array[i + gap];
                        array[i + gap] = array[i];
                        array[i] = temp;
                        unsorted = true;
                    }
                }
            } while (unsorted);
        }
        return array;
    }

}
