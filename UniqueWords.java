import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {

        String text = "java ai java code stream ai backend";

        Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
