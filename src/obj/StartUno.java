package obj;

/**
 * FirstProject
 * 6/16/20 11: 59
 */
public class StartUno {
    public static void main(String[] args) {
        System.out.println("---------------- №0");
        System.out.println(bmiIndex(175, 100, 30, "m"));
        double h1 = 155;
        double m1 = 75;
        System.out.println("---------------- №0");
        Person studentOne = new Person();
        studentOne.firstName = "Вася";
        studentOne.weight = 80;
        studentOne.height = 180;
        studentOne.age = 30;
        studentOne.gender = "m";
        System.out.println("---------------- №1");
        System.out.println(bmiIndex(studentOne.height, studentOne.weight, studentOne.age, studentOne.gender));
        System.out.println("---------------- №1");

        Person personTwo = new Person();
        personTwo.weight = 75;
        personTwo.height = 155;
        personTwo.firstName = "Елена";
        System.out.println("---------------- №2");
        personTwo.findBmiClassIndex();
        System.out.println(personTwo.bmi);
        System.out.println(personTwo.gender);
        System.out.println(personTwo.imatrikulation);
        System.out.println(personTwo.selfTotem);
        System.out.println("---------------- №2");

        String s = "London is the capital";
        s = s.toUpperCase();

    }

    private static double bmiIndex(double height, double weight, int age, String gender) {
        height = height / 100;
        // используются
        return weight / (height * height);
    }


}
