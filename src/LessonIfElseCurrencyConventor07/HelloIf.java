package LessonIfElseCurrencyConventor07;

/**
 * FirstProject
 * 4/29/20 11: 54
 */
public class HelloIf {
    public static void main(String[] args) {

        boolean permition = false;
        vacation(permition);

        double speed = 5.0;
        spaceShutle(speed);
    }

    private static void spaceShutle(double speed) {
        final double SUPERCONSTANT_G = 9.8;
        if (speed < SUPERCONSTANT_G) {
            System.out.println("Первоначальное ускорение недостаточно");
            System.out.println("Выпустить не может стартовать");
            System.out.println("Подготовить аварийные службы");
        } else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить релив об успешном запуске");
            System.out.println("Представить всех программистов к государственным наградам");
        }
    }

    private static void vacation(boolean permition) {
        if (permition) { // для сравнения нужно два ==
            System.out.println("Я поеду в летний лагерь");
        } else {
            System.out.println("Я останусь на все лето дома и буду плакать на техно!");
        }
    }

}
