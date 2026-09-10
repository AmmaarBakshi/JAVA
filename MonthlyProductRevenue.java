import java.util.*;
import java.util.stream.*;

record Sale(
    String month,
    String product,
    int revenue
) {}

public class MonthlyProductRevenue {

    public static void main(String[] args) {

        List<Sale> sales =
            List.of(
                new Sale("Jan", "Laptop", 5000),
                new Sale("Jan", "Phone", 7000),
                new Sale("Jan", "Laptop", 3000),

                new Sale("Feb", "Laptop", 9000),
                new Sale("Feb", "Phone", 4000)
            );

        sales.stream()
             .collect(
                 Collectors.groupingBy(
                     Sale::month,
                     Collectors.groupingBy(
                         Sale::product,
                         Collectors.summingInt(
                             Sale::revenue
                         )
                     )
                 )
             )
             .forEach(
                 (month, products) ->

                     products.entrySet()
                             .stream()
                             .max(
                                 Map.Entry
                                 .comparingByValue()
                             )
                             .ifPresent(
                                 best ->
                                 System.out.println(
                                     month
                                     + " -> "
                                     + best
                                 )
                             )
             );
    }
}
