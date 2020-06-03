package Lesson028Minesweeper;
/**
 * FirstProject
 * 6/3/20 09: 35
 */
public class LS028Minesweeper {
    public static void main(String[] args) {
        // 1. Рисуем матрицу String[][]
        // 2. Установить бомбы
        // Установить бомбы
        // 2.1 10%
        myPrint(createField(10));

    }
    public static String[][] createField(int rowColumn) {
        String[][] output = new String[rowColumn][rowColumn];
        String safePlace = "-";
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                output[i][j] = safePlace;
            }
        }

        String bomb = "*";

        int countBomb = rowColumn * rowColumn / 10;

        for (int i = 0; i < countBomb; i++) {
            int x = myLovelyRandom(rowColumn); //x и y это координаты матрицы
            int y = myLovelyRandom(rowColumn);

            int count = 0;

            while (output[x][y].equals(bomb)) {
                x = myLovelyRandom(rowColumn);
                y = myLovelyRandom(rowColumn);
                count++;
            }
            output[x][y] = bomb;

            if (count > 0) {
                System.out.println("Попали в воронку: " + count);// для тестирования, сколько раз рэндом был одним и тем же числом
            }
        }
        return output;
    }

    public static int myLovelyRandom(int max) {
        int min = 0;
        return (int) (Math.random() * (max - min)) + min;
    }

    public static void myPrint(String[][] arrayToPrint) {
        for (String[] arrayLittleElemnt : arrayToPrint) {
            for (String elementik : arrayLittleElemnt) {
                System.out.print(" " + elementik);
            }
            System.out.println("");
        }
    }

}
