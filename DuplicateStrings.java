import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrings {

    public static void main(String[] args) {

        List<String> list =
                List.of("java","ai","java","python","ai");

        list.stream()
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() > 1)
            .forEach(System.out::println);
    }
}
