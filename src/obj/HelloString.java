package obj;

/**
 * FirstProject
 * 6/17/20 09: 39
 */
public class HelloString {
    public static void main(String[] args) {
        // String pool
        String firstName1 = "Андрей";
        String firstName2 = "Андрей";
        String firstName3 = new String(("Андрей"));
        String firstName4 = new String(("Андрей"));

        System.out.println("Литералы " + (firstName1 == firstName2));
        System.out.println("Обьекты" + firstName3 == firstName4);
        System.out.println("Обьект и литерал" + firstName1 == firstName3);
        System.out.println("---------------------");
        System.out.println("Литералы " + firstName1.equals(firstName2));
        System.out.println("Обьекты " + firstName3.equals(firstName4));
        System.out.println("Обьект и литерал " + firstName1.equals(firstName3));
        System.out.println("---------------------");
    }
}
