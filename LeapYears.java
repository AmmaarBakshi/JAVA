import java.util.stream.IntStream;

public class LeapYears {
    public static void main(String[] args) {
        IntStream.rangeClosed(1900, 2100)
                .filter(y -> (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
                .forEach(System.out::println);
    }
}
