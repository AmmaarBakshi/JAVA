import java.util.stream.*;

public class Persistence {

    static int persistence(long n){

        int count=0;

        while(n>=10){

            n =
                String.valueOf(n)
                      .chars()
                      .map(c -> c-'0')
                      .reduce(1,(a,b)->a*b);

            count++;
        }

        return count;
    }

    public static void main(String[] args){

        IntStream.rangeClosed(1,500)
                 .boxed()
                 .sorted((a,b) ->
                     persistence(b)
                     - persistence(a))
                 .limit(20)
                 .forEach(System.out::println);
    }
}
