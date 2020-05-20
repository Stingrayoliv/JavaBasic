package HomeworkAll;

/**
 * FirstProject
 * 4/28/20 13: 58
 * Домашння работа №7 Решение задач
 */
public class HomeworkTasks {
    public static void main(String[] args) {
        double baseRate = 30; // Базовая плата - 30€
        double priceElectrisity = 0.2; // стоимости одного киловатт-часа в 0.2€
        System.out.println("Расчёта стоимости пользования электроэнергией: " + costElectricity(baseRate, priceElectrisity, 100)); //

        int nearHundredOne = 93;
        int nearHundredTwo = 90;
        int nearHundredThree = 89;
        System.out.println(findSolution(nearHundredOne));
        System.out.println(findSolution(nearHundredTwo));
        System.out.println(findSolution(nearHundredThree));

        double amountSum = 1000.0; // основная сумма вклада
        double rate = 10.0; // % процентная ставка
        System.out.println("Сумма по процентам: " + getPercent(amountSum, rate));

        int month = 12;
        System.out.println("Месяц: " + getStringMonth(month));

        String currencyOne = "EUR";
        String currencyTwo = "RUR";
        String currencyThree = "USD";
        String currencyFour = "GPB";
        System.out.println("rate for " + currencyOne + ": " + findRate(currencyOne));
        System.out.println("rate for " + currencyTwo + ": " + findRate(currencyTwo));
        System.out.println("rate for " + currencyThree + ": " + findRate(currencyThree));
        System.out.println("rate for " + currencyThree + ": " + findRate(currencyFour));

    }

    //Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов.
    // Базовая плата - 30€. В базовую плату входят 100 киловатт-часов.
    // Напишите метод расчёта стоимости пользования электроэнергией.
    public static double costElectricity(double baseRate, double price, double volume) { //стоимость электричества
        return baseRate + price * volume;
    }

    // Учитывая int n, возвращайте true, если он находится в пределах 10 от 100 или 200.
    // Примечание: Math.abs(num) вычисляет абсолютное значение числа.
    //nearHundred(93) → true
    //nearHundred(90) → true
    //nearHundred(89) → false
    public static boolean findSolution(int num) {
        int n = Math.abs(num);
        return n >= 90 & n <= 110 || n >= 190 & n <= 210; // разбиваем на маленькие условия (От 90 до 110, или от 190 до 210)
    }

    // Реализовать метод double getPercent (double amount, double interest) который считает указанный процент (interest)
    // от указанного числа (amount ). Например getPercent (1000.0, 10.0), должно вернуть 100. В main распечатать
    // результат работы метода. Реализовать метод, который.
    public static double getPercent(double amount, double interest) {
        return amount * interest / 100; // получаем сумму по проценам;
    }

    // Написать метод, который String getStringMonth (int month ), который принимает номер месяца, а возвращает название.
    // Не забудьте проверить, что число может быть номером месяца
    // (используя уже написаный checkMonth() ),
    // и если нет, вернуть «error». В main распечатать результат работы метода.
    public static String getStringMonth(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "error";
                break;
        }
        return monthName;
    }

    //Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
    // Естественно, “USD” возвращает 1.0
    public static double findRate(String currency) {
        double rateForCurrency;
        switch (currency) {
            case "USD":
                rateForCurrency = 1.0;
                break;
            case "EUR":
                rateForCurrency = 1.6;
                break;
            case "RUR":
                rateForCurrency = 1.8;
                break;
            case "GPB":
                rateForCurrency = 2.0;
                break;
            default:
                rateForCurrency = 0;
                break;
        }
        return rateForCurrency;
    }
}



