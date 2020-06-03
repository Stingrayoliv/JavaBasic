package sort;
/**
 * FirstProject
 * 5/28/20 11: 05
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] unSortArray = {104, 64, 34, 25, 12, 22, 11, 90};
//        myIntArrayPrint(bubbleSortRecursion(unSortArray));
        myIntArrayPrint(bubbleSort(unSortArray));
    }

    public static int[] bubbleSortRecursion(int[] myArray) {
        int countChanging = 0; // считаем если в круге сортировки изменения. Count может быть только 0, или 1.
        // Считаем, что 0, если нет изменений. Общее количество кругов не считаем.
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                // swap temp and myArray[i] // обменяем значения для следующего круга, если условие выше выполнилось
                int temp = myArray[i]; // инициализация temp переменной
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
                countChanging++;
            }
        }
        if (countChanging > 0) { // рекурсию лучше за циклом
            bubbleSortRecursion(myArray); // рекурсия
        }
        return myArray;
    }

    private static void myIntArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) { //value значением элеметов
            System.out.println(value);
        }
    }
    public static int[] bubbleSort(int[] myArray) {
        boolean unsorted = true;
        while (unsorted) {
            int count = 0;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    /*int a = myArray[i];
                    int b = myArray[i + 1];
                    a = a + b;
                    b = a - b;
                    a = a - b;*/
                    myArray[i] = myArray[i] + myArray[i + 1];
                    myArray[i + 1] = myArray[i] - myArray[i + 1];
                    myArray[i] = myArray[i] - myArray[i + 1];
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return myArray;
    }
}


