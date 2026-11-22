import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class DuplicateTransactionDetector {
    record Transaction(String id, double amount) {}

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
            new Transaction("TX101", 500),
            new Transaction("TX102", 700),
            new Transaction("TX101", 500),
            new Transaction("TX103", 900),
            new Transaction("TX102", 700),
            new Transaction("TX101", 500)
        );

        Map<String, Long> counts = transactions.stream()
            .collect(Collectors.groupingBy(
                Transaction::id,
                TreeMap::new,
                Collectors.counting()
            ));

        Map<String, Long> duplicates = counts.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));

        duplicates.forEach((id, count) ->
            System.out.println(id + " appears " + count + " times")
        );
    }
}
