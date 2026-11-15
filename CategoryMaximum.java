import java.util.*;
import java.util.stream.*;

public class CategoryMaximum {
    record Product(String name, String category, double price) {}

    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", "Electronics", 80000),
            new Product("Phone", "Electronics", 50000),
            new Product("Chair", "Furniture", 7000),
            new Product("Desk", "Furniture", 15000),
            new Product("Sofa", "Furniture", 45000)
        );

        Map<String, Optional<Product>> expensive = products.stream()
            .collect(Collectors.groupingBy(
                Product::category,
                Collectors.maxBy(
                    Comparator.comparingDouble(Product::price)
                )
            ));

        expensive.forEach((category, product) ->
            product.ifPresent(p ->
                System.out.println(category + ": " + p)
            )
        );
    }
}
