package w6;
import java.util.*;

class Student{
    private int id;
    private String name;
    public Student(int _id,String _name){
        this.id = _id;
        this.name = _name;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    
}

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentArr = new ArrayList<>();
        studentArr.add(new Student(1,"Abc"));
        studentArr.add(new Student(2,"Kbc"));
        studentArr.add(new Student(3,"KAbc"));
        studentArr.add(new Student(4,"Abc"));
        studentArr.add(new Student(5,"Xbc"));

        Scanner sc = new Scanner(System.in);
        int _id = sc.nextInt();
        for(Student s: studentArr){
            if(s.getID()==_id){
                System.out.println("ID present");
            }
        }
        for(Student s: studentArr){
            if(s.getName().startsWith("A") || s.getName().startsWith("a")){
                System.out.println(s.getName());
            }
        }

        sc.close();
    }
}
