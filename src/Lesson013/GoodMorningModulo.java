package Lesson013;

/**
 * FirstProject
 * 5/11/20 12: 08
 */
public class GoodMorningModulo {
    public static void main(String[] args) {
        decimalToBinary(20);
    }

    public static String decimalToBinary(int d) {
        int remainder; // остаток ищем
        String output = ""; //

      //
            remainder = (d % 2); //
            output = Integer.toString(remainder) + output; // переводит (вписывает) числа в строкy
            d = d / 2;

        for (int i = d; i> 0 ; i /=2) { // /=2 это d / 2
            remainder = (d % 2);
            System.out.println(remainder);
            output = Integer.toString(remainder) + output; // переводит (вписывает) числа в строкy
        }
        return output;
    }
}
