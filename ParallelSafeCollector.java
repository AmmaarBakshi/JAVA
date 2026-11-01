import java.util.*;
import java.util.stream.*;

public class ParallelSafeCollector {
    static class AverageAccumulator {
        long count;
        long sum;

        void add(long value) {
            count++;
            sum += value;
        }

        AverageAccumulator combine(AverageAccumulator other) {
            count += other.count;
            sum += other.sum;
            return this;
        }

        double average() {
            return count == 0 ? 0.0 : (double) sum / count;
        }
    }

    public static void main(String[] args) {
        List<Long> numbers = LongStream.rangeClosed(1, 1_000_000)
            .boxed()
            .toList();

        AverageAccumulator result = numbers.parallelStream().collect(
            AverageAccumulator::new,
            AverageAccumulator::add,
            AverageAccumulator::combine
        );

        System.out.println("Count: " + result.count);
        System.out.println("Sum: " + result.sum);
        System.out.println("Average: " + result.average());
    }
}
