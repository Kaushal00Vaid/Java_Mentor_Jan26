package w9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;

    Person(int id_, String name_) {
        id = id_;
        name = name_;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString() --> Person{name='<name>'}
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class PersonTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(101, "Name-1"));
        list.add(new Person(102, "Name-2"));
        list.add(new Person(103, "Name-3"));
        list.add(new Person(104, "Name-4"));

        // change to map
        Map<Integer, Person> hash = list.stream()
                .collect(
                        Collectors.toMap(
                                n -> n.getId(),
                                n -> n));

        System.out.println(hash);
    }
}
