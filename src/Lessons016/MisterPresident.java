package Lessons016;

import java.util.Scanner;

/**
 * FirstProject
 * 5/14/20 12: 03
 * <p>
 * Задача 2. к уроку 16
 * Президент приходит к власти если набрал 51% голосов избирателей. Создайте машину для ввода результатов выборов.
 */
public class MisterPresident {


    public static void electionResult() {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        System.out.println("Скажите как зовут кандидата?");
        name = myScanner.next();
        double result = 0.0;
        // Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Сколько голосов набрал кандидат" + name);
        result = myScanner.nextDouble();

        double minVote = 50;
        if (result>=100) {
            System.out.println("обнаружена манипуляция");
        } else if (result > minVote) {
            System.out.println("У нас новый президент, поздравляю мистер" + name);
        } else {
            System.out.println("У нас новый президент, поздравляю мистер"+name +"не набрал необходимые голоса" + minVote + " процентов");
        }
    }
}
