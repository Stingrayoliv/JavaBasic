package Lesson44List.project;
import java.util.ArrayList;
/**
 * FirstProject
 * 6/24/20 12: 24
 */
public class Pool {
    public static ArrayList listOfAlcohol() {
        ArrayList<Alcohol> listOfAlcohol = new ArrayList<>();
        Alcohol beer = new Alcohol("Bier", 4.5);
        Alcohol redWein = new Alcohol("Wein", 10.5);
        Alcohol champange = new Alcohol("Sekt", 9.0);
        Alcohol vodka = new Alcohol("Vodka", 40.0);
        Alcohol whisky = new Alcohol("Whisky", 40.0);
        Alcohol whiteWein = new Alcohol(" White Wein", 10.5);
        Alcohol absinthe = new Alcohol("absinthe", 50.0);
        Alcohol samogon = new Alcohol("Samogon", 55.0);
        Alcohol kefir = new Alcohol("Kefir", 0.05);
        Alcohol kvas = new Alcohol("Kvas", 0.01);

        Alcohol another = new Alcohol("Schnaps", 20);

        listOfAlcohol.add(beer);
        listOfAlcohol.add(redWein);
        listOfAlcohol.add(champange);
        listOfAlcohol.add(vodka);
        listOfAlcohol.add(whisky);
        listOfAlcohol.add(whiteWein);
        listOfAlcohol.add(samogon);
        listOfAlcohol.add(kefir);
        listOfAlcohol.add(kvas);
        listOfAlcohol.add(another);


        return listOfAlcohol();
    }
    public static ArrayList<Person> createPersonList() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person igor = new Person("Igor", 175, 86, Gender.MALE, 35);
        Person andrej = new Person("andrej", 160, 90, Gender.MALE, 28);
        Person gena = new Person("gena", 180, 86, Gender.MALE, 45);
        Person sveta = new Person("sveta", 175, 86, Gender.MALE, 67);
        Person ira = new Person("ira ", 175, 86, Gender.MALE, 78);

        personArrayList.add(igor);
        personArrayList.add(andrej);
        personArrayList.add(gena);
        personArrayList.add(sveta);
        personArrayList.add(0, ira);



        return personArrayList;
    }
}
