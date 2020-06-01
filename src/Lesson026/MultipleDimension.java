package Lesson026;
import java.util.Arrays;

/**
 * FirstProject
 * 5/29/20 10: 18
 */
public class MultipleDimension {
    public static void main(String[] args) {
//        month();
//        schoolTable();
//        myLovelyInt();
//        simpleExample();
        justExample();
    }

    public static void threeDimension() {
        int[][][] a1 = new int[10][20][30];
        byte[][][] byteArray = { // трехмерный массив// библиотека
                { // стилаж
                        {0, 1, 2},// книжная полка
                        {3, 4, 5},
                        {6, 7, 8},
                },
                { // стилаж
                        {12, 13, 14}, // книжная полка
                        {15, 16, 17},
                        {100, 101, 120},
                }
        };

    }

    public static void simpleExample() {
        int[][] example = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5, 5},
        }; // не забывать тут ;
        for (int[] veryLittleArray : example) {
            for (int elementik : veryLittleArray) {
                System.out.print(elementik + " ");
            }
            System.out.println("");
        }
    }

    public static void myLovelyInt() {
        int[][] mylittleArray = new int[5][];
        mylittleArray[0] = new int[1];
        mylittleArray[1] = new int[2];
        mylittleArray[2] = new int[3];
        mylittleArray[3] = new int[4];
        mylittleArray[4] = new int[5];

        for (int[] veryLittleArray : mylittleArray) {
            for (int elementik : veryLittleArray) {
                System.out.print(elementik + " ");
            }
            System.out.println("");
        }
    }

    public static void month() {
        int[][] monthCalendar; // двухмерный массив
        monthCalendar = new int[4][7]; // 4-row, 7-colum;
        for (int row = 0; row < monthCalendar.length; row++) {
            for (int colum = 0; colum < monthCalendar[row].length; colum++) {
                monthCalendar[row][colum] = row * 7 + colum + 1; //+1 так как мы начинаем с 0, а месяца с таким кол-вом дней нет
                System.out.print(" " + monthCalendar[row][colum]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Print element[1] [3], I expect 11: " + monthCalendar[1][3]);
    }

    public static void schoolTable() {
        String[][] myLovelyArray = new String[5][3];

        myLovelyArray[0][0] = "1";
        myLovelyArray[0][1] = "Матвеев";
        myLovelyArray[0][2] = "№87878787";

        myLovelyArray[1][0] = "2";
        myLovelyArray[1][1] = "Васечкин";
        myLovelyArray[1][2] = "№8787989898";

        myLovelyArray[2][0] = "3";
        myLovelyArray[2][1] = "Сидоров";
        myLovelyArray[2][2] = "№8787979877";

        myLovelyArray[3][0] = "4";
        myLovelyArray[3][1] = "Петечкин";
        myLovelyArray[3][2] = "№8797989877";

        myLovelyArray[4][0] = "5";
        myLovelyArray[4][1] = "Герасимов";
        myLovelyArray[4][2] = "№8767989821";

        for (String[] littleArray : myLovelyArray) {
            for (String value : littleArray) {
                System.out.print(value + " ");
            }
            System.out.println(""); // после выхода из первой строчки, чтобы была таблица
        }
    }
    public static void justExample() {
        int arr[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
// To fill complete array with a particular value
        Arrays.fill(arr, 10);
        System.out.println("Array completely filled with 10\n" + Arrays.toString(arr));
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

    }
}
