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
    double bmi;
    boolean imatrikulation;
    char selfTotem;

    // пустой конструктор нужно первым писать
    public Person() {

    }

    public Person(double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;
        findBmiClassIndex();
    }

    public Person(String personName) {
        firstName = personName;
    }


    public void findBmiClassIndex() {
        double personWeight = weight; //m - масса
        double personHeight = height / 100;

        bmi = personWeight / (personHeight * personHeight);


    }

}