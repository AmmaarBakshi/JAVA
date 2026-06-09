import java.util.stream.*;

public class PalPrime {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(2,10000)
                 .filter(PalPrime::prime)
                 .filter(n ->
                    String.valueOf(n)
                          .equals(
                              new StringBuilder(
                                  String.valueOf(n))
                              .reverse()
                              .toString()
                          )
                 )
                 .forEach(System.out::println);
    }
}
