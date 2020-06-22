package sort;
import java.util.Random;

/**
 * FirstProject
 * 6/22/20 10: 54
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Было");
        myPrintArray(randomFill(array));
        System.out.println("Стало");
        quickSort(array);
        myPrintArray(array);
    }

    private static void quickSort(int[] array) {
        int begin = 0;// вспомогательные индексы low index
        int end = array.length - 1; // вспомогательные индексы high index
        _quickSort(array, begin, end); // cоздаем настоящий массив для рекурсии
    }

    private static void _quickSort(int[] array, int begin, int end) {
        if (begin < end) { // по сути и есть сама рекурсия
            int partitionIndex = pertition(array, begin, end); // partitionIndex - это пивот
            _quickSort(array, begin, partitionIndex - 1); // cортировка левой части
            _quickSort(array, partitionIndex + 1, end); //partitionIndex это точка разделения массивов
        }
    }

    private static int pertition(int[] array, int begin, int end) {
        int pivot = array[end]; // первый пивот берется за середину - это идеальный
        int i = begin - 1;// чтобы в цикле не перескочить так как в цикле i увеличивается на 1

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;


        return i + 1;
    }

    private static void myPrintArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }

    private static int[] randomFill(int[] array) {
        Random r = new Random(); // обьект рандомный
        for (int i = 0; i <array.length ; i++) {
            array[i] = r.nextInt(1000); // 1000 это макимум
        }

        return array;
    }


}
