import java.util.*;
import java.util.stream.*;

record Transaction(
    String user,
    double amount
) {}

public class TransactionAnomaly {

    public static void main(String[] args) {

        List<Transaction> transactions =
            List.of(
                new Transaction("Alex", 100),
                new Transaction("Alex", 150),
                new Transaction("Alex", 120),
                new Transaction("Alex", 5000),
                new Transaction("Sam", 200),
                new Transaction("Sam", 250)
            );

        double average =
            transactions.stream()
                        .mapToDouble(
                            Transaction::amount
                        )
                        .average()
                        .orElse(0);

        transactions.stream()
                    .filter(
                        t ->
                        t.amount() >
                        average * 3
                    )
                    .forEach(
                        System.out::println
                    );
    }
}
