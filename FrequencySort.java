import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FrequencySort {

    public static void main(String[] args){

        String s="banana";

        String result =
            s.chars()
             .mapToObj(c->(char)c)
             .collect(Collectors.groupingBy(
                 Function.identity(),
                 Collectors.counting()
             ))
             .entrySet()
             .stream()
             .sorted(
                 Map.Entry.<Character,Long>
                 comparingByValue()
                 .reversed()
             )
             .map(e->String.valueOf(e.getKey())
                 .repeat(e.getValue().intValue()))
             .collect(Collectors.joining());

        System.out.println(result);
    }
}
