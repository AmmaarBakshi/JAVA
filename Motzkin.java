import java.util.stream.*;

public class Motzkin {

    public static void main(String[] args){

        long[] m =
            new long[15];

        m[0]=1;
        m[1]=1;

        IntStream.range(2,15)
                 .forEach(n -> {

                     long sum=0;

                     for(int k=0;k<n-1;k++)
                         sum +=
                             m[k]
                             * m[n-2-k];

                     m[n] =
                         ((2L*n+1)
                         * m[n-1]
                         + 3*sum)
                         /(n+2);
                 });

        LongStream.of(m)
                  .forEach(System.out::println);
    }
}
