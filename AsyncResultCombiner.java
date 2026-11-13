import java.util.concurrent.*;
import java.util.*;

public class AsyncResultCombiner {
    public static void main(String[] args) {
        CompletableFuture<Integer> users =
            CompletableFuture.supplyAsync(() -> 120);

        CompletableFuture<Integer> orders =
            CompletableFuture.supplyAsync(() -> 450);

        CompletableFuture<Integer> products =
            CompletableFuture.supplyAsync(() -> 80);

        List<CompletableFuture<Integer>> tasks =
            List.of(users, orders, products);

        CompletableFuture<Integer> total =
            CompletableFuture.allOf(
                tasks.toArray(new CompletableFuture[0])
            ).thenApply(v ->
                tasks.stream()
                    .map(CompletableFuture::join)
                    .mapToInt(Integer::intValue)
                    .sum()
            );

        System.out.println("Total: " + total.join());
    }
}
