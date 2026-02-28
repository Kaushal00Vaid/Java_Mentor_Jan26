import java.util.Arrays;
import java.util.Scanner;

class SoftwareEngineer {
    
    private String name;
    private double baseSalary;
    private String[] programmingLanguages;
   
    // Standard Constructor
    public SoftwareEngineer(String name, double baseSalary, String[] programmingLanguages) {
        this.name = name;
        this.baseSalary  = baseSalary;
        this.programmingLanguages = programmingLanguages;
    }
    
    // Copy Constructor (Implement Deep Copy here)
    public SoftwareEngineer(SoftwareEngineer source) {
        name = source.name;
        baseSalary = source.baseSalary;

        programmingLanguages = new String[source.programmingLanguages.length];
        
        int idx = 0;
        for( String s : source.programmingLanguages) {
            programmingLanguages[idx++] = s;
        }
    }
    
    // Method to modify a language (Useful for testing deep copy)
    public void setLanguage(int index, String newLanguage) {
        if (index >= 0 && index < programmingLanguages.length) {
            this.programmingLanguages[index] = newLanguage;
        }
    }
   
    public double calculateAppraisal(float rating) {
        if (rating > 4.0f) {
            return baseSalary * 0.15;
        }
        return baseSalary * 0.05;
    }
   
    void getProfile() {
        System.out.println(name);
        System.out.println(baseSalary);
    }
    
    
    void getProfile(boolean language) {
        getProfile();

        if(language) {
            for(String s : programmingLanguages) {
                System.out.println(s);
            }
        }
    }
    
}

class TechLead extends SoftwareEngineer {
    private int teamSize;
   
    TechLead(String name, double baseSalary, String[] programmingLanguages, int ts) {
        super(name, baseSalary, programmingLanguages);
        teamSize = ts;
    }
    
    
    TechLead(TechLead source) {
        super(source);
        teamSize = source.teamSize;
    }  
    
    public double calculateAppraisal(float rating) {
        return super.calculateAppraisal(rating) + (teamSize * 1000);
    }
    
    
    void getProfile() {
        super.getProfile();
        System.out.println(teamSize);
    }
    
    
    void getProfile(boolean flag) {
        super.getProfile(flag);
        System.out.println(teamSize);
    }
    
}

public class CompanyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] languages = {"Java", "Python", "SQL"};
        
        // Create original engineer
        SoftwareEngineer eng1 = new SoftwareEngineer("Alice", 85000, languages);
        
        SoftwareEngineer eng2 = new SoftwareEngineer(eng1);
        
        
        eng1.setLanguage(0, "C++");
        
        
        eng1.getProfile(true);
        eng2.getProfile(true);
        
        
        // TODO: Create a TechLead object and test its overridden methods
        
        sc.close();
    }
}
