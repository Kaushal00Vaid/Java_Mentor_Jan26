package w9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultsStream {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 1);

        // System.out.println(stream);

        // to Double[] array
        Double[] doubleArr = stream.toArray(Double[]::new);
        for (Double i : doubleArr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // to List<Double>

        List<Double> list = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 1)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println();
        System.out.println();

        // to Set<Double>
        Set<Double> set = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 1)
                .collect(Collectors.toSet());

        System.out.println(set);

        String[] strArr = new String[] { "Hello", "worldd", "Bye Bye" };

        // {
        // 5: hello,
        // 6: worldd,
        // 7: bye bye
        // }

        Map<Integer, String> hash = Arrays.stream(strArr)
                .collect(Collectors.toMap(
                        n -> n.length(), // key
                        n -> n // value
                ));

        System.out.println(hash);

    }
}
