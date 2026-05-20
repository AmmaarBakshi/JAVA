import java.util.*;
import java.util.stream.*;

public class IndexedMap {

    public static void main(String[] args){

        List<String> list=List.of("A","B","C");

        Map<Integer,String> map =
            IntStream.range(0,list.size())
                     .boxed()
                     .collect(Collectors.toMap(
                         i->i,
                         list::get
                     ));

        System.out.println(map);
    }
}
