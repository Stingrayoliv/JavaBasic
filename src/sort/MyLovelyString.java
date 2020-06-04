package sort;
import java.util.Arrays;
/**
 * FirstProject
 * 6/3/20 11: 47
 */
public class MyLovelyString {
    public static void main(String[] args) {
        String nameOne = "Andrej";
        String k = "a";
        String h = "n";
        //System.out.println(k.toLowerCase().compareTo(h.toLowerCase()));
        // сравнивает целочисленныйе значения в юникоде и возвращает разницу
        String name = "abcddcba";
        String a = "€";
        String b = "$";
        //System.out.println(a.toLowerCase().compareTo(b.toLowerCase()));
        String[] array = name.split("");
        //System.out.println(Arrays.toString(array));

        // к задаче про сортировку bubble для массива String
        System.out.println(array[0]);
        array = stringBubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static String[] stringBubbleSort(String[] myLovelyArray) {
        int count = 0;
        boolean swap = true;
        boolean unsorted = true;
        for (int i = 0; i < myLovelyArray.length - 1; i++) {
            if (myLovelyArray[i].toLowerCase().compareTo(myLovelyArray[i + 1].toLowerCase()) > 0) {
                count++;
                String temp = myLovelyArray[i];
                myLovelyArray[i] = myLovelyArray[i + 1];
                myLovelyArray[i + 1] = temp;
            }
        }
        if (count > 0) {
            stringBubbleSort(myLovelyArray);
        }
        return myLovelyArray;
    }
}

