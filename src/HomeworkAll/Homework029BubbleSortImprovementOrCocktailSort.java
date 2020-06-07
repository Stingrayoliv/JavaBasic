package HomeworkAll;
/**
 * FirstProject
 * 6/4/20 20: 08
 */
// Коктельная сортировка
public class Homework029BubbleSortImprovementOrCocktailSort {
    public static void main(String[] args) {
        int[] unSortArray = {5, 8, 4, 9, 1, -1, 6, 200, 90, 1};
        //myPrint(makeBubbleSortImprovement(unSortArray));
        //myPrint(makeBubbleSortImprovementTwo(unSortArray));
        //makeBubbleSortImprovementTwo(unSortArray);// for debugging
    }

    public static int[] makeBubbleSortImprovement(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;
        while (start < end) {//
            for (int i = start; i < end; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    // swap temp and myArray[i] // обменяем значения для следующего круга, если условие выше выполнилось
                    int temp = myArray[i];// инициализация temp переменной
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
            end--;// так как последнее значение уже отсортировано, то следующий loop уже без него
            for (int j = end; j > start; j--) {
                if (myArray[j] < myArray[j - 1]) {
                    // swap temp and myArray[j] // обменяем значения для следующего круга, если условие выше выполнилось
                    int temp = myArray[j];// инициализация temp переменной
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = temp;
                }
            }
            start++; //// так как последнее значение уже отсортировано, то следующий loop уже без него
        }
        return myArray;
    }

    public static void myPrint(int[] array) {
        for (int value : array) {
            System.out.print(value+", ");
        }
        System.out.println("\n");
    }

    public static int[] makeBubbleSortImprovementTwo(int[] array) {
        int start = 0;
        int end = array.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = start; i <= end - 1; i++) {
                if (array[i] > array[i + 1]) {
                    //test if two elements are in the wrong order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            myPrint(array); // print for for debugging
            if (!swapped) {//
                break;
            }
            swapped = false; // обнуляем привидущий флаг
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            myPrint(array); // print for for debugging
            System.out.println("---------------------------\n"); // print for for debugging
        } while (swapped);
        return array;
    }

}
