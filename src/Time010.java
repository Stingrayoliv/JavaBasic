/**
 * FirstProject
 * 5/5/20 10: 39
 * Напишите метод, который принимает дни, а отдает секунды;
 */
public class Time010 {
    public static void main(String[] args) {
        int day = 1;
        System.out.println(dayToSecond(day));

    }
    public static int dayToSecond(int day) {
        int seconds = 0;
        int hoursInDay = 24;
        int minutesInOur = 60;
        int secondsInMinute = 60;
        seconds = day * hoursInDay * minutesInOur * secondsInMinute;
        return seconds;
    }

}
