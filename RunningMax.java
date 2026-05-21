import java.util.*;
import java.util.concurrent.atomic.*;

public class RunningMax {

    public static void main(String[] args){

        AtomicInteger max=new AtomicInteger(Integer.MIN_VALUE);

        List<Integer> list=List.of(3,7,2,9,5);

        list.stream()
            .map(n->Math.max(max.get(),n))
            .peek(max::set)
            .forEach(System.out::println);
    }
}
