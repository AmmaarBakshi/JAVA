import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModeFinder {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 2, 4, 3, 2, 4, 1);

        int mode = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(mode);
    }
}
