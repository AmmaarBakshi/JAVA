import java.util.*;
import java.util.stream.*;

public class SelfNumbers {

    static int d(int n){

        return n +
            String.valueOf(n)
                  .chars()
                  .map(c->c-'0')
                  .sum();
    }

    public static void main(String[] args){

        Set<Integer> generated =
            IntStream.rangeClosed(1,100)
                     .map(SelfNumbers::d)
                     .boxed()
                     .collect(
                        java.util.stream.Collectors.toSet()
                     );

        IntStream.rangeClosed(1,100)
                 .filter(n ->
                     !generated.contains(n))
                 .forEach(System.out::println);
    }
}
