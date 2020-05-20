package LessonsForCalculator10;

/**
 * FirstProject
 * 5/5/20 11: 13
 * Посчитайте разницу между двумя днями года и выдайте число дней, которое осталось до следующего дня рождения:
 * - сегодня и днём рождения пушкина
 * - сегодня и новый год
 * - пасха и новый год
 *
 * Решение 2:
 */
public class PushkinBirthday {
    public static void main(String[] args) {
        findPushkinBirthdayTest();
    }

    public static int findPushkinBirthday(int today, int futureDay) {
        // today 02.01 и futureDay 01.01
        int result = 0;
        int allDaysInYear = 365;
        if (today > futureDay) {
            result = allDaysInYear - today + futureDay;
        } else if (today < futureDay) { // today 01.01 и futureDay 02.01
            result = futureDay - today;
        }
        return result;
    }
    public static void findPushkinBirthdayTest() {
        System.out.println("ожидаем 364 дня: "+findPushkinBirthday(2,1));
        System.out.println("ожидаем 1 день: "+ findPushkinBirthday(1,2));

    }
}
