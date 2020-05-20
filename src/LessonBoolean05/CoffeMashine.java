package LessonBoolean05;

/** Урок №6
 * FirstProject
 * 4/27/20 14: 09
 */
public class CoffeMashine {
    public static void main(String[] args) {
        //latte();
        //cappucino();
        //americano();
        int choose =1;
        myChoose(choose);
    }

    public static void myChoose(int choose) {
        switch (choose) {
            case 3:
                latte();
                break;
            case 2:
                americano();
                break;
            case 1:
                cappucino();
                break;
            default:
                americano();
        }
    }
    public static void cappucino() {
        System.out.println("---");
        System.out.println("We are create americano for you master");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("---");
    }

    public static void latte() {
        System.out.println("---");
        System.out.println("We are create americano for you master");
        milk(40);
        coffee(30);
        water(70);
        System.out.println("---");
    }

    public static void americano() {
        System.out.println("---");
        System.out.println("We are create americano for you master");
        milk(0);
        coffee(40);
        water(10);
        System.out.println("---");
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml); // %d мы передадим значение воды
    }
    public static void milk(int ml){
        System.out.printf("Added %d ml of milk\n", ml);
    }
    public static void coffee(int ml) {
        System.out.printf("Added %d ml of coffe\n", ml);
    }

}
