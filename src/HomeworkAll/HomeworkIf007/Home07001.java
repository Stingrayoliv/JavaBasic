package HomeworkAll.HomeworkIf007;

/**
 * FirstProject
 * 4/29/20 15: 21
 */
public class Home07001 {
    public static void main(String[] args) {
        String EUR = "EUR";
        String RUR = "RUR";
        String USD = "USD";
        String GPB = "GPB";
        Double exchangeAmount = 100.0;

        //System.out.println("rate for " + EUR + ": " + findRate(EUR));
        //System.out.println("rate for " + RUR + ": " + findRate(RUR));
        //System.out.println("rate for " + USD + ": " + findRate(USD));
        //System.out.println("rate for " + GPB + ": " + findRate(GPB));

        System.out.println("Exchange rates for " + getExchangeRates("GPB", "EUR"));
        System.out.printf("Exchange %s %s to %s is: %.3f %s \n", exchangeAmount, EUR, RUR,
                exchange(EUR, exchangeAmount, RUR), RUR);

        //System.out.printf("Exchange %s %s to %s is: %.3f %s \n", exchangeAmount, GPB, USD,
        //exchange(GPB, exchangeAmount, USD), USD);
    }

    /*
    Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
    Естественно, “USD” возвращает 1.0
     */

    public static double findRate(String currency) {
        double rateForCurrency;
        switch (currency) {
            case "USD":
                rateForCurrency = 1.0;
                break;
            case "EUR":
                rateForCurrency = 1.08;
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

    public static String getExchangeRates(String firstCurrency, String secondCurrency) {
        return firstCurrency + " is " + findRate(firstCurrency) + " and for " + secondCurrency + " is " + findRate(secondCurrency);
    }

    public static Double exchange(String baseCurrency, Double amount, String exchangeCurrency) {
        Double baseRateAmount = amount * findRate(baseCurrency);
        Double exchangeRateAmount = baseRateAmount / findRate(exchangeCurrency);
        return exchangeRateAmount;
    }
}

