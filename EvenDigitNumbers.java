import java.util.stream.*;

public class EvenDigitNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .filter(n->
                     String.valueOf(n)
                           .chars()
                           .allMatch(c->
                               (c-'0')%2==0
                           )
                 )
                 .forEach(System.out::println);
    }
}
