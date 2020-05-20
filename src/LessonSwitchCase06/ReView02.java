package LessonSwitchCase06;

/**
 * FirstProject
 * 4/28/20 10: 11
 */
public class ReView02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Площадь нашего треугольника: " + square(a, b));

    }

    public static int square(int a, int b) {
        return a * b;
    }

    public static boolean integerComparion(int x, int y) {
        return x >= y && x > 0;
    }
}
