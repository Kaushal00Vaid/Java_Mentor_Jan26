package w5;

class Pair<X extends Number, Y extends Number> {
	private X axis1;
	private Y axis2;
	Pair(X _X, Y _Y) {
		this.axis1 = _X;
		this.axis2 = _Y;
	}
	public X getAxis1() {
		return this.axis1;
	}
	public Y getAxis2() {
		return this.axis2;
	}

    // prevent data loss --> 20 + 20.5 --> 40 instead of 40.5
    public double sum() {
        return axis1.doubleValue() + axis2.doubleValue();
    }
}

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, Float> p1 = new Pair<>(20, 45.5f);

        Pair<Integer, Double> p2 = new Pair<>(20, 3.0);

        // ERROR --> BOUNDED TO NUMBER
        Pair<String, Integer> p3 = new Pair<>("Hellow", 20);


        // Number class
        // Integer x = 4;

        // // +, -, *, /, % --> only allowed for primitive datatypes

        // Float y = x.floatValue() + 4.0f;

        System.out.println(p2.sum());

    }
}
