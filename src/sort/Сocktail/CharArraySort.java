package sort.Сocktail;
import java.util.Arrays;
import java.util.Arrays;
/**
 * FirstProject
 * 6/9/20 23: 15
 */
// 1. Массив символов -> Строковое значение -> Стринг массив
// -> MyLovelyString    : отсортировать по алфавиту

// 2. Массив символов -> каждый символ взять нижний регистр
// -> сравнивается его целочисленное значение -> и сортируется по порядку

// 3. Массив символов -> Массив стрингов ->
public class CharArraySort {
    public static void main(String[] args) {
        char[] myArray = {'"', 'T', 'T', 'e', 'l', '-', 'R', 'a', 'n', '!', '"'};
        //sortCharStr(myArray);
        sortCharCodePoint(myArray);
    }

    private static char[] sortCharStr(char[] array) {
        String myString = new String(array);
        //System.out.println(myString);
        char a1 = myString.charAt(0);
        for (int i = 0; i < myString.length() - 1; i++) {
            String a = myString.substring(i, i + 1).toLowerCase();
            String b = myString.substring(i + 1, i + 2).toLowerCase();

            if (a.compareTo(b) > 0) {
                myString = myString.substring(0, i) + b + a + myString.substring(i + 2);

                // взять стринг до первой сравниваемой буквы
                //Взять вторую букву и конкатенацию
                // первую букву и конкатенацию
                // и стринг после сравнения
            }
        }

        //System.out.println(myString);
        return array;
    }

    private static char[] sortCharCodePoint(char[] array) {
        int[] intArray = new int[array.length];
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < array.length; i++) {
            intArray[i] = (int) array[i];
        }

        boolean unsorted = true;

        while (unsorted) {
            int count = 0;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    intArray[i] = intArray[i] + intArray[i + 1];
                    intArray[i + 1] = intArray[i] - intArray[i + 1];
                    intArray[i] = intArray[i] - intArray[i + 1];
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        System.out.println(Arrays.toString(intArray));


        for (int i = 0; i < intArray.length; i++) {
            array[i] = (char) intArray[i];
        }
        System.out.println(Arrays.toString(array));

        char a = 'a';
        String mystring = "a";
        int findDigit = mystring.charAt(0);
        char test2 = 97;
        System.out.println("тест");
        System.out.println(test2);
        System.out.println(findDigit);

        return array;
    }
}
