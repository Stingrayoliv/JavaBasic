package Lesson012;

/**
 * FirstProject
 * 5/7/20 09: 50
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 10;
        generateMT(a);
        generateBackMT(a);
    }

    // добавить 0 к однозначным числам  - дома
    public static void generateMT(int a) {
        for (int i = 1; i < a + 1; i++) {
            for (int j = 1; j < a + 1; j++) {
                System.out.print(addZero(i*j));
                System.out.print("  ");
            }
            System.out.println();
        }
    }
// созаем дополнительный метод, для добавления нулей
    public static String addZero(int value) {
        String result;
        if (value < 10) {
            result = "0" + Integer.toString(value); // день необходимо получить в String
        } else {
            result = Integer.toString(value);
        }
        return result;
    }
    public static void generateBackMT(int a) { // обратная таблица умножения
        for (int i = a; i >0 ; i--) {
            for (int j = a; j > 0; j--) {
                System.out.print("  ");
                System.out.print(addZero(i*j));
            }
            System.out.println();
        }
    }

}


        

