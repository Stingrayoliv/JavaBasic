package sort.MergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * FirstProject
 * 29.06.20 20: 34
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = getArray(15, 0, 50);
        System.out.println("начальный массив, до сортировки: \n"+Arrays.toString(arr));
        sort(arr);
        System.out.println("Array is sorted -" + isArraySort(arr));
        System.out.println(Arrays.toString(arr));

    }

    // идея работы сортировки в одном массиве, индексы просто показывают какой кусочек сортировать
    private static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int from, int to) {
        if (to - from > 1) {
            int middle = (from + to) / 2; //  обратить внимание, что тут складывают
            // далее будет 2 рекурсивных метолов, которые дальше делят на кусочки, пока не дождут,
            // до кусочка размером 1
            sort(arr, from, middle);
            sort(arr, middle, to);
            // в мердже 2 куска указываем, которые слепить назад нужно
            merge(arr, from, middle, to);
        }

    }

    private static void merge(int[] arr, int from, int middle, int to) {
        // создаем 2 подмассива с помощью Arrays.copyOfRange ( они одсортированы)
        int[] arr1 = Arrays.copyOfRange(arr, from, middle);
        int[] arr2 = Arrays.copyOfRange(arr, middle, to);
        int x1 = 0, x2 = 0;
        int i = from;
        while (x1 < arr1.length && x2 < arr2.length) {
             /*
             if(arr1[x1]<arr2[x2]) {
                 arr[i]=arr1[x1];
                 x1++;
                 i++;
             } else {
                 arr[i]=arr2[x2];
                 x2++;
                 i++;
                 */
            // то, что закомментировано можно записать с помощью тернарного
            //оператора
            arr[i++] = (arr1[x1] < arr2[x2]) ? arr1[x1++] : arr2[x2++];
        }
        // выполняется один из этих двух циклов, если один из подмассивов закончился
        while (x1 < arr1.length) { //прибавляем пока мы не вышли за пределы первого кусочка
            arr[i++] = arr1[x1++];

        }
        while (x2 < arr2.length) { //прибавляем пока мы не вышли за пределы второго кусочка
            arr[i++] = arr2[x2++];
        }
    }

    public static int[] getArray(int size, int min, int max) { // заполнения массива случайными числами
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            // 1 нужна, чтобы max входила
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    //метод для тестирования. показывает отсортирован ли таки массив
    public static boolean isArraySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}

/*
i
[5, 8, 20, 35, 40]
j
[5, 8, 20, 35, 70]

[2, 4, 5, 8, 15, 20, 35, 40, 48, 70]
[1,0,  40,23,          3,14, 15,7] // постепенно разделяем, сортируем и merge назад
[1, 0,    40, 23,    3, 14,   15, 7]
0, 1     23,40      3, 14   7, 15
   0,1,23,40         3,7,14,15
      0,1,3,7,14,15,23,40

 */