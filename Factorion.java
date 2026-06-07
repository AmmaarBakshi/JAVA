import java.util.stream.*;

public class Factorion {

    static int fact(int n){

        return IntStream.rangeClosed(1,n)
                        .reduce(1,(a,b)->a*b);
    }

    public static void main(String[] args){

        IntStream.rangeClosed(10,50000)
                 .filter(n ->

                     String.valueOf(n)
                           .chars()
                           .map(c ->
                               fact(c-'0'))
                           .sum() == n

                 )
                 .forEach(System.out::println);
    }
}
