package obj41;
/**
 * FirstProject
 * 6/19/20 10: 19
 * Наследование
 */
public class Employee extends Person {
    private String employeeId;

    public Employee(String ln, String fn, String empId, int a) {
        super(ln, fn);// ссылка на методы в суперклассе только в первой строчке конструктора
        this.employeeId = empId;
        age = a;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String printAll() {
        return (fullName() + " " + employeeId + " " + age); // наследуем метод fullName из класса Person
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("Doe", "Jane", "1", 25);
        Employee cto = new Employee("Miller", "John", "2", 30);
        Employee e1 = new Employee("Серегин", "Сергей", "3", 25);
        Employee e2 = new Employee("Петров", "Петя", "4", 57);
        Employee e3 = new Employee("Васечкин", "Вася", "5", 30);
        Employee e4 = new Employee("Дмитриев", "Дмитрий", "6", 30);

        cto.age++;
        System.out.println(ceo.printAll());
        System.out.println(cto.printAll());

        Employee[] factory = {ceo, cto, e1, e2, e3, e4};
        System.out.println("----------------");
        System.out.println("Print factory");
        for (Employee worker : factory) {
            System.out.println(worker.printAll());
        }

        Employee[] sortFactory = bubbleSort(factory);
        System.out.println("----------------");
        System.out.println("Print factory");
        System.out.println("----------------");

        for (Employee worker : factory) {
            System.out.println(worker.printAll());


        }
    }

    private static Employee[] bubbleSort(Employee[] factory) {
        boolean unsorted = true;
        while (unsorted) {
            int count = 0;
            for (int i = 0; i < factory.length - 1; i++) {
                if (factory[i].age > factory[i + 1].age) {
                    int temp = factory[i].age;
                    factory[i].age = factory[i + 1].age;
                    factory[i + 1].age = temp;
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }

        }
        return factory;
    }
}
