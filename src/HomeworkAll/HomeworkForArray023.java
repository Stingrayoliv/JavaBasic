package HomeworkAll;
/**
 * FirstProject
 * 5/26/20 17: 07
 */
public class HomeworkForArray023 {
    public static void main(String[] args) {
//        System.out.println(makeReverse(1234)); //3421
//        System.out.println(makeReverse(768)); //3421

//        System.out.println(findSumOfDigitsNumber(1234));//10  (1+2+3+4)
//        System.out.println(findSumOfDigitsNumber(768));//21 (7+6+8)
        workWithArray();
    }

    // option one through String
    // 08.07 Дано целое число. Написать метод, который возвращает число, записанное в обратном порядке:
    public static String makeReverse(int first) {
        String a = String.valueOf(first);
        String reverseA = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverseA = reverseA + a.charAt(i);
        }
        return reverseA;
    }

    // 08.08 Find the sum of the digits of a number.
    //Дано целое число. Написать метод, который возвращает сумму разрядов этого числа:
    public static int findSumOfDigitsNumber(int a) {
        int sum = 0;
        int n = 0; //remainder
        while (a > 0) {
            n = a % 10; // first step is to find a remainder
            sum += n; //sum = sum+n; it's our sum
            a = a / 10; //next a for next loop
        }
        return sum;

    }

    // Fill the array with random numbers and print the maximum, minimum and average value.
    //To generate a random number, use the Math.random () method, which returns a value in the interval [0, 1].
    public static void workWithArray() {
        double[] numbers = new double[5]; // in array we have 5 value
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
            System.out.printf("%.2f\n", numbers[i]);
        }
        double smallest = numbers[0]; // just initialization min
        double largest = numbers[0]; // just initialization max
        double average = 0; //average value in an array
        double sum = 0; // sum value in an array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) smallest = numbers[i];
            if (numbers[i] > largest) largest = numbers[i];

            sum += numbers[i];
            average = sum / numbers.length;

        }
        System.out.printf("The smallest is: %.2f\n", smallest);
        System.out.printf("The largest is: %.2f\n", largest);
        System.out.printf("Average value in an array: %.2f\n", average);

    }


}
