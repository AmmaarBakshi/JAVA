import java.util.stream.*;

public class Narcissistic {

    public static void main(String[] args){

        IntStream.rangeClosed(1,10000)
                 .filter(n -> {

                     String s =
                         String.valueOf(n);

                     int p = s.length();

                     int sum =
                         s.chars()
                          .map(c ->
                              (int)Math.pow(
                                  c-'0',
                                  p
                              )
                          )
                          .sum();

                     return sum==n;
                 })
                 .forEach(System.out::println);
    }
}
