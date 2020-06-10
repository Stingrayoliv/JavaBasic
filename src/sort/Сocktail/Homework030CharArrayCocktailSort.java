package sort.Сocktail;

import static java.lang.Character.toLowerCase;

/**
 * FirstProject
 * 6/9/20 23: 13
 */
public class Homework030CharArrayCocktailSort {
    public static void main(String[] args) {
        char[] myLovelyChar = new char[]{'"', 'T', 'T', 'e', 'l', '-', 'R', 'a', 'n', '!', '"'};
        myPrint(makeCharArrayCocktailSort(myLovelyChar));
    }

    public static char[] makeCharArrayCocktailSort(char[] charArray) {
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            for (int i = start; i < end; i++) {
//                if (((int) toLowerCase(charArray[i])) > ((int)toLowerCase(charArray[i + 1]))) {
                if (toLowerCase(charArray[i]) > toLowerCase(charArray[i + 1])) {
                    char temp = toLowerCase(charArray[i]);
                    charArray[i] = toLowerCase(charArray[i + 1]);
                    charArray[i + 1] = temp;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (toLowerCase(charArray[j]) < toLowerCase(charArray[j - 1])) {
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
