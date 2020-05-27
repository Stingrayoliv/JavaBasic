package Lesson024;

/**
 * FirstProject
 * 5/27/20 09: 38
 */
public class Lesson024Array {
    public static void main(String[] args) {
        myFirstArrayExercise(5);
    }

    public static void myFirstArrayExercise(int elementCounts) {
        int[] digits = new int[elementCounts];

        for (int element : digits) {
            element = (int) (Math.random() * ((100 - 1) + 1));
        }
        System.out.println("-------------");

        for (int i = 0; i < elementCounts; i++) {
            digits[i] = (int) (Math.random() * ((100 - 1) + 1));
            System.out.println(digits[i]);
        }
        System.out.println("-------------");

        int min = digits[0];
        int max = digits[0];
        int middle = 0;

        for (int i = 0; i < elementCounts; i++) {
            if (digits[i] < min) {
                min = digits[i];
            }
        }

        for (int i = 0; i < elementCounts; i++) {
            if (digits[i] > max) {
                max = digits[i];
            }
        }

        for (int i = 0; i < elementCounts; i++) {
            middle = middle + digits[i];
            System.out.println(middle);
        }
        middle = middle / elementCounts;
        System.out.println("Среднее арифметическое значение элементов: " + middle);
        System.out.println("Максимальное значение найдено: " + max);
        System.out.println("Найдено минимальное значение массива: " + min);
    }
}

