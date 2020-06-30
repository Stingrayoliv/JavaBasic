package Lesson44List.project;
/**
 * FirstProject
 * 26.06.20 11: 19
 */
public class Main {
    public static void main(String[] args) {
        Person igor = new Person("Igor", 175, 80, Gender.MALE, 35);
        Alcohol beer = new Alcohol("Bier", 5, 500);

        System.out.println("BAKformelWatson" + BAKformeWatson(igor, beer));
    }

    public static double BAKformeWatson(Person person, Alcohol drink) {
        double height = person.getHeight();
        System.out.println("person.getHeight()" + person.getHeight());
        double weight = person.getWeight();
        System.out.println("person.getWeight()" + person.getWeight());
        double age = person.getAge();
        System.out.println("age " + age);
        double qkwMan = 2.447 - 0.09516 * age + 0.1074 * height + 0.03362 * weight;
        System.out.println("qkwMan " + qkwMan);
        double qkwFrau = -2.097 + 0.1069 * height + 0.2466 * weight;
        double gkwFrauModify = 0.203 - 0.07 * age + 0.1069 * height * 0.2466 * weight;

        double r = 1.055 * qkwMan / (0.8 * weight);

        double alcoholInGram = drink.findAlcoholInGram();
        System.out.println("alcoholInGram" + alcoholInGram);
        return alcoholInGram / (weight * r);

    }

}

