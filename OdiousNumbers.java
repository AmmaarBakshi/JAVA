import java.util.stream.*;

public class OdiousNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(1,200)
                 .filter(n ->
                     Integer.bitCount(n)%2==1
                 )
                 .forEach(System.out::println);
    }
}
