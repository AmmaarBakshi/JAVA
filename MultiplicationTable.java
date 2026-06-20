import java.util.stream.*;

public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 7;

        IntStream.rangeClosed(1, 10)
                .map(i -> i * n)
                .forEach(System.out::println);
    }
}
