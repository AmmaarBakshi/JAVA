import java.util.stream.*;

public class BinaryReflect {

    public static void main(String[] args){

        IntStream.range(0,32)
                 .map(n->n^(n>>1))
                 .mapToObj(Integer::toBinaryString)
                 .forEach(System.out::println);
    }
}
