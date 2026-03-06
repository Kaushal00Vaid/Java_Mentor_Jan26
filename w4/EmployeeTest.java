package w4;

abstract class Employee {
    String name;

    Employee(String name_) {
        name = name_;
    }

    // abstract method --> implementation varies
    abstract double calculateSalary();

    // concrete method --> implementation remains the same
    void showName() {
        System.out.println("My name is " + name);
    }
}

class Manager extends Employee {
    double baseSalary;

    Manager(String name_, double salary_) {
        super(name_);
        baseSalary = salary_;
    }

    double calculateSalary() {
        return 1.5 * baseSalary;
    }

    void showName() {

    }
}

class Intern extends Employee {
    double baseSalary;

    Intern(String name_, double salary_) {
        super(name_);
        baseSalary = salary_;
    }

    double calculateSalary() {
        return 0.5 * baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    double baseSalary;

    FullTimeEmployee(String name_, double salary_) {
        super(name_);
        baseSalary = salary_;
    }

    double calculateSalary() {
        return 1.0 * baseSalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emp = {
            new Manager("Manager", 50000),
            new Intern("Intern", 50000),
            new FullTimeEmployee("FTEmp", 50000)
        };

        for(Employee i : emp) {
            i.showName();
            System.out.println(i.calculateSalary());

            System.out.println();
        }
    }
}
