import java.util.*;
import java.util.stream.*;

public class MultiListIntersection {
    public static void main(String[] args) {
        List<List<Integer>> groups = List.of(
            List.of(1, 2, 3, 4, 5),
            List.of(2, 3, 4, 6),
            List.of(2, 3, 7, 8)
        );

        Set<Integer> common = groups.stream()
            .map(HashSet::new)
            .reduce((first, second) -> {
                first.retainAll(second);
                return first;
            })
            .orElseGet(HashSet::new);

        System.out.println(common);
    }
}
