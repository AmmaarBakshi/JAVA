import java.util.stream.*;

public class Emirpimes {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(10,5000)
                 .filter(Emirpimes::prime)
                 .filter(n -> {

                     int rev =
                         Integer.parseInt(
                             new StringBuilder(
                                 String.valueOf(n))
                             .reverse()
                             .toString()
                         );

                     return rev!=n
                            && prime(rev);
                 })
                 .forEach(System.out::println);
    }
}
