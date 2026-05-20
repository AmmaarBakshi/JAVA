import java.util.*;
import java.util.stream.*;

public class MergeDistinct {

    public static void main(String[] args){

        List<Integer> a=List.of(1,2,3);
        List<Integer> b=List.of(3,4,5);

        Stream.concat(a.stream(),b.stream())
              .distinct()
              .forEach(System.out::println);
    }
}
