import java.util.stream.*;

public class ArmstrongStream {

    public static void main(String[] args){

        IntStream.rangeClosed(100,999)
                 .filter(n -> {
                     int sum =
                         String.valueOf(n)
                               .chars()
                               .map(c -> {
                                   int d = c-'0';
                                   return d*d*d;
                               })
                               .sum();

                     return sum==n;
                 })
                 .forEach(System.out::println);
    }
}
