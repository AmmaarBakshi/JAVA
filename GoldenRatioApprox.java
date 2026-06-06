import java.util.stream.*;

public class GoldenRatioApprox {

    public static void main(String[] args){

        Stream.iterate(
                new long[]{1,1},
                a -> new long[]{
                    a[1],
                    a[0]+a[1]
                }
        )
        .limit(15)
        .forEach(a ->
            System.out.println(
                (double)a[1]/a[0]
            )
        );
    }
}
