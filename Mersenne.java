import java.util.stream.*;

public class Mersenne {

    public static void main(String[] args){

        IntStream.rangeClosed(1,20)
                 .map(n -> (1 << n) - 1)
                 .forEach(System.out::println);
    }
}
