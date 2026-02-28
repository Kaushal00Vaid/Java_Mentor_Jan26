import java.util.Scanner;

class Faculty{
    
   private String name;
   private double salary;
  
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
  
    // Define method getDetails()
    String getDetails() {
        return "Name: " + name + " Salary: " + salary;
    }

    
    // Overload method getDetails(float percent)
    void getDetails(float percent) {
        getDetails();
        // System.out.println("Faculty Name: " + name);
        // System.out.println("Faculty Salary: " + salary);
        System.out.println("Faculty Bonus:" + bonus(percent));
    }
    
}

class Hod extends Faculty{
    private String personalAssistant;
  
    // Constructor for Hod
    Hod(String name_, double salary_, String per) {
        super(name_, salary_);
        personalAssistant = per;
    }
    
    // Override method bonus(float percent)
    public double bonus(float percent){
       double facultyBonus = super.bonus(percent);
       return facultyBonus * 0.5;
    }

    // TestCase --> Name: <name>, salary: <salary> ..
    
    // Override method getDetails()
    String getDetails() {
        super.getDetails();
        System.out.println("Hod PersonalAssistant: " + personalAssistant);

        return super.getDetails() + "Hod Personal: " + personalAssistant;
    }

    
    
    // Override method getDetails(float percent)
    void getDetails(float percent) {
        getDetails();
        System.out.println("Hod Bonus: " + bonus(percent));
    }

}

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());

        // ClassName obj = new ClassName();

        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        obj1.getDetails(10);
        System.out.println(obj2.getDetails());
        obj2.getDetails(10);
    }
}
