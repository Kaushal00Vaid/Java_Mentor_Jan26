package w9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTypesTest {

    public static double generateRandom() {
        return Math.random() * 10;
    }

    public static void main(String[] args) {
        // String name = null;
        // System.out.println(name.length());

        // CREATING OPTIONALS

        // Optional.of(arg)
        Optional<String> name = Optional.of("hello");
        System.out.println(name);

        // Optional<String> name2 = Optional.of(null); // NullPointerException

        // Optional.ofNullable(arg)
        Optional<String> nameNull_1 = Optional.ofNullable("hello");
        Optional<String> nameNull_2 = Optional.ofNullable(null);

        System.out.println(nameNull_1);
        System.out.println(nameNull_2);

        // Optional.empty()
        Optional<String> nameEmpty = Optional.empty();
        System.out.println(nameEmpty);

        // CHECKING VALUES

        // ifPresent(...) --> checking if this Optional is having a valid value or a
        // null
        Optional<Double> val = Optional.of(4.95);
        Optional<Double> valNull = Optional.ofNullable(null);
        Optional<Double> valEmpty = Optional.empty();
        // Optional<Double> valEmpty = Optional.ofNullable(null);

        // if(val != null) {
        // // do something
        // } else {
        // do something
        // }

        val.ifPresent(n -> System.out.println(n));
        valEmpty.ifPresent(n -> System.out.println(n));
        valNull.ifPresent(n -> System.out.println(n));

        val.ifPresentOrElse(
                n -> System.out.println(n),
                () -> System.out.println("It is a null value"));

        valEmpty.ifPresentOrElse(
                n -> System.out.println(n),
                () -> System.out.println("It is a null value"));

        valNull.ifPresentOrElse(
                n -> System.out.println(n),
                () -> System.out.println("It is a null value"));

        // 3 Optional Doubles --> 4.9, 3.9 and null
        // i want to add to list if non-null

        Optional<Double> val1 = Optional.ofNullable(4.9);
        Optional<Double> val2 = Optional.ofNullable(3.9);
        Optional<Double> val3 = Optional.ofNullable(null);

        List<Double> ans = new ArrayList<>();

        val1.ifPresentOrElse(
                n -> ans.add(n),
                () -> System.out.println("Null, therefore skipping"));

        val2.ifPresentOrElse(
                n -> ans.add(n),
                () -> System.out.println("Null, therefore skipping"));

        val3.ifPresentOrElse(
                n -> ans.add(n),
                () -> System.out.println("Null, therefore skipping"));

        System.out.println(ans);

        // DEFAULT VALUES

        Optional<Double> max = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 0.00001)
                .max(Double::compareTo);

        System.out.println(max);
        // max could be null --> empty

        // .orElse(defaultValue)
        Double fallBack_val1 = max.orElse(-1.0);
        System.out.println(fallBack_val1);

        // .orElseGet(Use Another function to generate a value)
        Double fallBack_val2 = max.orElseGet(() -> generateRandom());
        System.out.println(fallBack_val2);

        // .orElseThrow(Exception)
        Double fallBack_val3 = max.orElseThrow();
        System.out.println(fallBack_val3);

        try {
            Double fallBack_val4 = max.orElseThrow(Exception::new);
            System.out.println(fallBack_val4);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
