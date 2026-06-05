import java.util.stream.*;

public class SternBrocot {

    public static void main(String[] args){

        IntStream.rangeClosed(1,20)
                 .forEach(n ->
                     System.out.println(
                         n+"/"+(n+1)
                     )
                 );
    }
}
