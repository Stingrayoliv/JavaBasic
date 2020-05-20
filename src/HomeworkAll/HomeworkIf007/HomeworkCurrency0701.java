package HomeworkAll.HomeworkIf007;

/**
 * FirstProject
 * 4/29/20 17: 30
 */
public class HomeworkCurrency0701 {
    public static void main(String[] args) {

        String currencyOne = "EUR";
        String currencyTwo = "RUR";
        String currencyThree = "USD";
        String currencyFour = "GPB";
        System.out.println("rate for " + currencyOne + ": " + findRate(currencyOne)); // курс по отношению к доллару
        System.out.println("rate for " + currencyTwo + ": " + findRate(currencyTwo));
        System.out.println("rate for " + currencyThree + ": " + findRate(currencyThree));
        System.out.println("rate for " + currencyFour + ": " + findRate(currencyFour));

        //
        System.out.println("Курсы валют для: " + showExchangeRate("GPB", "EUR"));

    }

    /*
    * Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
    Естественно, “USD” возвращает 1.0
     */
    public static double findRate(String currency) {
        double rateForCurrency;
        switch (currency) {
            case "USD":
                rateForCurrency = 1.0;
                break;
            case "EUR":
                rateForCurrency = 1.09;
                break;
            case "RUR":
                rateForCurrency = 0.014;
                break;
            case "GPB":
                rateForCurrency = 1.24;
                break;
            default:
                rateForCurrency = 0;
                break;
        }
        return rateForCurrency;
    }
    /*
    * Используя метод из предыдущего пункта написать метод, который принимает пару валют (“GPB”,”EUR”)
    и возвращает курс обмена.
     */
    public static String showExchangeRate(String firstCurrency, String secondCurrency) {
        return firstCurrency + findRate(firstCurrency)+ secondCurrency + findRate(secondCurrency);
        // курсы возвращаем по отношению к доллару из метода findRate
    }
    /*
     * Используя метод из предыдущего пункта реализовать метод который получает пару валют и сумму в первой валюте,
     * возвращает сумму во второй валюте.
     */

}