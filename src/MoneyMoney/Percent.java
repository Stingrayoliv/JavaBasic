package MoneyMoney;

/**
 * FirstProject
 * 4/29/20 10: 04
 * Написать программу расчёта роста денежного клада в банке. Сумма вклада 100€, время вклада 7 лет, процент дохода вклада 2,3%. Вывести результат на экран за каждый год в виде:
 * Сумма вклада в конце первого года = a
 * Сумма вклада в конце второго года = b
 * Сумма вклада в конце NN года = c
 * Доход за Y лет составил = d
 * При расчёте пользоваться float и ответить на следующие вопросы:
 * Используя какие типы данных можно решить эту задачу? Почему? Что произойдёт при использовании типа данных byte?
 * Решите предыдущую задачу если банк выплачивает проценты на проценты.
 */
public class Percent {
    public static void main(String[] args) {
        double amount = 100;
        double interest = 0.023;
        int year = 7;
        //System.out.println(getPercent(amount, interest));
        //System.out.println(getPercent(999, 13));
        System.out.println(getPercentTwo(amount, interest, year));
        System.out.println(findSumDeposit(1000, 3.5, 7));
    }

    public static double getPercent(double amount, double interest) {
        return amount * interest / 100;
    }

    public static double getPercentTwo(double amount, double interest, int year) {
        double result;
        result = amount;
        for (int i = 0; i < year; i++) {
            result = result + result * interest;
            System.out.println(i + 1 + " в этот год сумма " + result);
        }

        return result;
    }

    // Задача к уроку 3.Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
    // Формула проценты на проценты из Вики
    public static double findSumDeposit(double firstNumber, double percent, double years) {

        double result = 0.0;
        for (int i = 1; i <= years; i++) {
            result = firstNumber * (Math.pow((1 + percent / 100), i));// i=год
            System.out.println(i + 1 + " в этот год сумма " + result);
        }
        return result;
    }
}


