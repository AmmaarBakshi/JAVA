import java.util.stream.*;

public class FibonacciPrimes {

    static boolean prime(long n){

        if(n < 2) return false;

        for(long i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        Stream.iterate(
                new long[]{0,1},
                a -> new long[]{
                    a[1],
                    a[0]+a[1]
                }
        )
        .map(a -> a[0])
        .filter(FibonacciPrimes::prime)
        .limit(15)
        .forEach(System.out::println);
    }
}
