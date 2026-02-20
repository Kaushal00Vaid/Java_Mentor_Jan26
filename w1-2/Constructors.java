import java.util.*;

class Employee {

    // instance variables
    String name;
    int age;
    String[] departments;
    String[] collegues;

    // constructors --> the only work is to iitialise instance variables

    // constructor overloading
    public Employee(String name_, int a, String[] dep, String[] coll) {
        name = name_;
        age = a;
        collegues = coll;
        departments = dep;
    }

    public Employee() {
        name = "Kaushal";
        age = 20;
        departments = new String[]{"dep1", "dep2"};
        collegues = new String[]{"col1", "col2"};
    }

    // copy constructor
    public Employee(Employee e1) {

        // e1 ==> obj2
        // current  ==> obj3

        // obj3.name = obj2.name
        name = e1.name;
        age = e1.age;
        // departments = e1.departments; // SHALLOW COPY

        // DEEP COPY --> MANUALLY COPYING -->new memory locaition
        departments = new String[e1.departments.length];

        for(int i = 0; i < e1.departments.length; i++) {
            departments[i] = e1.departments[i];
        }

        // DEEP COPY --> MANUALLY COPYING -->new memory locaition
        collegues = new String[e1.collegues.length];

        for(int i = 0; i < e1.collegues.length; i++) {
            collegues[i] = e1.collegues[i];
        }
    }

}


public class Constructors {

    static void printDepartments(Employee e1) {

        System.out.println("Printing the departments");
        for(String i : e1.departments) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // new --> registers a new memory location
        String[] departments = new String[]{"dep3", "dep4"};

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = in.next();

        Employee obj1 = new Employee();
        Employee obj2 = new Employee(name, 25, departments); // Ankan

        Employee obj3 = new Employee(obj2);

        // System.out.println(obj1.name);
        // System.out.println(obj2.name);
        // System.out.println(obj3.name);

        // System.out.println("After changing");

        // obj3.name = "Ankan";

        // System.out.println(obj2.name);
        // System.out.println(obj3.name);

        printDepartments(obj2);
        printDepartments(obj3);

        System.out.println("if i change");

        obj2.departments[1] = "changed_department"; 

        printDepartments(obj2);
        printDepartments(obj3);


    }
}
