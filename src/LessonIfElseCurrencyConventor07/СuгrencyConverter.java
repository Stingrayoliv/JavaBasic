package LessonIfElseCurrencyConventor07;

/**
 * FirstProject
 * 4/30/20 11: 02
 */
public class СuгrencyConverter {
    public static void main(String[] args) {
        String currencyName = "EUR";
        System.out.println("Если передать кассиру" + currencyName + "то курс к доллару -" +
                currencyNametoExchange(currencyName));

        String rub = "RUB";
        String dol = "USD";
        String eur = "EUR";
        String greatBritian = "GPB";
        System.out.println(onePaarCurrency(rub, "EUR")); // можем передать и переменными
        // и вторыми значениями

       //System.out.println("Если передать 2 валюты и сумму одной, то получим вот это" +  trueExchange());
        System.out.println(trueExchange("Если передать 2 валюты и сумму одной, то получим вот это" + rub, eur, 500.50));
    }
    /*
     * Используя метод из предыдущего пункта реализовать метод который получает пару валют и сумму в первой валюте,
     * возвращает сумму во второй валюте.
     */
    private static double trueExchange(String firsctCurrency, String secondCurrency, double money) {
        return money * onePaarCurrency(firsctCurrency, secondCurrency);
    }

    /*
     * Используя метод из предыдущего пункта написать метод, который принимает пару валют (“GPB”,”EUR”)
     *и возвращает курс обмена.
     */
    public static double onePaarCurrency(String firsctCurrency, String secondCurrency) {
        return currencyNametoExchange(firsctCurrency) / currencyNametoExchange(secondCurrency);
    }

    /*
     * Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
     *Естественно, “USD” возвращает 1.0
     */
    public static double currencyNametoExchange(String cName) {
        // курс
        double resultRate;
        switch (cName) {
            case "EUR":
                resultRate = 1.09;
                break;
            case "RUB":
                resultRate = 0.015;
                break;
            case "USD":
                resultRate = 1.00;
                break;
            case "GPB":
                resultRate = 1.25;
                break;
            default:
                resultRate = 0.00;
        }
        return resultRate;

    }
}
