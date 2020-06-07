package HomeworkAll;
import java.util.Arrays;
import static java.lang.Character.toLowerCase;
/**
 * FirstProject
 * 6/7/20 14: 00
 */
public class Homework030CharArrayCocktailSort {
    public static void main(String[] args) {
        char[] myLovelyChar = new char[]{'m', 'y', 'P', 'a', 's', 'w', 'o', 'r', 'd'};
        myPrint(makeCharArrayCocktailSort(myLovelyChar));
    }

    public static char[] makeCharArrayCocktailSort(char[] charArray) {
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            for (int i = start; i < end; i++) {
//                if (((int) toLowerCase(charArray[i])) > ((int)toLowerCase(charArray[i + 1]))) {
                if (Character.toLowerCase(charArray[i]) > Character.toLowerCase(charArray[i + 1])) {
                    char temp = toLowerCase(charArray[i]);
                    charArray[i] = toLowerCase(charArray[i + 1]);
                    charArray[i + 1] = temp;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[j - 1])) {
                    char temp = toLowerCase(charArray[j]);
                    charArray[j] = toLowerCase(charArray[j - 1]);
                    charArray[j - 1] = temp;
                }
            }
            start++;
        }
        return charArray;
    }

    public static void myPrint(char[] array) {
        for (char value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();

        for (char value : array) {
            System.out.print((int) value + ", "); // для debugging
        }
        System.out.println();
    }
}
