import java.util.*;
import java.util.stream.*;

public class GroupStart {

    public static void main(String[] args){

        List<String> list=
            List.of("apple","ant","banana","ball");

        Map<Character,List<String>> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    s->s.charAt(0)
                ));

        System.out.println(map);
    }
}
