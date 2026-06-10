import java.util.stream.*;

public class PrimeDigitSum {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .filter(n ->
                     prime(
                         String.valueOf(n)
                               .chars()
                               .map(c->c-'0')
                               .sum()
                     )
                 )
                 .forEach(System.out::println);
    }
}
