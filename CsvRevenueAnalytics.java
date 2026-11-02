import java.util.*;
import java.util.stream.*;

public class CsvRevenueAnalytics {
    record Sale(String region, String product, double revenue) {}

    public static void main(String[] args) {
        List<String> csv = List.of(
            "region,product,revenue",
            "West,Laptop,80000",
            "East,Phone,30000",
            "West,Tablet,25000",
            "East,Laptop,75000",
            "North,Phone,20000"
        );

        Map<String, Double> revenueByRegion = csv.stream()
            .skip(1)
            .map(line -> line.split(","))
            .map(parts -> new Sale(
                parts[0].trim(),
                parts[1].trim(),
                Double.parseDouble(parts[2].trim())
            ))
            .collect(Collectors.groupingBy(
                Sale::region,
                TreeMap::new,
                Collectors.summingDouble(Sale::revenue)
            ));

        revenueByRegion.forEach((region, revenue) ->
            System.out.printf("%s: %.2f%n", region, revenue)
        );
    }
}
