import java.util.stream.Stream;

public class EvenFibonacciSum {
    public static void main(String[] args) {

        long sum = Stream.iterate(
                    new long[]{1, 2},
                    a -> new long[]{a[1], a[0] + a[1]}
                )
                .limit(30)
                .map(a -> a[0])
                .filter(n -> n % 2 == 0)
                .mapToLong(Long::longValue)
                .sum();

        System.out.println(sum);
    }
}
