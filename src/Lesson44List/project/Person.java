package Lesson44List.project;
import java.util.Date;

/**
 * FirstProject
 * 6/24/20 12: 38
 */
public class Person {
    private String firstName;
    private int height; //см
    private double weight; //кг
    //private Date birthDayDay;
    private int age;
    public Gender gender;

    public Person(String игорь, int i) {
    }

    public Person(String firstName, int height, double weight, Gender gender, int age) {
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //class PersonTest{
//    public static void main(String[] args) {
//        Person p1 = new Person();
//         p1.gender= Gender.FEMALE;
//
//
//    }
}
