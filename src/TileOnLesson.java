import com.sun.tools.hat.internal.model.JavaLong;

/**
 * FirstProject
 * 5/14/20 09: 45
 */
public class TileOnLesson {

    static double speed = 1.5;
    static double oneHourPayment = 27;
    static double highTile = 30;
    static double widthTile = 10;

    static double roomPayment = 0;
    static double workHourPayment = 0;
    static double roomTileMateCost = 0;
    static int tileCountMinInt = 0;
    static int tileCountMinAll = 0;
    static int tileMintBroken = 0;
    static int tileCountMax = 0;
    static int tileCountMaxInt = 0;
    static int tileCountMaxAll = 0;
    static int tileCountMaxBroken = 0;

    public static void customerInfo(double h, double w, double tilePriceUnit) {
        h *= 100; // в сантиметры приводим
        w *= 100;

        tileCountMinInt = countTile(h, w);
        tileMintBroken = countBrokenTile(h, w);
        tileCountMinAll = tileCountMinInt + tileMintBroken;

        tileCountMaxInt = countTile(w, h);
        tileCountMaxBroken = countBrokenTile(w, h);
        tileCountMaxAll = tileCountMaxInt + tileCountMaxBroken;
        roomTileMateCost = findMaterialCost(h, w, tilePriceUnit);

        countTile(h, w);
        countBrokenTile(h, w);

        workHourPayment = oneHourPayment * h * w/(100000*speed);
        roomPayment = (workHourPayment + roomTileMateCost)*1.19;
        System.out.println("Итоговая стоимость укладки плитки в комнате" + roomPayment);
        System.out.println("Стоимость рабочего времени" + workHourPayment);
        System.out.println("Стоимость материала" + roomTileMateCost);
        System.out.println(
                "При раскладке вдоль понадобиться целых плиток: " + tileCountMinAll
                        + "из них поломанных: " + tileCountMinAll
                        + "из них поломанных: " + tileCountMinAll);
        System.out.println(
                "При раскладке ПОПЕРЁК понадобится целых плиток: " + tileCountMaxAll
                        + " из них поломанных: " + tileCountMaxBroken
                        + " из них целых: " + tileCountMaxInt);
        System.out.println("ориентировочное количество плиток от" + tileCountMinAll + "и до" + tileCountMax);

    }

    private static int countTile(double h, double w) {
        int aLong = 0; // вдоль комнаты
        int aCross = 0; // поперек комнаты


        aCross = (int) (w / widthTile);
        aLong = (int) (h / widthTile);
        //System.out.println("промежуточное значение ЦЕЛЫХ плиток: " + aCross);
        //System.out.println("промежуточное значение ЦЕЛЫХ плиток: " + aLong);
        return aCross * aLong;
    }

    private static int countBrokenTile(double h, double w) {
        int aLong = 0; // вдоль комнаты
        int aCross = 0; // поперек комнаты

        aCross = (int) (Math.ceil(w / widthTile)); // округление в большую сторону
        aLong = (int) (Math.ceil(h / highTile));
        System.out.println("Округлённое значение всех плиток " + aCross * aLong);

        return aCross * aLong - countTile(h, w);
    }

    private static double findMaterialCost(double h, double w, double money) {
        // узнать, что дороже вдоль, или поперек
        int a, b;
        a = countTile(h, w) + countBrokenTile(h, w);
        b = countTile(w, h) + countBrokenTile(w, h);
        if (a > b) {
            roomTileMateCost = a * money;
        } else {
            roomTileMateCost = b * money;
        }
        return roomTileMateCost;

    }


}


