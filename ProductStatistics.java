import java.util.*;
import java.util.stream.*;

public class ProductStatistics {
    static class Stats {
        long count;
        double sum;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        void add(double value) {
            count++;
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        Stats combine(Stats other) {
            count += other.count;
            sum += other.sum;
            min = Math.min(min, other.min);
            max = Math.max(max, other.max);
            return this;
        }
    }

    public static void main(String[] args) {
        List<Double> prices = List.of(120.0, 450.0, 80.0, 300.0);

        Stats stats = prices.stream().collect(
            Stats::new,
            Stats::add,
            Stats::combine
        );

        System.out.println("Count: " + stats.count);
        System.out.println("Sum: " + stats.sum);
        System.out.println("Min: " + stats.min);
        System.out.println("Max: " + stats.max);
        System.out.println("Average: " + stats.sum / stats.count);
    }
}
