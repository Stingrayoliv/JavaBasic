package LessonFor011;

/**
 * FirstProject
 * 5/7/20 18: 30
 */
public class TrainingsFor {
    public static void main(String[] args) {
        showFigure();

        // таким образом получаем вертикальную из звезд
        for (int i = 0; i < 6; i++) {
            //System.out.println("*"); // это вертикальная
            // делаем цикл в цикле, или таблицу
            for (int j = 0; j < i; j++) { // это горизонт
                //System.out.print("*");
            }
        }
    }
    public static void showFigure() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.print("*");
            }
            //System.out.println();
        }

    }
}

