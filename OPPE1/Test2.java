package OPPE1;

import java.util.*;

class Customer {
    String name;
    String[] items;

    // ***** Define required constructor(s) here

    public void setName(String n) {
        name = n;
    }

    public void setItem(int index, String itm) {
        items[index] = itm;
    }

    public String getName() {
        return name;
    }

    public String getItem(int indx) {
        return items[indx];
    }
}

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] itms = { "Eggs", "Noodles", "Bread" };
        Customer c1 = new Customer("c1", itms);
        Customer c2 = new Customer(c1);
        c2.setName(sc.next());
        c2.setItem(1, sc.next());
        System.out.println(c1.getName() + ": " + c1.getItem(1));
        System.out.println(c2.getName() + ": " + c2.getItem(1));
    }
}