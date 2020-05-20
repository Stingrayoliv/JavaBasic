package HomeworkAll;

/**
 * Домашняя работа к занятию № 3 с использованием введения принимающего параметра
 */
public class HomeWork_3_1 {

    public static void main(String[] args) {
        findLongСircle();
        double usd = 1000.00; // количество долларов
        currencyExchange(usd);
        final double BELARUS = 207_595.00;
        final double UKRAINE = 603_628.00;
        findSquareRelation(BELARUS, UKRAINE);
        final double MOSCOW = 2511.00;
        final double BERLIN = 891.10;
        findSquareRelationCity(MOSCOW, BERLIN);
        int year = 7;
        double amount = 10000.00;
        double r = 3.5;
        findAmount(7, 1000, 3.5);
        double timeTubeFirst = 20.00;
        double timeTubeSecond = 30.00;
        int volume = 1;
        findHours(20, 30, 1);
    }

    public static void findLongСircle() {
        // найти длину окружности
        final double PI = 3.14;
        double r = 10.0;
        System.out.println("Длина окружности: " + 2 * PI * r);
    }

    public static void currencyExchange(double usd) {
        // Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1.1
        double r = 1.1; // ставка
        double b = usd / r;
        System.out.println("Количество Евро, полученных в резуьтате обмена с 1000 Долл: " + usd / r);
    }

    public static void findSquareRelation(double belarus, double ukraine) {
        // Найти соотношение площади Беларуси к площади Украины.
        System.out.println("Cоотношение площади Беларуси к площади Украины: " + belarus / ukraine);
    }

    public static void findSquareRelationCity(double moscow, double berlin) {
        // Найти, во сколько раз площадь Москвы больше площади Берлина.
        System.out.println("Во столько раз площадь Москвы больше площади Берлина: " + moscow / berlin);
    }

    public static void findAmount(int year, double amount, double r) {
        // Какая сумма будет ждать клиента через семь лет, если клиент положил в банк 1000€ под 3,5%
        System.out.println("Сумма через 7 лет: " + ((year * amount * r / 100) + amount));
    }

    public static void findHours(double timeTubeFirst, double timeTubeSecond, int volume) {
        // Через первую трубу бассейн можно наполнить за 20 ч, а через вторую — за 30 ч.
        // За сколько часов наполнится бассейн через обе эти трубы?
        System.out.println("За столько часов можно наполнить бассейн: " + (volume / ((1 / timeTubeFirst + 1 / timeTubeSecond))));

    }
}
