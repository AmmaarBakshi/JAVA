import java.util.stream.*;

public class MergeSortArrays {
    public static void main(String[] args) {

        int[] a = {5, 1, 7};
        int[] b = {2, 6, 3};

        IntStream.concat(IntStream.of(a), IntStream.of(b))
                .sorted()
                .forEach(System.out::println);
    }
}
