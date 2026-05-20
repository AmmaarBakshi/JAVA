import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MostFrequent {

    public static void main(String[] args){

        List<String> list=
            List.of("java","ai","java","code","ai","java");

        String result =
            list.stream()
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(result);
    }
}
