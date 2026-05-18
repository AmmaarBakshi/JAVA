import java.util.*;
import java.util.stream.*;

public class Pagination {

    public static void main(String[] args){

        List<Integer> list =
            IntStream.rangeClosed(1,100)
                     .boxed()
                     .toList();

        int page=2;
        int size=10;

        list.stream()
            .skip((page-1)*size)
            .limit(size)
            .forEach(System.out::println);
    }
}
