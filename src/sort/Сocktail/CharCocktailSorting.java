package sort.Сocktail;
/**
 * FirstProject
 * 6/9/20 23: 18
 */
public class CharCocktailSorting {
    public static void main(String[] args) {
        char[] a = {'x', 'C', 'N', '&', 'd', 'F'};
        toPrint(sortCharArray(a));
    }

    public static char[] sortCharArray(char[] arrayCh) {
        int start = 0;
        int end = arrayCh.length - 1;
        while (start < end) {
            for (int i = start; i < end; i++) {
                if (arrayCh[i] > arrayCh[i + 1]) {
                    char temp = arrayCh[i];
                    arrayCh[i] = arrayCh[i + 1];
                    arrayCh[i + 1] = temp;
                }
            }
            end--;

            for (int j = end; j > start; j--) {
                if (arrayCh[j] < arrayCh[j - 1]) {
                    char temp = arrayCh[j];
                    arrayCh[j] = arrayCh[j - 1];
                    arrayCh[j - 1] = temp;
                }
            }
            start++;
        }
        return arrayCh;
    }

    public static void toPrint(char[] input) {
        for (char element : input) {
            System.out.print(element + ", ");
        }
    }
}
