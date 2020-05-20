package HomeworkAll;

/**
 * Homework №6 Switch case
 * FirstProject
 * 4/27/20 15: 06
 */
public class HomeWorkSwitchAndBoolean {
    public static void main(String[] args) {
        int month = 2;
        //System.out.println(getSeason(month));
        int ageOne = 10;
        int ageTwo = 17;
        int ageThree = 18;
        int ageFour = 20;
        int ageFive = 30;

        System.out.println(sellAlcohol(ageOne));
        System.out.println(sellAlcohol(ageTwo));
        System.out.println(sellAlcohol(ageThree));
        System.out.println(sellAlcohol(ageFour));
        System.out.println(sellAlcohol(ageFive));
    }

    // Написать программу, которая определяет созон года. Месяца указать int переменными.
    public static String getSeason(int month) { // вместо void передаем String
        String season;
        switch (month) {
            case 12:
                season = "Winter";
                break;
            case 11:
            case 10:
            case 9:
                season = "Autumn";
                break;
            case 8:
            case 7:
            case 6:
                season = "Summer";
                break;
            case 5:
            case 4:
            case 3:
                season = "Spring";
                break;
            case 2:
            case 1:
                season = "Winter";
                break;
            default:
                season = "такого сезона не существует";
        }
        return season;
    }

    // Напишите программу действий кассира магазина.
    // Если у него пытаются купить алкоголь следующие 5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
    public static String sellAlcohol(int age) {
        String sale;
        switch (age) {
            case 10:
            case 17:
            case 18:
            case 20:
                sale = "не продавать";
                break;
            case 30:
                sale = "продавать";
                break;
            default:
                sale = "продаже не подлежит";
        }
        return sale;
    }
}
