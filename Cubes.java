import java.util.stream.IntStream;

public class Cubes {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 20)
                .map(n -> n * n * n)
                .forEach(System.out::println);
    }
}
