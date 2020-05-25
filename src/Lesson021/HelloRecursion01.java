package Lesson021;

/**
 * FirstProject
 * 5/24/20 22: 25
 */
public class HelloRecursion01 {
    public static void main(String[] args) {
        System.out.println(myLovelyFactorial(7));
        // 7 * 6 * 5 * 4 * 3 * 2
    }

    public static int myLovelyFactorial(int digits) {
        if (digits > 1) {
            return digits * (myLovelyFactorial(digits - 1));
        } else {
            return 1;
        }
    }
}

