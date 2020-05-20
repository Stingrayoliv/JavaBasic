package Lessons14;

/**
 * FirstProject
 * 5/12/20 10: 01
 */
public class Fload {
    public static void main(String[] args) {
        threeDigits(36);

    }

    public static void threeDigits(int n) {

        for (int x = 1; x < n; x++) {
            for (int y = x; y <= n; y++) {
                for (int z = y; z <= n; z++) {
                    if (x * y * z == n) {
                        System.out.println("x =" + x + "y = " + y + "z=" + z);
                    }
                }

            }


        }
    }
}
