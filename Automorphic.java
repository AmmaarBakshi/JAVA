import java.util.stream.*;

public class Automorphic {

    public static void main(String[] args){

        IntStream.rangeClosed(1,1000)
                 .filter(n ->

                     String.valueOf(
                         n*n
                     ).endsWith(
                         String.valueOf(n)
                     )

                 )
                 .forEach(System.out::println);
    }
}
