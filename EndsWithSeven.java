import java.util.stream.*;

public class EndsWithSeven {

    public static void main(String[] args){

        IntStream.rangeClosed(1,100)
                 .filter(n->n%10==7)
                 .forEach(System.out::println);
    }
}
