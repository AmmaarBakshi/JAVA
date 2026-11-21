import java.util.*;
import java.util.stream.*;

public class StreamMedian {
    public static void main(String[] args) {
        List<Integer> values = List.of(
            10, 20, 30, 40, 50, 60
        );

        List<Integer> sorted = values.stream()
            .sorted()
            .toList();

        int n = sorted.size();

        double median = n == 0 ? Double.NaN :
            n % 2 == 1
                ? sorted.get(n / 2)
                : ((long) sorted.get(n / 2 - 1)
                    + sorted.get(n / 2)) / 2.0;

        System.out.println("Median: " + median);
    }
}
