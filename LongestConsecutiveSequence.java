import java.util.*;
import java.util.stream.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(
            100, 4, 200, 1, 3, 2, 5, 6, 10
        );

        Set<Integer> set = numbers.stream()
            .collect(Collectors.toSet());

        int longest = set.stream()
            .filter(n -> n == Integer.MIN_VALUE || !set.contains(n - 1))
            .mapToInt(start -> {
                int length = 0;
                int current = start;

                while (true) {
                    if (!set.contains(current)) {
                        break;
                    }

                    length++;

                    if (current == Integer.MAX_VALUE) {
                        break;
                    }

                    current++;
                }

                return length;
            })
            .max()
            .orElse(0);

        System.out.println("Longest sequence length: " + longest);
    }
}
