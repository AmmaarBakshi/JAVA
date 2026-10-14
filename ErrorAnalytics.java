import java.util.*;
import java.util.stream.*;

record LogEntry(
    String service,
    int errorCode
) {}

public class ErrorAnalytics {

    public static void main(String[] args) {

        List<LogEntry> logs = List.of(
            new LogEntry("Auth", 500),
            new LogEntry("Auth", 404),
            new LogEntry("Auth", 500),
            new LogEntry("Payment", 400),
            new LogEntry("Payment", 500),
            new LogEntry("Payment", 500)
        );

        Map<String, Map<Integer, Long>> counts =
            logs.stream()
                .collect(Collectors.groupingBy(
                    LogEntry::service,
                    Collectors.groupingBy(
                        LogEntry::errorCode,
                        Collectors.counting()
                    )
                ));

        counts.forEach((service, frequencies) -> {
            frequencies.entrySet()
                .stream()
                .sorted(
                    Map.Entry
                        .<Integer, Long>comparingByValue()
                        .reversed()
                        .thenComparing(
                            Map.Entry::getKey
                        )
                )
                .findFirst()
                .ifPresent(error ->
                    System.out.println(
                        service + " -> " + error
                    )
                );
        });
    }
}
