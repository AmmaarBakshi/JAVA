import java.util.*;
import java.util.stream.*;

public class ReverseOrder {

    public static void main(String[] args){

        List<Integer> list=List.of(1,2,3,4,5);

        IntStream.range(0,list.size())
                 .mapToObj(i->list.get(list.size()-1-i))
                 .forEach(System.out::println);
    }
}
