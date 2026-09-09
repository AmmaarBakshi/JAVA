import java.util.*;
import java.util.stream.*;

record Order(
    String customer,
    int amount
) {}

public class IncreasingOrders {

    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Alex", 200),
            new Order("Alex", 400),
            new Order("Alex", 600),

            new Order("Sam", 500),
            new Order("Sam", 300),
            new Order("Sam", 700)
        );

        orders.stream()
              .collect(
                  Collectors.groupingBy(
                      Order::customer
                  )
              )
              .forEach(
                  (customer, list) -> {

                      boolean increasing =
                          IntStream.range(
                              0,
                              list.size() - 1
                          )
                          .allMatch(
                              i ->
                              list.get(i + 1)
                                  .amount()
                              >
                              list.get(i)
                                  .amount()
                          );

                      if (increasing)
                          System.out.println(customer);
                  }
              );
    }
}
