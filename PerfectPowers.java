import java.util.stream.*;

public class PerfectPowers {

    public static void main(String[] args){

        IntStream.rangeClosed(2,20)
                 .forEach(a ->

                     IntStream.rangeClosed(2,8)
                              .map(b ->
                                  (int)Math.pow(a,b)
                              )
                              .forEach(System.out::println)

                 );
    }
}
