package LessonSwitchCase06;

/**
 * FirstProject
 * 4/29/20 10: 59
 */
// //Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов.
//    // Базовая плата - 30€. В базовую плату входят 100 киловатт-часов.
//    // Напишите метод расчёта стоимости пользования электроэнергией.
public class Bewag {
    public static void main(String[] args) {
        double userElectrisityConsumption = 300.5;
        char euroSymbol = '€';
        System.out.println("Цена за электричество: " + euroSymbol +getMeMoneyForElectrisity(userElectrisityConsumption));
        System.out.println("Цена за электричество: " + euroSymbol +getMeMoneyForElectrisity(95));
    }

    private static double getMeMoneyForElectrisity(double userKW) {
        double moneyResult = 0.0;
        double kwPrice = 0.2;
        double basicPlate = 30.00; // Базовая плата - 30€
        int basicKW = 100;


        /* если клиент нажег электричество больше, чем на 100квб, то считаем по формуле basicPlate + kwPrice * (userKW - basicKW);
        * если клиент нажег электричество больше, чем на 100квб, то берем с него только basicPlate
        * moneyResult = basicPlate + kwPrice * (userKW - basicKW);
        * moneyResult = basicPlate;
        */

        if (userKW<= basicKW) {
           moneyResult = basicPlate;
       } else {
           moneyResult = basicPlate + kwPrice +(userKW - basicKW);
       }
       return moneyResult;
    }
}
