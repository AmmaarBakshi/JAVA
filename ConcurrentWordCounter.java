import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class ConcurrentWordCounter {
    public static void main(String[] args) {
        List<String> words = List.of(
            "java", "rust", "java", "python",
            "rust", "java", "go", "python",
            "java", "rust", "go"
        );

        ConcurrentMap<String, Long> frequency =
            words.parallelStream()
                .collect(Collectors.groupingByConcurrent(
                    Function.identity(),
                    Collectors.counting()
                ));

        frequency.forEach((word, count) ->
            System.out.println(word + " = " + count)
        );
    }
}
