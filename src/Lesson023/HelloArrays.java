package Lesson023;

/**
 * FirstProject
 * 5/26/20 11: 36
 */
public class HelloArrays {
    public static void main(String[] args) {
        // dataType [] arrayName;
       int [] myVariable;
       String [] myString;
       double [] gpsPoints;
       boolean [] truthTable;
       char [] cyrillicAlphabet;

       int [] field;
       field = new int[10]; //в массиве 10 целочисленных элементов;
        String [] fourSeasons = new String[] {"Вивальди", "Чайковский", "Astor Piazzolla", "Stephen Edwin King"};
        int [] numberFibonacci = new int [] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        String [] capitalCitiesUdSSSR = new String[] {"Киев", "Минск", "Рига"};

        String [] germanCity = new String[] {"Berlin", "Dresden", "Potsdam"};
        int allGermanCity = germanCity.length;
        System.out.println(allGermanCity);

//        int allLetterInCities = 0;
//        for (int i = 0; i <germanCity.length ; i++) {
//            allGermanCities = allLetterInCities+germanCity[i].length();
//        }
//        System.out.println(allGermanCities);
//
        magicBoolean();
        oldDeclaration();
        magicArray(2020, "a", "b", "c");
    }

    public static void magicBoolean() {
//        boolean [] [] truthTable;
//        truthTable = new boolean[10];
//
//        for (int i = 0; i <truthTable.length ; i++) {
//            System.out.println(truthTable[i]);
//
//        }
//        int [] myIntArry = new
//
//

    }
    public static void magicArray(int year, String ... values) {
        // varargs - примерно значит прими массив
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }

    }

    private static void oldDeclaration() {
        int myArray [];
        String user [];
        double gpsPoints [];

    }

}
