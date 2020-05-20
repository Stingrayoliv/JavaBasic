package HomeworkAll;

/**
 * 21.05.2020
 * The second homework
 */
public class PrimitiveDataTypes {
    public static void main(String[] arg) {
        findSquareByte();
        findRectangleShort();
        findCubeInteger();
        findGrainsLong();
    }

    public static void findSquareByte() {
        // находим площадь и периметр квадрата
        // create variables and assign values to them
        byte a = 6;
        byte square = 6 * 6;
        byte perimeter = 6 * 4;
        System.out.println("area of a square: " + square);
        //System.out.println("area of square through function: + ");
        System.out.println("perimeter of a square: " + perimeter);
    }

    public static void findRectangleShort() {
        // находим площадь и периметр прямоугольника
        // create variables and assign values to them
        short d = 115;
        short h = 78;
        short p = (short) (2 * (d + h));
        short s = (short) (d * h);
        System.out.println("area of a rectang: " + s);
        System.out.println("perimeter of a rectang: " + p);
    }

    public static void findCubeInteger() {
        // находим площадь и периметр куба
        // create variables and assign values to them
        int x = 60;
        int VariableS = x * x * 6;
        int VariableP = 12 * x;
        System.out.println("area of a cube: " + VariableS);
        System.out.println("perimeter of a cube: " + VariableP);
    }

    public static void findGrainsLong() {
        //Найти количество зёрен на шахматной доске
        int cellFirst = 1; // количество зёрен на первой клетке;
        int cellSecond = 2; // количество зёрен на второй клетке;
        int cellThird = 2 * cellSecond; // количество зёрен на второй клетке;
        int allCells = 64; // количество клеток, степень для геометрической прогресии;
        int d = 2; // знаменатель прогрессии
        // количество зёрен на шахматной доске, или сумма челенов геометрической прогресии
        System.out.printf("the amount of grain on all chess cells: %.0f \n", Math.pow(d, allCells) - 1);
    }
}




