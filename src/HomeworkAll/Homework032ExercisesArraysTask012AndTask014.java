package HomeworkAll;
import java.util.Arrays;

/**
 * FirstProject
 * 6/9/20 16: 00
 */
public class Homework032ExercisesArraysTask012AndTask014 {
    public static void main(String[] args) {
        //12
        int[] a = {1, 6};
        int[] b = {1, 8};
        int[] c = {1, 11};
        System.out.println(Arrays.toString(fizzBuzz(a))); //["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(b))); //["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(Arrays.toString(fizzBuzz(c))); // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

        //13
        int[] k = {10, 3, 5, 6}; //7
        int[] l = {7, 2, 10, 9}; //8
        int[] m = {2, 10, 7, 2}; //8
        System.out.println(bigDiff(k));
        System.out.println(bigDiff(l));
        System.out.println(bigDiff(m));

    }

    // Exercises-Arrays-02 (Task 12)
    // This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
// problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running
// up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a
// new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the
// number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx)
// will make the String form of an int or other type. This version is a little more complicated than the usual version
// since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of
// just always doing 1..100.
    public static String[] fizzBuzz(int[] array) {
        // в задаче нужно создать и вернуть новый масив String[]
        int lsatValue = 0;
        lsatValue = array[array.length - 1]; // найти последнее значение value в массиве, который был дан
        int lengthNewArray = lsatValue - 1; //длина нового массива
        String[] output = new String[lengthNewArray]; // создаем новый массив

        for (int i = 0; i < output.length; i++) {
            String valueOne = "Buzz";
            String valueTwo = "Fizz";
            String valueThree = "FizzBuzz";
            if (i % 3 == 0) {
                output[i] = valueOne;
            } else if ((i % 5 == 0)) {
                output[i] = valueTwo;
            } else if (i % 3 == 0 & i % 5 == 5) {
                output[i] = valueThree;
            } else {
                output[i] = String.valueOf(i + 1); //i+1 так, как
            }

        }
        //System.out.println(Arrays.toString(output));
        return output;
    }

    // Exercises-Arrays-02 (Task 13)
    //Given an array length 1 or more of ints, return the difference between the largest and smallest values in the
    // array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
    public static int bigDiff(int[] array) {
        int max = array[0];
        int min = array[0];
        int difference = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];

        }
        difference = max - min;
        return difference;
    }

}
