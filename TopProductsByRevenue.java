import java.util.*;
import java.util.stream.*;

record Sale(String product, int price, int quantity) {}

public class TopProductsByRevenue {

    public static void main(String[] args) {

        List<Sale> sales = List.of(
            new Sale("Laptop", 70000, 2),
            new Sale("Phone", 30000, 5),
            new Sale("Laptop", 70000, 1),
            new Sale("Monitor", 15000, 8),
            new Sale("Phone", 30000, 3)
        );

        sales.stream()
            .collect(Collectors.groupingBy(
                Sale::product,
                Collectors.summingLong(
                    s -> (long) s.price() * s.quantity()
                )
            ))
            .entrySet()
            .stream()
            .sorted(
                Map.Entry.<String, Long>
                    <escape>comparingByValue()</escape>
                    .reversed()
            )
            .limit(3)
            .forEach(System.out::println);
    }
}
