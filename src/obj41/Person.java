package obj41;

/**
 * FirstProject
 * 6/19/20 10: 05
 */
public class Person {
    private String name;
    private String firstName;
    public int age; // раз public, то можем менять возраст


    public Person(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }
    public Person() {
        this("Doe", "John");
    }
    public Person(String ln, String fn, int ag) {
        this.name = ln;
        this.firstName = fn;
        this.age = ag;
    }
    public void setName(String ln, String fn) {
        name = ln;
        firstName = fn;
    }
    public String getFirstName() { // классический getter по конвенции
        return firstName;
    }

    public String fullName() { // getter без слова get тоже может быть
        return (name + " "+firstName);
    }


}
