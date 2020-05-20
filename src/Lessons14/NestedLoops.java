package Lessons14;

/**
 * FirstProject
 * 5/12/20 09: 33
 */
public class NestedLoops {
    public static void main(String[] args) {
        rectangle(5,7);


    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i <a ; i++) {

            for (int j = 0; j <b ; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
