package LessonFor011;

/**
 * FirstProject
 * 5/6/20 11: 02
 * Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
 * <p>
 * "Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что изучили:
 */
public class ExerciseWorkDrawTrianglesFor {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        //getNumber(a, b);
        //digitsWriting(5, 17);
        //christmasTree(10);
        //christmasTreeTwo(10);
        christmasTreeThree(10);
    }

    // Даны целые числа А и B, где B>0. Вывести B раз число А.
    public static void getNumber(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void digitsWriting(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void christmasTree(int a) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + star;
            System.out.println(line);
        }
    }

    public static void christmasTreeTwo(int a) {
        String star = "*";
        String line = "";
        String lineOne = "";
        for (int i = 0; i < a; i++) {
            line = line + star;
        }
        System.out.println(line);
        lineOne = line;
        for (int i = a; i > 0; i--) {
            lineOne = lineOne.substring(0, lineOne.length() - 1);
            System.out.println(lineOne);
        }
        //System.out.println("Line one "+lineOne);
        //System.out.println("Line длина "+lineOne.length());
    }

    public static void christmasTreeThree(int side) {
        String star = "*";
        String space = " ";
        String line = "";
        String spaceLine = "";
        String starLine = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        for (int i = 0; i < side; i++) {
           spaceLine = spaceLine.substring(0, spaceLine.length() - 1);
           starLine = starLine + star;
            line = spaceLine + starLine;
            System.out.println(line);
        }

        //System.out.println(spaceLine+"");

    }
}
