class Test {
    // private instance variables
    private String name;
    private String[] friends;
    private int age;

    // constructor
    Test(String name, String[] arr, int a) {
        this.name = name;
        friends = arr;
        age = a;
    }

    // getters --> advised to have getters and setters for all the private variables you have

    // getter for name
    String getName() {
        return name;
    }
    // setter for name
    void setName(String newName) {
        name = newName;
    }


    // getters and setters for age
    // getters
    int getAge() {
        return age;
    }

    // setters
    void setAge(int age_) {
        age = age_;
    }

    // getters and setters for friends
    // getter
    String[] getFriends() {
        return friends;
    }
    // setter --> 2 setters
    // 1) i want to set it with whole new array
    // 2) i just want to change value at a particular index

    // 1)
    void setFriends(String[] arr) {
        friends = arr; // whole the whole new array --> SHALLOW COPY
    }

    // 2)
    void setFriends(String frr, int idx) {
        friends[idx] = frr; // for a particular index
    }
}


public class GettersAndSetters {
    public static void main(String[] args) {

        String[] arr = new String[]{"Kaushal", "Dhruv"};

        Test obj = new Test("RandomName", arr, 20);

        obj.getName();
        obj.setName("Random Name 2");
        
    }
}
