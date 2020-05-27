package Lesson024;

/**
 * FirstProject
 * 5/27/20 11: 30
 */
public class ArrayExample {
    public static void main(String[] args) {
        arrayTryAndCry((int) (Math.random()*100));

    }
    private static void arrayTryAndCry(int countDigits) {
        int [] myArray = new int [countDigits];
        for (int element: myArray) {
            element = (int) (Math.random()*100);
            System.out.print(element+", ");
        }
        }


    }


