package OPPE;

import java.util.*;

abstract class Staff {
    private String name;
    private String duty;
    private int num;

    public Staff(String name, String duty, int num) {
        this.name = name;
        this.duty = duty;
        this.num = num;
    }

    public String getDuty() {
        return duty;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return name;
    }

    abstract String remuneration();
}

class Chef extends Staff {
    public Chef(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equals("prepareFood"))
            return getNum() * 500 + "";
        else
            return "Wrong duty assigned";
    }
}

class Waiter extends Staff {
    public Waiter(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equals("serveFood"))
            return getNum() * 200 + "";
        else
            return "Wrong duty assigned";
    }
}

public class Q2 {

    // ****** Define method printStaffRemunerations here
    public static void printStaffRemunerations(Staff[] _staff) {
        for (int i = 0; i < _staff.length; i++) {
            Staff s = _staff[i];
            System.out.println(s + " : " + s.remuneration());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] sArr = new Staff[4];
        sArr[0] = new Chef(sc.next(), sc.next(), sc.nextInt());
        sArr[1] = new Chef(sc.next(), sc.next(), sc.nextInt());
        sArr[2] = new Waiter(sc.next(), sc.next(), sc.nextInt());
        sArr[3] = new Waiter(sc.next(), sc.next(), sc.nextInt());
        printStaffRemunerations(sArr);
    }
}