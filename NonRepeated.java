import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class NonRepeated {

    public static void main(String[] args){

        String s="swiss";

        Character c =
            s.chars()
             .mapToObj(x->(char)x)
             .collect(Collectors.groupingBy(
                 Function.identity(),
                 LinkedHashMap::new,
                 Collectors.counting()
             ))
             .entrySet()
             .stream()
             .filter(e->e.getValue()==1)
             .map(Map.Entry::getKey)
             .findFirst()
             .orElse(null);

        System.out.println(c);
    }
}
