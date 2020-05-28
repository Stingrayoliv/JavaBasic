package Lesson025;
/**
 * Разые способы инициализаци массивов
 * FirstProject
 * 5/28/20 10: 13
 */
public class GutenTagArray {
    public static void main(String[] args) {
        // [1,2,3,4];
        int[] array1 = new int[3];
        array1[0] = 13;
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = myIntArrayPrint(array1); //можно сразу так инициализировать методом
        int[] array4;
        myIntPrint(array1);
        myIntPrint(array2);
        myIntPrint(new int[3]); // можно так распечатать
        myIntPrint(new int[]{1, 2, 3});
        int a = 5;
        int b = 7;
        int c = sum(a, b);
    }
    public static int sum(int a, int b) {
        return a+b;
    }

    private static void myIntPrint(int[] array) {
        //System.out.println(array); // распечатаем имеено ссылку в памяти
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("-----------------");
    }

    // key - это наш номер i, value = значение
    private static int[] myIntArrayPrint(int[] array) {
        for (int value : array) { //value значением элеметов
            System.out.println(value + ",");
        }
        return array;
    }
    public static int additionArray(int [] myLittleArray) {
        int sum = 0;
        for (int i = 0; i <myLittleArray.length ; i++) {
            sum = sum + myLittleArray[i];

        }
        return sum/myLittleArray.length;

    }


}
