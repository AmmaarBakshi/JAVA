import java.util.*;
import java.util.stream.*;

public class WordFrequencyIndex {
    public static void main(String[] args) {
        String text = """
            Java streams process collections.
            Java streams support filtering.
            Collections can be processed using Java.
            """;

        Map<String, Long> frequency = Arrays.stream(
                text.toLowerCase().split("\\W+")
            )
            .filter(word -> !word.isBlank())
            .collect(Collectors.groupingBy(
                word -> word,
                Collectors.counting()
            ));

        frequency.entrySet().stream()
            .sorted(
                Map.Entry.<String, Long>comparingByValue()
                    .reversed()
                    .thenComparing(Map.Entry.comparingByKey())
            )
            .forEach(System.out::println);
    }
}
