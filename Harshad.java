import java.util.stream.*;

public class Harshad {

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .filter(n -> {

                     int sum =
                         String.valueOf(n)
                               .chars()
                               .map(c->c-'0')
                               .sum();

                     return n%sum==0;
                 })
                 .forEach(System.out::println);
    }
}
