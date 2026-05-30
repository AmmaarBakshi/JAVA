import java.util.stream.*;

public class PascalRow {

    public static void main(String[] args){

        int n = 5;

        IntStream.rangeClosed(0,n)
                 .mapToObj(i ->
                     factorial(n)/
                     (factorial(i)*
                      factorial(n-i)))
                 .forEach(System.out::println);
    }

    static long factorial(int n){
        return LongStream.rangeClosed(1,n)
                         .reduce(1,(a,b)->a*b);
    }
}
