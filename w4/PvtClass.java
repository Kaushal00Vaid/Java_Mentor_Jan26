package w4;

interface SubClassXYZInterface {
    void func1();

    void func60();
}

class XYZ {

    private class SubClassXYZ implements SubClassXYZInterface {
        public void func1() {
            System.out.println("I am from sub pvt class");
        }

        public void func60(){};
    }

    SubClassXYZ getReference() {
        return new SubClassXYZ();
    } 

    String abc;
    int a;

    void func32() {
        System.out.println("wilkfh");
    }
}

public class PvtClass {
    public static void main(String[] args) {
        // SubClassXYZ obj = new SubClassXYZ();

        XYZ ob = new XYZ();

        SubClassXYZInterface obj2 = ob.getReference();
        obj2.func1();
    }
}
