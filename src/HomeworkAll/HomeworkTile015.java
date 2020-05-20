package HomeworkAll;

/**
 * FirstProject
 * 5/13/20 13: 38
 */
public class HomeworkTile015 {
    public static void main(String[] args) {
        double lengthWall = 4.2; //  м² длина стены
        double widthWall = 3.1; // м² высота стены

        double priceForOneHour = 27.00; // цена в час за 1 м²
        double priceForOneTile = 1.00; // цена за одну плитку с НДС

        double lengthTile = 0.3; // м² длина плитки
        double widthTile = 0.2; //  м² высота плитки

        double tax = 0.19; // значение НДС


        System.out.printf("Площадь стеныЖ %.2f\n", findArea(lengthWall, widthWall));
        System.out.println("Количество требуемых плиток: "
                + findNumberTiles(lengthWall, widthWall, lengthTile, widthTile));
        System.out.printf("Оплата труда с НДС: %.2f\n", priceForWork(priceForOneHour, lengthWall, widthWall, tax));
        System.out.printf("Оплата труда и материала с НДС: %.2f\n", showFinalPrice(
                priceForOneHour, lengthWall, widthWall, tax, priceForOneTile, lengthTile, widthTile));
    }

    // площадь стены
    public static double findArea(double length, double width) {
        return length * width;
    }

    // общее количество плиток c округлением в большую сторону
    public static double findNumberTiles(double length, double width, double lengthForTile, double widthForTile) {
        return Math.ceil(findArea(length, width) / findArea(lengthForTile, widthForTile));
    }

    // цена мастера за работу с учетом НДС. Если площадь стены целое число, то работник получит:
    // общая площадь* на цену в час c НДС, если площадь - не целое число, то получит:
    // площадь округленная в большую сторону * на цену в час с НДС.
    public static double priceForWork(double priceForOneHour, double length, double width, double tax) {
        double priceWithTax = priceForOneHour + priceForOneHour * tax;
        double result = 0.0;

        if ((findArea(length, width) % 1) == 0) { // проверка, чтобы число было целое
            result = findArea(length, width) * priceWithTax;
        } else {
            result = Math.ceil(findArea(length, width)) * priceWithTax;
        }
        return result;
    }

    // цена за всю плитку
    public static double priceForAllTiles(
            double priceTile,
            double length,
            double width,
            double lengthForTile,
            double widthForTile
    ) {
        return priceTile * findNumberTiles(length, width, lengthForTile, widthForTile);
    }

    //общая цена за работу и за материал (плитку);
    public static double showFinalPrice(
            double oneHourPrice,
            double length,
            double width,
            double tax,
            double priceTile,
            double lengthForTile,
            double widthForTile
    ) {
        return priceForWork(oneHourPrice, length, width, tax) +
                priceForAllTiles(priceTile, length, width, lengthForTile, widthForTile);
    }
}
