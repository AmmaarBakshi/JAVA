import java.util.List;

public class ReverseNumbers {
    public static void main(String[] args) {

        List<Integer> nums = List.of(123, 456, 789);

        nums.stream()
                .map(n -> Integer.parseInt(
                        new StringBuilder(String.valueOf(n))
                                .reverse()
                                .toString()))
                .forEach(System.out::println);
    }
}
