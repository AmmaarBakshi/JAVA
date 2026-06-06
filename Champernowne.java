import java.util.stream.*;

public class Champernowne {

    public static void main(String[] args){

        IntStream.iterate(1,n->n+1)
                 .mapToObj(String::valueOf)
                 .limit(100)
                 .forEach(System.out::print);
    }
}
