import java.util.*;
import java.util.stream.*;

record WordStats(
    long count,
    int totalLength,
    String longest
) {}

public class WordStatistics {

    public static void main(String[] args) {

        List<String> words = List.of(
            "Java", "Streams", "Collector",
            "API", "Programming"
        );

        WordStats result = words.stream().collect(
            Collector.of(
                () -> new long[2],
                (a, word) -> {
                    a[0]++;
                    a[1] += word.length();
                },
                (a, b) -> {
                    a[0] += b[0];
                    a[1] += b[1];
                    return a;
                },
                a -> new WordStats(
                    a[0],
                    (int) a[1],
                    words.stream()
                        .max(Comparator.comparingInt(
                            String::length
                        ))
                        .orElse("")
                )
            )
        );

        System.out.println(result);
    }
}
