package obj;
import java.util.Date;
/**
 * FirstProject
 * 6/18/20 11: 21
 */
public class Cat {
    double price = 100;
    private String name;
    private String breed; // порода
    private Date birthDate;
    private String color;
    private boolean passport;
    private double weight;
    private double height; // длина
    private int chipNumber;
    private Address address;

    Cat() {
        setName("Пушистик"); // по умолчанию сделать имя
    }

    private Date getBirthDate() {
        return birthDate;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String  color){
        this.color = color;
    }

    public String getName() { // get возвращает имя /не принимает параметров
        return name;
    }

    public void setName(String name) { // set меняет имя
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    private String getBreed(String breed) {
        return breed;
    }
    private void setBreed(String breed){
        this.breed = breed;
    }


}
class CatTest{
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Тигр");
        System.out.println(cat.getName());
        cat.setPrice(200);
        cat.setColor("White");
        System.out.println(cat.getColor());
    }
}

class Address {
    String city;
    String street;
    int houseNumber;
    int zip; // индекс

    Address(int zip,  String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.zip = zip;
        this. houseNumber = houseNumber;
    }

}
