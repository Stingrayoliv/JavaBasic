package Lesson018;

/**
 * FirstProject
 * 5/18/20 09: 42
 */
public class ConvertDigitsOne {

    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0; // степень двойки
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;// остаток
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++; //степень
        }
        return decimal;
    }
}
