package LessonSwitchCase06;

/**
 * FirstProject
 * 4/29/20 10: 14
 */
public class MonthCheck {
    public static void main(String[] args) {
        int month = 7;
        System.out.println(checkMonth(month));

    }

    private static String getStringMonth(int month) {
        String monthName = "";
        if (checkMonth(month)) {
            switch (month) {
                case 1:
                    monthName = "Январь";
                    break;
                case 2:
                    monthName = "Февраль";
                    break;
                case 3:
                    monthName = "Март";
                    break;
                case 4:
                    monthName = "Апрель";
                    break;
                case 5:
                    monthName = "Май";
                    break;
                case 6:
                    monthName = "Июнь";
                    break;
                case 7:
                    monthName = "Июль";
                    break;
                case 8:
                    monthName = "Август";
                    break;
                case 9:
                    monthName = "Сентябрь";
                    break;
                case 10:
                    monthName = "Октябрь";
                    break;
                case 11:
                    monthName = "Ноябрь";
                    break;
                case 12:
                    monthName = "Декабрь";
                    break;
                default:
                    monthName = "не существует";
                    break;
            }
        }

        return  monthName;
    }

    private static boolean checkMonth(int month) {
        boolean result = false;
        if (month > 0 && month <= 12) { // стараться сделать здесь true в булевом выражении
            result = true;
        }
        return result;
    }

}

