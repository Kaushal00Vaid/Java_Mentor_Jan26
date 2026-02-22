class Employee {
    int eid;
    String ename;

    // public Employee() {
    //     eid = 0;
    //     ename = "";
    // }

    // public Employee(int a, String n) {
    //     eid = a;
    //     ename = n;
    // }

    // public Employee(Employee e) {
    //     this.eid = e.eid;
    //     this.ename = e.ename;
    // }

    public void display() {
        System.out.println("Eid: " + eid);
        System.out.println("Ename: " + ename);
    }
}

public class PA {
    // int age; // default -- when i create object

    public static void main(String[] args) {

        int eid; // 0
        String ename; // null
        String[] friends; 
        int[] ages;

        // System.out.println(eid);

        Employee e1 = new Employee();
        e1.display();

        // Employee e2 = new Employee(e1);
    }
}