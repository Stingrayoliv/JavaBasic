package LessonSwitchCase06;

/**
 * FirstProject
 * 4/28/20 10: 35
 */
public class VeryAngryExersice {
    public static void main(String[] args) {
       System.out.println(numberOne(9, 10));
    }

    public static boolean numberOne(int a, int b) {
        // сравнение двух чисел
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }


    public static void numberTwo() {
        // 4 геометрические фигуры;
        // надо найти их площадь
        // сумму этих площадей
        int sphereDiameter = 58;
        final double PI = 3.14;
//        int AreaSpheres = Math.pow(sphereDiameter/2, 2) * 4* PI;

        int sideСube = 40;
        int AreaCube = (int) (Math.pow(sideСube, 2) * 6);

        int pyramidOne = 20;
        int pyramidSides = 30;
        //int ArePyramid;

        int boxOne = 80;
        int boxTwo = 30;
        int boxThree = 20;
    }
}
