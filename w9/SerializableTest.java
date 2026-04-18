package w9;

import java.io.*;

// 1. Class must implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended best practice

    int id;
    String name;

    // transient keyword prevents a field from being serialized
    transient String password;

    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // secret123 --> weksufgouienfionwuidfh7y389454u3iu489sabjckb
    // encoding decondding --> SHA256, SHA32
}

public class SerializableTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "secret123");
        String filename = "student.ser";

        // SERIALIZATION (Writing Object)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(s1);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DESERIALIZATION (Reading Object)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) in.readObject();

            System.out.println("\nObject has been deserialized.");
            System.out.println("ID: " + deserializedStudent.id);
            System.out.println("Name: " + deserializedStudent.name);
            // Password will be null because it was marked 'transient'
            System.out.println("Password: " + deserializedStudent.password);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
