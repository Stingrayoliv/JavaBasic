package LessonAdvanced01;
/**
 * FirstProject
 * 29.06.20 19: 57
 * Рекурсия с контрольной. Задача для собес
 */
public class LA01 {
    public static void main(String[] args) {
        method(4);
    }

    private static int method(int temp) {
        System.out.println("start temp = " + temp);
        if (temp > 1) {
            method(temp / 2);
            method(temp / 4);
        }
        System.out.println("finish temp = " + temp);
        return 1;
    }
}
