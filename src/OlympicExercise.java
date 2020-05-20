/**
 * FirstProject
 * 5/11/20 12: 40
 * Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44.
 * Найдите число или числа.
 *
 */
public class OlympicExercise {
    public static void main(String[] args) {
        findDigits(3000);

    }

    public static void findDigits(int range) {
        int a1 = 32;
        int a2 = 58;
        int b1 = 30;
        int b2 = 44;
        for (int i = 0; i < range; i++) {
            if (i % a1 == b1 && i % a2 == b2) {
                System.out.println(i);
            }
        }
    }
}
