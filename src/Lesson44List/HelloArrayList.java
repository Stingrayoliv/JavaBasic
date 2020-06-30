package Lesson44List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * FirstProject
 * 6/24/20 09: 45
 */
public class HelloArrayList {
    public static void main(String[] args) {
//        helloArray();
//        helloArrayList();
//        testMyArrayList();
//        arrayListMethods();
        arrayPrimitive();


    }

    private static void arrayPrimitive() {
        int myInt = 5;
        String s = "test";
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(myInt);
        Double myDouble;

        // Wrapper classes - прокладка между обьектами и примитивными типами данными
        // byte ->Byte
        // short ->Short
        // char -> Character
        // long ->Long
        // float ->Float
        // double ->Double
        // boolean -> Boolean

    }

    private static void arrayListMethods() {
        ArrayList<String> germanCities = new ArrayList<>();
        String b = "berlin";
        String m = "münchen";
        String d = "dresden";
        germanCities.add(b);
        germanCities.add(m);
        germanCities.add(d);
        germanCities.add("leipzig");
        germanCities.add("potsdam");
        germanCities.add("frankfurt");
        // add(ElementDateType element)
        germanCities.add("Köln");
        germanCities.add("düsseldorf");
        System.out.println(germanCities);
        //germanCities.clear(); // полностью удаляет все элементы
        System.out.println(germanCities);

        ArrayList<String> europeCities = (ArrayList<String>) germanCities.clone(); // c кастованием
        System.out.println(europeCities);

        // методы сравнивания
        boolean capitalCheck = germanCities.contains("berlin");
        System.out.println(capitalCheck);

        boolean franceCapital = germanCities.contains("paris");
        System.out.println("Paris" + franceCapital);
        germanCities.ensureCapacity(500); // резервируем память
        germanCities.get(3);

        // Проверяем не пустой ли список
        System.out.println(germanCities.isEmpty());
        ArrayList<String> netherLandsCities = new ArrayList<>();
        System.out.println(netherLandsCities.isEmpty());

        //String[] myArray = (String[]) germanCities.toArray();
        //System.out.println(myArray);
    }

    private static void testMyArrayList() {
        ArrayList<String> al = new ArrayList<>();
        int n = al.size(); // длина, размер
        al.add(0, "Юра"); // можно 2(много раз) раза добавлять элемент
        al.add(0, "Юра");
        al.add(0, "Sergej");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.set(0, "Andrej"); // перезаписываем эллемент
        String s = al.get(0); // потом вызываем
        al.add(0, "Lena");
        al.set(0, "Sergej Makarovitch");
        //al.set(5, "Sergej"); // изменение значения под индексом 5
        al.add(7, "Ваня");
        al.add("Тетя Клава"); // если хотим на последнее место , то не указывать индекс, только value
        al.remove(5); // для удаления по индексу
        al.remove("Sergej Makarovitch"); // для удаления по имени(значению)


        System.out.println(al);

    }

    private static String generateString(int n) {
        Random myRandom = new Random();
        String result = "";
        for (int i = 0; i < n; i++) {
            char c = (char) (myRandom.nextInt(25) + 60); //(max-min)+min ...(95-65)+65
            result = result + c;
        }
        return result;
    }

    private static void helloArrayList() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            String s = generateString(7);
            list.add(s);
        }
        System.out.println("Вариант №1-" + list.toString());
        System.out.println("Вариант №2-" + list);
        // через foreach
        System.out.print("Вариант №3-");
        for (String littleS : list) {
            System.out.print(littleS + " ");
        }
        System.out.println();

        System.out.print("Вариант №4-");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).toLowerCase() + " ");
        }

    }

    private static void helloArray() {
        String[] myLittleStringArray = new String[10];
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> yourList = new ArrayList<>(myList);
        ArrayList<String> berliners = new ArrayList<>(3_500_000);
    }
}
