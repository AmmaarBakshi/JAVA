import java.util.stream.*;

public class PellNumbers {

    public static void main(String[] args){

        Stream.iterate(
                new long[]{0,1},
                a -> new long[]{
                    a[1],
                    2*a[1] + a[0]
                }
        )
        .limit(20)
        .map(a -> a[0])
        .forEach(System.out::println);
    }
}
