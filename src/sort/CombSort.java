package sort;
/**
 * FirstProject
 * 6/3/20 12: 17
 */
public class CombSort {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        myArrayPrint(comb(array));
    }

    private static int[] comb(int[] array) {
        double factor = 1.2473309; // или factor
        int step = array.length; // или gap - разрыв (подразумевается, что мы начинаем сортировать с последнего значения
        boolean unsorted = true; //или swapped

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (step != 1 || unsorted == true) {
            int count = 0;
            if (step > 1) {
                step = (int) (step / factor);//разрыв для следующей операции будет равен прошлый gap/ на фактор
            }
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) { // это и есть условие для обмена
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    count++;
                    unsorted = true;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return array;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.println(value);
        }
    }
}
