package HomeworkAll.HomeworkConversionSystem017;

import java.util.Scanner;

/**
 * FirstProject
 * 5/16/20 21: 32
 * Напишите программу перевода чисел из любой(X) системы в любую(Y) систему. Сделайте ограничение для систем выше 32.
 */
public class HWConversionNumeralSystems017 {
    public static void main(String[] args) {
        String valueForConversion = "";
        int decimal = 0;
        int systemNumberOne = 0;
        int systemNumberTwo = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        valueForConversion = input.next();

        System.out.println("Choose system: 1. HEX, 2. DEC, 3. OCT, 4. BIN \n Enter number:");
        systemNumberOne = input.nextInt();
        int base = 0;
        switch (systemNumberOne) {
            case 1:
                base = 16; //HEX
                break;
            case 2:
                base = 10; //DEC
                break;
            case 3:
                base = 8; //OCT
                break;
            case 4:
                base = 2; //BIN
                break;
            default:
                System.out.println("mistake. Enter right number");
        }
        if (systemNumberOne != 2) {
            decimal = Integer.parseInt(valueForConversion, base);
            //System.out.println("number in decimal"+decimal);
        } else {
            decimal = Integer.parseInt(valueForConversion);
            //System.out.println("number in decimal"+decimal);
        }
        System.out.println("Choose your expected system: 1. HEX, 2. DEC, 3. OCT, 4. BIN \n Enter number:");
        systemNumberTwo = input.nextInt();

        if (systemNumberTwo == 4) {
            String binary = Integer.toBinaryString(decimal);
            System.out.println(binary);
        } else if (systemNumberTwo == 3) {
            String octal = Integer.toOctalString(decimal);
            System.out.println(octal);
        } else if (systemNumberTwo == 1) {
            String hex = Integer.toHexString(decimal);
            System.out.println(hex);
        } else
            System.out.println(decimal);
    }
}
