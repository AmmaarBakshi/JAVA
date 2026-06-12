import java.util.stream.*;

public class SophieGermain {

    static boolean prime(long n){

        if(n<2) return false;

        for(long i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(2,1000)
                 .filter(SophieGermain::prime)
                 .filter(n ->
                     prime(2L*n+1)
                 )
                 .forEach(System.out::println);
    }
}
