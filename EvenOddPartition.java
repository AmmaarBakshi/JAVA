import java.util.*;
import java.util.stream.*;

public class EvenOddPartition {
    public static void main(String[] args) {

        List<Integer> nums =
                List.of(1,2,3,4,5,6,7,8);

        Map<Boolean,List<Integer>> result =
                nums.stream()
                    .collect(
                        Collectors.partitioningBy(
                            n -> n % 2 == 0
                        )
                    );

        System.out.println(result);
    }
}
