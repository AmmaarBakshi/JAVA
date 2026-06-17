// TopFrequentNumbers.java
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopFrequentNumbers {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,2,3,3,3,4,4,5,5,5,5);

        nums.stream()
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}
