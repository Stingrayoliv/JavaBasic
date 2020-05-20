package LessonfloatDouble03;

public class MyRandom {
    public static void main(String[] args) {
        // getMeMYRandomDigit();
        worker();
        automobil(310, 25);
    }

    public static void getMeMYRandomDigit() {
        final int MIN = 50;
        final int MAX = 60;

        int randomDigit = (int) (Math.random() * (MAX - MIN)) + MIN;
        System.out.println("Наше рандомное число: " + randomDigit);
    }

    /*
     Изготавливая 42 детали в час, рабочий трудился бы 8 часов.
     Сколько времени ему понадобилось бы на эту работу, если бы он делал в час по 48 деталей.
     */

    public static void worker() {
        int hour = 8;
        int stuck = 42;
        int y = 48;

        double result;
        result = hour * stuck / y;
        System.out.println(result);
    }

    /*
    Автомобиль проехал 310 км, истратив 25 л бензина
    Какое расстояние может проехать автомобиль на полном баке, вмещающем 40л?
     */

    public static void automobil(int kilometr, int litr) {
        int bak = 40;
        int result;
        result = (kilometr * bak) / litr;
        System.out.println(result);


    }
}
