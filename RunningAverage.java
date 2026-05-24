import java.util.*;
import java.util.concurrent.atomic.*;

public class RunningAverage {

    public static void main(String[] args){

        List<Integer> list=List.of(10,20,30,40);

        AtomicInteger sum=new AtomicInteger();
        AtomicInteger count=new AtomicInteger();

        list.stream()
            .map(n->
                sum.addAndGet(n) /
                (double)count.incrementAndGet()
            )
            .forEach(System.out::println);
    }
}
