import java.util.*;
import java.util.stream.*;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        List<Integer> nums =
            List.of(
                10,9,2,5,3,7,101,18
            );

        List<Integer> result =
            IntStream.range(
                0,
                nums.size()
            )
            .boxed()
            .map(
                i -> {

                    List<Integer> sequence =
                        nums.subList(
                            0,
                            i + 1
                        );

                    return sequence.stream()
                                   .filter(
                                       n ->
                                       n <= nums.get(i)
                                   )
                                   .toList();
                }
            )
            .max(
                Comparator.comparingInt(
                    List::size
                )
            )
            .orElse(List.of());

        System.out.println(result);
    }
}
