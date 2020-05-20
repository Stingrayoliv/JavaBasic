package HomeworkAll.HomeworkConversionSystem017;
import java.util.Scanner;
/**
 * FirstProject
 * 5/16/20 14: 50
 * Задача 3. Урок 16. Напишите программу для перевода из двоичных в десятичные.
 *
 * Example:
 * First, 101011 = (1*2^5) + (0*2^4)  + (1*2^3) + (0*2^2) + (1*2^1) + (1*2^0)
 * Next, 101011 = (1*32) + (0*16) + (1*8) + (0*4)  + (1*2) + (1*1)
 * Then, 101011 = 32 + 0 + 8 + 0 + 2 + 1
 * And finally, 101011 = 43
 */
public class HomeworkBinaryToDecimal017 {
    public static void main(String[] args) {
        convertBinaryToDecimal();
        //convertBinaryToDecimalTwo();
    }
// first option: with loop
    public static void convertBinaryToDecimal() {
        String binary;
        int remainder; // remainder остаток
        int decimalNumber = 0;
        int power = 0; // степень

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        binary = input.next();
        int binaryNumber =Integer.parseInt(binary);

        power = 0;
        while (binaryNumber > 0) {
            remainder = (binaryNumber % 10);
            decimalNumber += remainder * Math.pow(2, power);// decimalNumber = decimalNumber+remainder * Math.pow(2, power)
            binaryNumber = binaryNumber/10;
            power++;
        }
        System.out.println(decimalNumber);
    }
// second option with parseInt function
    public static void convertBinaryToDecimalTwo() {
        String binaryNumber = "";
        int decimal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        binaryNumber = input.next();
        decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println(decimal);

    }
}
