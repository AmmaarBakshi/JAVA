import java.util.stream.*;

public class Emirp {

    static boolean prime(int n){

        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(10,1000)
                 .filter(Emirp::prime)
                 .filter(n ->
                     prime(
                         Integer.parseInt(
                             new StringBuilder(
                                 String.valueOf(n))
                             .reverse()
                             .toString()
                         )
                     )
                 )
                 .limit(20)
                 .forEach(System.out::println);
    }
}
