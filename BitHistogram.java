import java.util.stream.*;

public class BitHistogram {

    public static void main(String[] args){

        IntStream.rangeClosed(1,100)
                 .boxed()
                 .collect(
                     java.util.stream.Collectors.groupingBy(
                         Integer::bitCount,
                         java.util.stream.Collectors.counting()
                     )
                 )
                 .forEach(System.out::println);
    }
}
