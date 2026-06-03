import java.util.stream.*;

public class TriangularNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(1,20)
                 .map(n -> n*(n+1)/2)
                 .forEach(System.out::println);
    }
}
