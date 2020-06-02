package HomeworkAll;

/**
 * FirstProject
 * 6/1/20 21: 54
 */
public class Homework026MinesweeperMultiplicationTableWithArrays {
    public static void main(String[] args) {
        //makeMultiplicationTableWithArrays();
        makePlayMinesweeper();
    }
    // pythagorean multiplication table
    public static void makeMultiplicationTableWithArrays() {
        int[][] table = new int[10][10];
        for (int i = 1; i < table.length; i++) { // i is a row
            for (int j = 1; j < table[i].length; j++) { //j is a column
                table[i - 1][j - 1] = (i + 1) * (j + 1);
            }
        }
        for (int i = 1; i < table.length; i++) { // i is a row
            for (int j = 1; j < table[i].length; j++) { //j is a column
                if (i * j < 10) {
                    System.out.print(" " + i * j + "  ");
                } else {
                    System.out.print(i * j + "  ");
                }
            }
            System.out.println("");
        }
    }

    // play Minesweeper
    // Create thodimensional array 10*10 or more. Boolean or String
    //And 10% bomb in this array.
    public static void makePlayMinesweeper() {
        String[][] myArray = new String[10][10];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if(i + j == findRandomRowOrColumn(i, myArray.length)) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print("-" + "  ");
                }
            }
            System.out.println("");
        }
    }
    public static int findRandomRowOrColumn(int max, int min) {
        return (int) (Math.random() * (max - min)) + min;
    }

}
