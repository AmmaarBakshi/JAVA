import java.util.stream.*;

public class CollatzStream {

    public static void main(String[] args){

        Stream.iterate(
                27L,
                n -> n > 1,
                n -> n % 2 == 0 ? n / 2 : 3 * n + 1
        ).forEach(System.out::println);

        System.out.println(1);
    }
}
