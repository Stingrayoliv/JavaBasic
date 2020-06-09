import java.util.Scanner;

/**
 * FirstProject
 * 5/18/20 20: 01
 */
public class DifferenTasks {
    public static void main(String[] args) {
        makeBackTwo();
        //findSum();
        //showMultiplicationTable();
        //System.out.println(findSumDeposit(1000, 3.5, 7));
//        getString();
        //makeBack("А роза упала на лапу Азора");
    }

    // пример добавления 3-х номеров
    //example for adding 3 numbers.
    public static void findSum() {
        int sum = 0, i, n;
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            System.out.println("Enter number");
            n = s.nextInt();
            sum = sum + n; // результат, который будет добавляться и распечатываться
        }
        System.out.println("Sum is " + sum);
    }

    //таблица умножения по столбикам, nested loop
    public static void showMultiplicationTable() {
        int i;
        int j;
        for (i = 12; i < 13; i++) {//outer loop, внешняя петля
            System.out.println("Table of " + i);
            for (j = 1; j <= 10; j++) {//inner loop
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }

    public static double findSumDeposit(double firstNumber, double percent, double years) {
        // Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
        double result = 0.0;
        for (int i = 1; i <= years; i++) {
            result = firstNumber * (Math.pow((1 + percent / 100), i));// i=год
            System.out.println(i + 1 + " в этот год сумма " + result);
        }
        return result;
    }

    public static void getString() {
        String a = "hh";
//        System.out.println(a.length());
        System.out.println(a.charAt(0));
//        System.out.println(a.substring(0));
    }
    public static void makeBack(String first) {
        //String a = first.toLowerCase();
        String reverseA = "";

        for (int i = first.length() - 1; i >= 0; i--) {
            reverseA = reverseA + first.charAt(i);

        }
        System.out.println(reverseA);
    }

        public static void makeBackTwo() {
        String first = "mk";
        String result = " ";
        result = first.substring(0,1);
            System.out.println(result);

}

}


