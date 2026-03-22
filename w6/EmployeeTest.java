package w6;
import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int _id,String _name,double _salary){
        this.id = _id;
        this.name = _name;
        this.salary = _salary;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double _s){
        this.salary = _s;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
    
}

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> empArr = new ArrayList<Employee>();

        // add 6 employees
        empArr.add(new Employee(1,"Abc",20000));
        empArr.add(new Employee(4,"Abc",450000));
        empArr.add(new Employee(2,"Kbc",95000));
        empArr.add(new Employee(3,"KAbc",80000));
        empArr.add(new Employee(5,"Xbc",23000));

        // 1st task --> increase 10% for < 50,000
        for(Employee i : empArr) {
            if(i.getSalary() < 50000) {
                i.setSalary(i.getSalary() + (i.getSalary() * 0.1));
            }
        }


        // it shifts the index of unvisited elements

        // // remove emp with salary > 100k
        // for(Employee i : empArr) {
        //     if(i.getSalary() > 100000) {
        //         System.out.println("Hello");
        //         empArr.remove(i); // ConcurrentModificationException
        //     }
        // }

        // for(int i = 0; i < empArr.size(); i++) {
        //     if(empArr.get(i).getSalary() > 100000) {
        //         empArr.remove(i); // ConcurrentModificationException
        //     }
        // }

        // 2 options
        // !st way --> iterators --> safely removal

        Iterator<Employee> it = empArr.iterator();

        // hasNext and next
        while(it.hasNext()) {
            Employee e = it.next();
            if(e.getSalary() > 100000) {
                it.remove();
            }
        }

        // 2nd way --> trick --> iterate backwards
        for(int i = empArr.size() - 1; i >= 0; i--) {
            if(empArr.get(i).getSalary() > 100000) {
                empArr.remove(i);
            }
        }

        for(Employee i : empArr) {
            System.out.println(i);
        }
    }
}
