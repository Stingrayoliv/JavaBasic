package Lesson45Date;
//import java.text.*; - можно импортировать весь пекедж

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.util.Collection.*;

/**
 * FirstProject
 * 6/25/20 09: 56
 */
public class HelloDate {
    public static void main(String[] args) throws ParseException {
        //haliHalloDate();
        findBirthDay();
        helloLocateDate();

    }

    private static void helloLocateDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusDays(5).minusDays(5);
        System.out.println("plus minus " + plusDays);

        LocalDateTime myParseDate
                = LocalDateTime.parse("2018-02-20 10:15:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(myParseDate);

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("ru"));
        final String day = myParseDate.format(formatter);
        System.out.println("день недели: " + day);

        final DateTimeFormatter formatterMonth = DateTimeFormatter.ofPattern("MMMM", new Locale("ru"));
        final String month = myParseDate.format(formatterMonth);
        System.out.println("Попытка номер 5 " + month);

        LocalDateTime now = LocalDateTime.now();
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId moskcow = ZoneId.of("Europe/Moscow");
        ZonedDateTime inBerlin = ZonedDateTime.of(now, berlin);
        ZonedDateTime inMoscow = ZonedDateTime.of(now, moskcow);
        System.out.println("time in Berlin: " + inBerlin);
        System.out.println("time in Berlin: " + inMoscow);

        LocalDateTime plasDays2 = now.plusDays(10); // разница между двумя датами без периода с помощью ChronoUnit.DAYS
        LocalDateTime plasDays3 = now.minusDays(10);
        LocalDateTime plasDays4 = now.minusHours(1);
        long between = ChronoUnit.DAYS.between(now, plasDays2);
        System.out.println(between);

        ArrayList<LocalDate> dates = new ArrayList<>(); // добавляем в ArrayList 4 дня
        Collections.addAll(dates,
                LocalDate.now(),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(20),
                LocalDate.now().plusDays(6));
        System.out.println(dates);

        ArrayList<String> stringDates = new ArrayList<>();
        Collections.addAll(stringDates, "2020-06-25", "2020-07-05", "2020-07-15", "2020-07-01");
        System.out.println(stringDates);

        String test = "03 Jun 2015";
        System.out.println(createLocalDateFromString(test));
        System.out.println(createStringFromLocal(plusDays));

    }

    public static LocalDate createLocalDateFromString(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    public static String createStringFromLocal(LocalDate d) {
        return d.format(DateTimeFormatter.ofPattern("EEE, dd, MMM yyyy", new Locale("en")));

    }

    private static void findBirthDay() {
        LocalDate today = LocalDate.now(); //день сегодня
        System.out.println("today" + today);
        LocalDate birthDay = LocalDate.of(1980, Month.AUGUST, 10);
        System.out.println("birthDay " + birthDay);
        Period period = Period.between(birthDay, today);
        System.out.println("priod = birthDay" + period);
        System.out.println("Years" + period.getYears());
        System.out.println("Month" + period.getMonths());
        System.out.println("Days" + period.getDays());
        System.out.println(period.getChronology());


    }

    private static void haliHalloDate() throws ParseException {
        Date today = new Date();
        Date dateStart = new Date(0);
        System.out.println("отмеряем с этого момента дату " + dateStart);
        Date anotherDay = new Date(1_451_665_447_567L);
        System.out.println("просто другой день " + anotherDay);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(anotherDay);
        //System.out.println("just calendar anotherDay "+calendar);

        System.out.println("calendar.getTime() " + calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println("calendar.getTime()+one week " + calendar.getTime());
        calendar.add(Calendar.MINUTE, 5);
        System.out.println("calendar.getTime()+5 minutes " + calendar.getTime());
        //  примеры форматирования
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("dateFormat.format(calendar.getTime() " + dateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()) + simpleDateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormatBerlin = new SimpleDateFormat("dd-MM-yy");
        System.out.println("simpleDateFormatBerlin.format(calendar.getTime())" + simpleDateFormatBerlin.format(calendar.getTime()));

        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        System.out.println("simple format today " + simpleDateFormatBerlin.format(calendarToday.getTime()));


        Date oldDate = simpleDateFormat.parse("20/07/1993");
        System.out.println("oldDate" + oldDate);
    }
}
