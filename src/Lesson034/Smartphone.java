package Lesson034;
/**
 * FirstProject
 * 6/11/20 09: 48
 * Глобальные, крассовые перемены
 */
public class Smartphone {
    static int sound = 0;

    public static void main(String[] args) {
//        movie();
//        music();
//        setSoundMinus();
//        setSoundPlus();
    }

    public static void setSoundMinus() {
        sound--;

    }

    public static void setSoundPlus() {
        sound++;

    }
    public static void call() {
        setSoundMinus();

    }

    public static void movie() {
        setSoundPlus();

    }

    public static void music() {
        sound += 2;
        System.out.println(sound);

    }
}
