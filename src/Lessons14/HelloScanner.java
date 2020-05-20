package Lessons14;


import java.util.Scanner;

/**
 * FirstProject
 * 5/13/20 23: 55
 */
public class HelloScanner {
    public static void main(String[] args) {
        myScanner();
    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("A сколько тебе лет?");
        old = input.nextInt();
        if (old > 18) {
            System.out.println("Ты можешь купить на вечер что-то более крепкое, чем чай");
        } else {
            System.out.println("Сейчас позову полицию");
        }
        String name;
        System.out.println("Как вас зовут :");
        name = input.next();
        System.out.println(name + " С вас 500 рублей!");


    }
}
