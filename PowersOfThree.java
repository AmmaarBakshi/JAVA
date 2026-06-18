PowersOfThree.java
import java.util.stream.Stream;

public class PowersOfThree {

    public static void main(String[] args) {

        Stream.iterate(1L, n -> n * 3)
              .limit(15)
              .forEach(System.out::println);
    }
}
