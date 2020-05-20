package LessonSwitchCase06;

/**
 * FirstProject
 * 4/28/20 11: 27
 */
// В подвале школы были найдены:
//точная копия спутника земли ПС-1. Диаметр сферы 58см.
//жестяной куб со стороной 40см.
//правильная четырёхугольная пирамида "Хеопса" со стороной основания 20см и боковыми рёбрами 30см
//и чёрный ящик с размерами 80см30см20см Всё было в достаточно запущенном состоянии и новая учительница решила всё
// покрасить в красный цвет. Сколько денег на покраску нужно потратить если на один квадратный метр надо 60мл краски,
// а балончик с аэрозольной краской 400мл стоит 7€.

public class GeometryPaint {
    public static void main(String[] args) {
        double side = 0.4; // в метрах
        double diameter = 0.58; // в метрах
        double base = 0.2; //
        double sidePyramid = 0.3;
        double boxL = 0.8;
        double boxW = 0.2;
        double boxH = 0.3;
        double consumption = 0.06; // литры
        double priceBalon = 7.00; // евро за балончик
        double volumeBalon = 0.4;

        double aCube = areaCube(side);
        double aSputnik = areaSputnik(diameter);
        double aPyramid = areaPyramid(base, sidePyramid);
        double aBox = areaBox(boxL, boxH, boxW);
        double aSum = sumAreas(aCube, aPyramid, aBox, aSputnik);
        double paintFlow = paintFlowCalculation(aSum, consumption);
        double literPrice = paymentForLiter(priceBalon, volumeBalon);
        double itogo = amount(literPrice, aSum);
        double contBalon = paintFlow /volumeBalon;

        System.out.println(aCube);
        System.out.println(aSputnik);
        System.out.println(aPyramid);
        System.out.println(aBox);
        System.out.println("Количество балонов: ");


        System.out.println("Директору нужно выдать столько денег на покраску: + itogo" + "евро");

    }

    public static double areaCube(double side) {
        double areaCube = Math.pow(side, 2) * 6;
        return areaCube;
    }

    public static double areaSputnik(double diameter) {
        final double PI = 3.14;
        return Math.pow(diameter / 2, 2) * 4 * PI;
    }

    public static double areaPyramid(double base, double side) {
        double hight = Math.sqrt(side * side - base * base / 4);
        double areaTriangle = 1 / 2 * base * hight;
        double areaBasePyramid = Math.pow(base, 2);
        return areaBasePyramid + 4 * areaTriangle;
    }

    public static double areaBox(double w, double h, double l) {
        return 2 * (w * h + h * l + l * w);
    }

    public static double sumAreas(double sputnik, double pyramid, double cube, double box) {
        double sumAreas = sputnik + pyramid + cube + box;
        return sumAreas;
    }

    public static double paintFlowCalculation(double square, double consumptionOfPayment) {
        // принимаем метры и литры
        return square * consumptionOfPayment;
    }

    public static double paymentForLiter(double priceBalon, double volumeBalon) {
        double priceForLiter = priceBalon / volumeBalon;
        return priceForLiter;
    }

    public static double amount(double sumAreas, double priceForLiter) {
        double amountOfPaint = sumAreas * priceForLiter; // стоимость краски
        return amountOfPaint;



    }
}
