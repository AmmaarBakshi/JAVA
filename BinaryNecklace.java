import java.util.stream.*;

public class BinaryNecklace {

    public static void main(String[] args){

        IntStream.range(0,32)
                 .mapToObj(n ->
                     String.format("%5s",
                         Integer.toBinaryString(n))
                         .replace(' ','0'))
                 .distinct()
                 .forEach(System.out::println);
    }
}
