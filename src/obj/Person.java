package obj;
/**
 * FirstProject
 * 6/16/20 11: 19
 */
public class Person {
    String firstName;
    double weight;
    double height;
    int age;
    String gender;
    private double bmi;
    boolean imatrikulation;
    char selfTotem;

    // пустой конструктор нужно первым писать (конструктор без логики и параметров)
    public Person() {
        this.firstName = "just student";
    }

    public Person(double personWeight, double personHeight) {
        this.weight = personWeight;
        this.height = personHeight;
        findBmiClassIndex();
    }

    public Person(String personName, double personWeight, double personHeight) {
        this.weight = personWeight;
        this.height = personHeight;
        this.firstName = personName;
        findBmiClassIndex();
    }

    public Person(String personName) {
        firstName = personName;
    }

    public double getBmi() {
        return bmi; // тут просто вернуть, без this
    }


    public void findBmiClassIndex() {
        double personWeight = weight; //m - масса
        double personHeight = height / 100;

        bmi = personWeight / (personHeight * personHeight);
    }

    void myPrint() {
        System.out.println(firstName + " firstName" + " весит " + "weight" + "при росте " + height +
                "\n Индекс массы тела: " + bmi);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person myLittlePerson = new Person("Cидоров", 90, 190);
        System.out.println("БМИ вызванный через гетер " + myLittlePerson.getBmi());

    }


}