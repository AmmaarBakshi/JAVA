import java.util.*;
import java.util.concurrent.atomic.*;

public class RunningSum {

    public static void main(String[] args){

        AtomicInteger sum=new AtomicInteger();

        List<Integer> list=List.of(1,2,3,4);

        list.stream()
            .map(sum::addAndGet)
            .forEach(System.out::println);
    }
}
