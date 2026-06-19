import java.util.*;
import java.util.stream.*;

public class RotateLeft {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        IntStream.range(0, list.size())
                .mapToObj(i -> list.get((i + 2) % list.size()))
                .forEach(System.out::println);
    }
}
