package Q166;

import java.util.List;
import java.util.stream.IntStream;

public class Q166 {
    public static void main(String[] args) {
        final List<String> fruits =
                List.of("Orange", "Apple", "Lemon", "Raspberry");
        final List<String> types =
                List.of("Juice", "Pie", "Ice", "Tart");
        final var stream =
                IntStream.range(0, Math.min(fruits.size(), types.size()))
                        .mapToObj((i) -> fruits.get(i) + " " + types.get(i));
        stream.forEach(System.out::println);
    }
}


/*
            What is the result?
            A. Orange Juice
            B. The compilation fails.
            C. Orange Juice Apple Pie Lemmon Ice Raspberry Tart
            D. The program prints nothing.
            Answer: C
 */