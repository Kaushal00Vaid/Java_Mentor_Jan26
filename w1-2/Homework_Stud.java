class Student {

    // instance variables
    private String name;
    private int age;
    private int roll;
    private double[] marks;

    // Constructor 
    Student(String name, int age, int roll, double[] marks) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.marks = marks;
    }

    Student(Student s) {
        name = s.name;
        roll = s.roll;
        age = s.age;
        // marks = s.marks; // SHALLOW COPY

        // DEEP COPY
        marks = new double[s.marks.length];
        for(int i = 0; i < marks.length; i++) {
            marks[i] = s.marks[i];
        }
    }

    // getters
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    int getRoll() {
        return roll;
    }

    double[] getMarks() {
        return marks;
    }

    // setters
    void setName(String n) {
        name = n;
    }

    // age
    void setAge(int a) {
        age = a;
    }

    void setRoll(int a) {
        roll = a;
    }


}

public class Homework_Stud {
    public static void main(String[] args) {
        double[] marks = {34.5, 67.5, 89.7};
        Student obj = new Student("Kaushal", 20, 3, marks);

        System.out.println(obj.getName());

        obj.setName("Ankan");

        System.out.println(obj.getName());

    }
}