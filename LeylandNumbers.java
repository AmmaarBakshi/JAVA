import java.util.stream.*;

public class LeylandNumbers {

    public static void main(String[] args){

        IntStream.rangeClosed(2,10)
                 .forEach(x ->

                     IntStream.rangeClosed(2,10)
                              .forEach(y ->

                                  System.out.println(
                                      (long)Math.pow(x,y)
                                      +
                                      (long)Math.pow(y,x)
                                  )

                              )

                 );
    }
}
