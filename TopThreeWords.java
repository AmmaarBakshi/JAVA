import java.util.*;
import java.util.stream.*;

public class TopThreeWords {
    public static void main(String[] args) {
        List<String> words = List.of(
            "java", "python", "java",
            "rust", "python", "java",
            "rust", "java", "go",
            "python", "rust"
        );

        List<Map.Entry<String, Long>> topThree = words.stream()
            .collect(Collectors.groupingBy(
                word -> word,
                Collectors.counting()
            ))
            .entrySet()
            .stream()
            .sorted(
                Map.Entry.<String, Long>comparingByValue()
                    .reversed()
                    .thenComparing(Map.Entry.comparingByKey())
            )
            .limit(3)
            .toList();

        topThree.forEach(System.out::println);
    }
}
