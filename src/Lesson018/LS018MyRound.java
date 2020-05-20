package Lesson018;

/**
 * FirstProject
 * 5/18/20 11: 14
 */
public class LS018MyRound {
    public static void main(String[] args) {
        System.out.println(roundDigit(12.0123, 3));
        System.out.println(roundDigit(12.016666, 4));

    }

    public static double roundDigit(double digitNumber, int index) {
        // если округляем до десятков, то index 1 и digitNumber*10 multiplicative
        // если до сотых:  то index 2 и digitNumber*100
        // если до сотых: то index 3 и digitNumber*1000 и тд

        int multiplicative = 10;
        int result = 1;
        for (int i = 1; i <= index; i++) {
            result = result * multiplicative;
        }

        int temp = (int) (digitNumber * result);
        System.out.println(temp);
        double tempTwo = temp;
        return tempTwo / result;
    }
}
