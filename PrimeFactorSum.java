import java.util.stream.*;

public class PrimeFactorSum {

    static int factorSum(int n){

        return IntStream.rangeClosed(2,n)
                .filter(i ->
                    n%i==0 &&
                    IntStream.range(2,i)
                             .noneMatch(x ->
                                 i%x==0))
                .sum();
    }

    public static void main(String[] args){

        IntStream.rangeClosed(2,1000)
                 .filter(n ->
                     factorSum(n)==n)
                 .forEach(System.out::println);
    }
}
