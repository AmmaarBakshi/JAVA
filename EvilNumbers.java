import java.util.stream.*;

public class EvilNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(1,200)
                 .filter(n ->
                     Integer.bitCount(n)%2==0
                 )
                 .forEach(System.out::println);
    }
}
