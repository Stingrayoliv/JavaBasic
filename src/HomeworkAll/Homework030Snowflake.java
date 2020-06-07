package HomeworkAll;
import java.util.Arrays;
/**
 * FirstProject
 * 6/5/20 18: 37
 */
public class Homework030Snowflake {
    public static void main(String[] args) {
        String[][] a = new String[10][10];
        makeSnowflake(a);
    }
    // Make a non-symmetric array
    // Правильная снежинка возможна только, если длина будет нечет.
    // Если длина четное число, то необходимо отнять 1 и создать новый массив
    public static String[][] checkArrayForSemitricity(String[][] array) {
        int result = array.length;
        if (array.length % 2 == 0) {
            result = array.length-1;
        }
        return new String[result][result];
    }

    public static void makeSnowflake(String[][] array) {
        String[][] target = checkArrayForSemitricity(array);
        int colToPrint = (target.length - 1) / 2;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                if (j == colToPrint) {
                    System.out.print("* ");
                } else if (i == colToPrint) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else if((i + j) == (target.length - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
