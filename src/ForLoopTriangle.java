/**
 * FirstProject
 * 5/10/20 19: 14
 */
public class ForLoopTriangle {
    public static void main(String[] args) {
        showSquare();
        showTriangle();
        reverseTriangle();
        showPyramid();

    }


    // получаем квадрат
    public static void showSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"); // вертикальная линия
            }
            System.out.println();
        }
    }

    // получаем треугольник
    public static void showTriangle() {
        for (int i = 0; i <= 5; i++) { // если не поставить =, то треугольник будет меньше размером
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // вертикальная линия
            }
            System.out.println();
        }
    }

    // получаем равнобедренный треугольник
    public static void showPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("-");
                for (int k = 1; j < (i*2); k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // перевернутный равнобедренный треугольник
    public static void reverseTriangle() {
        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j >= i; j--) {
                System.out.print("+");
            }
            for (int k = 1; k <=i*2 ; k++) { //левый треугольник в первом квадрате
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
