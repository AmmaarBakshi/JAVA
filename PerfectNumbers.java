import java.util.stream.*;

public class PerfectNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(2,10000)
                 .filter(n ->

                     IntStream.range(1,n)
                              .filter(d -> n%d==0)
                              .sum() == n

                 )
                 .forEach(System.out::println);
    }
}
