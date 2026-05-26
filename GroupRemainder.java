import java.util.*;
import java.util.stream.*;

public class GroupRemainder {

    public static void main(String[] args){

        List<Integer> list=
            List.of(1,2,3,4,5,6,7,8);

        Map<Integer,List<Integer>> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    n->n%3
                ));

        System.out.println(map);
    }
}
