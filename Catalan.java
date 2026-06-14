import java.util.stream.*;

public class Catalan {

    static long fact(long n){

        return LongStream.rangeClosed(1,n)
                         .reduce(1,
                             (a,b)->a*b);
    }

    public static void main(String[] args){

        IntStream.rangeClosed(0,15)
                 .mapToLong(n ->

                     fact(2*n) /
                     (
                       fact(n+1)
                       * fact(n)
                     )

                 )
                 .forEach(System.out::println);
    }
}
