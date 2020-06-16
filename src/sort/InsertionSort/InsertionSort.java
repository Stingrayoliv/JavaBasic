package sort.InsertionSort;
import java.util.Arrays;

/**
 * FirstProject
 * 6/12/20 10: 49
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {22, 100, 55, 33, 88, 77, 7};
        System.out.println(Arrays.toString(insertSort(array)));

    }

    private static int[] insertSort(int[] input) {
        for (int i = 1; i <input.length ; i++) {
            int newElement = input[i]; // временная темпоральная вспомогательная переменная, которая хранит значения
            int location =i-1; // location - индекс привидущего элемента. цикла начался не с 0
            while (location>=0 && input[location]>newElement) {// пока значения от location больше значения элемента проверки
                input[location+1] = input[location];
                location = location-1; // декремент location

            }
            input[location+1] = newElement; //передаем значение из "памяти"
        }
        return input;
    }
}
