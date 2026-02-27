package w3;

class Person {
    String name;
    int age;
    private int var1;

    Person() {
        name = "Default Name";
        age = 30;
    }

    Person(String name_, int age_) {
        name = name_;
        age = age_;
    }

    // getter
    int getVar1() {
        return var1;
    }

    // setter
    void setVar1(int a) {
        var1 = a;
    }

    public void printDetails() {
        System.out.println("Name is: " + this.name + "; Age is: " + this.age);
    }

}

class Employee extends Person {
    String pan;
    int salary;

    Employee() {
        // super();
        pan = "iwhio287";
        salary = 5000;
    }

    Employee(String name, int age, String pan_, int salary_) {
        super(name, age); // manually i am calling Parent constructor
        pan = pan_;
        salary = salary_;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String[] team;

    Manager(String name, int age, String pan_, int salary_, String[] team) {
        super(name, age, pan_, salary_);
        this.team = team; // SHALLOW COPY
    }

    void printTeam() {
        for(String i : team) {
            System.out.println(i);
        }
    }
    
}

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kaushal", 19, "PSVN4862", 20000);

        Employee emp2 = new Employee();

        String[] team = {"Emp1", "Emp3"};

        Manager mg1 = new Manager("Manager", 30, "wusfhioh896", 50000, team);

        System.out.println(mg1.getVar1());
        mg1.printDetails();

        mg1.printTeam();
    }
}
