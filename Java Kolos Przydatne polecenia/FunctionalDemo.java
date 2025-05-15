import java.util.function.*;
import java.util.*;

public class FunctionalDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Predicate<String> isEmpty = s -> s.isEmpty();
        Consumer<String> printer = s -> System.out.println(s);
        Supplier<Double> random = () -> Math.random();

        List<String> names = List.of("Anna", "Jan", "Kuba");
        names.stream()
            .filter(n -> n.length() > 3)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}