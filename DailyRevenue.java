import java.time.*;
import java.util.*;
import java.util.stream.*;

record Sale(
    LocalDate date,
    double amount
) {}

public class DailyRevenue {

    public static void main(String[] args) {

        List<Sale> sales =
            List.of(
                new Sale(
                    LocalDate.of(2026,9,1),
                    500
                ),
                new Sale(
                    LocalDate.of(2026,9,1),
                    700
                ),
                new Sale(
                    LocalDate.of(2026,9,2),
                    900
                ),
                new Sale(
                    LocalDate.of(2026,9,2),
                    300
                )
            );

        Map<LocalDate,Double> result =
            sales.stream()
                 .collect(
                     Collectors.groupingBy(
                         Sale::date,
                         TreeMap::new,
                         Collectors.summingDouble(
                             Sale::amount
                         )
                     )
                 );

        result.forEach(
            (date,revenue) ->
            System.out.println(
                date + " -> ₹" + revenue
            )
        );
    }
}
