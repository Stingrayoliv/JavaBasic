package HomeworkAll;
import java.util.Arrays;

/**
 * FirstProject
 * 6/13/20 14: 55
 */
public class Homework035InsertSort {
    public static void main(String[] args) {
        int[] a = {5, 6, 4, 2, 1, 3};
        System.out.println(Arrays.toString(makeSortInsert(a)));

    }

    public static int[] makeSortInsert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = i; // важно запомнить старый i, чтобы знать какой элемент будет следующим вставляться (сортироваться)
            // условия: пока слева есть элемент и тот , кто слева больше, чем элемент с индексом k - делаем обмен;
            while (k > 0 && array[k - 1] > array[k]) {
                //обмен двух переменных через третью;
                int tmp = array[k - 1];
                array[k - 1] = array[k];
                array[k] = tmp;
                // теперь обмен осуществлен и делаем сдвиг нашего элемента левее
                k = k-1; // или k -=1;
            }

        }

        return array;
    }
}
