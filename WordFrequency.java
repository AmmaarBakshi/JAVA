import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "java java streams are fun streams";

        Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .forEach(System.out::println);
    }
}
