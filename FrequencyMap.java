import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FrequencyMap {

    public static void main(String[] args){

        List<String> list=
            List.of("a","b","a","c","a");

        Map<String,Long> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));

        System.out.println(map);
    }
}
