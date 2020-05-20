package LessonFor011;

/**
 * FirstProject
 * 5/6/20 19: 45
 */
public class FiguresFor {
    public static void main(String[] args) {
        //digitsWriting(5,17);
        //christmasTree(5);
        //christmasTreeTwo(10);
        //christmasTreeThree(10);
        christmasTreeFour(10);
        christmasFive(10);
    }

    // Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
    public static void digitsWriting(int a, int b) {
        for (int i = a; i <= 17; i++) {
            System.out.println(i);
        }
    }

    //"Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что изучили:
    public static void christmasTree(int a) {
        String line = "";
        String star = "*";
        for (int i = 0; i < a; i++) {
            line = line + star;
            System.out.println(line);
        }
    }

    public static void christmasTreeTwo(int a) {
        String line = "";
        String star = "*";
        for (int i = 0; i < a; i++) {
            line = line + star;
        }
        System.out.println(line); // выносим за область for, чтобы просто получить основу перевернутого треугольника

        for (int i = a; i > 0; i--) { // для даннного цикла
            line = line.substring(0, line.length() - 1);// это линия пробелов
            // c помощью substring отрезаем по значению каждый раз,
            System.out.println(line);
        }
    }

    public static void christmasTreeThree(int side) {
        String star = "*";
        String space = " ";
        String line = "";
        String spaceLine = "";
        String starLine = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;//
        }
        //System.out.println(spaceLine);// получаем основание треугольника, для проверки

        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1); // это с первой задачи
            starLine = starLine + star; // это со второй задачи
            line = spaceLine + starLine; // основное решение
            System.out.println(line);
        }
    }

    public static void christmasTreeFour(int side) {
        String star = "*";
        String space = " ";
        String plus = "+";
        String line = "";
        String spaceLine = "";
        String starLine = "";
        String plusLine = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        //System.out.println(spaceLine);// получаем основание треугольника, для проверки
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1); // это с первой задачи
            starLine = starLine + star; // это со второй задачи
            plusLine = plusLine + plus;
            line = spaceLine + starLine + plusLine; // основное решение

            System.out.println(line);
        }
    }

    public static void christmasFive(int side) { // строим перевернутый треугольник из пробелов
        String line = "";
        String lineCommon = "";
        String space = " ";
        String star = "*";
        String plus = "+";
        String starLine = "";
        String spaceLine = "";
        String plusLine = "";
        for (int i = 0; i < side; i++) {
            starLine = starLine + star;
            plusLine = plusLine + plus;
            lineCommon = starLine + plusLine;
            //System.out.print(lineCommon);
        }
        //System.out.print(lineCommon); // основа треугольника из звезд

        for (int i = 0; i < side; i++) { // для даннного цикла
            spaceLine = spaceLine + space;
            starLine = starLine.substring(0, starLine.length() - 1);
            plusLine = plusLine.substring(0, plusLine.length() - 1);
            line = spaceLine + starLine+plusLine;
            System.out.println(line);
        }

    }
}



