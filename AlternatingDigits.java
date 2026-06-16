import java.util.stream.*;

public class AlternatingDigits {

    public static void main(String[] args){

        IntStream.rangeClosed(10,1000)
                 .filter(n -> {

                     String s =
                         String.valueOf(n);

                     return IntStream.range(
                             2,s.length())
                         .allMatch(i ->
                             s.charAt(i)
                             == s.charAt(i-2));
                 })
                 .forEach(System.out::println);
    }
}
