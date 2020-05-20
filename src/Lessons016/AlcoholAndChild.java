package Lessons016;

import java.util.Scanner;

/**
 * FirstProject
 * 5/14/20 12: 25
 */
public class AlcoholAndChild {

    public static String kasirka() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Скажите сколько Вам лет?");
        age = sc.nextInt();

        String result = "";
        String resultTrue = "Продажа алкоголя разрешена";
        String resultFalse = "Продажа алкоголя запрещена";

        if (age > 18) {
            result = resultTrue;
        } else {
            result = resultFalse;
        }
        return result;


    }
}
