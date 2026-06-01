import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Histogram {

    public static void main(String[] args){

        String text =
            "mississippi";

        text.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ))
            .forEach((k,v) ->
                System.out.println(
                    k + " " +
                    "*".repeat(v.intValue())
                )
            );
    }
}
