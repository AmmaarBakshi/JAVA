import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TopWords {

    public static void main(String[] args){

        String text="java code java ai code java";

        Arrays.stream(text.split(" "))
              .collect(Collectors.groupingBy(
                  Function.identity(),
                  Collectors.counting()
              ))
              .entrySet()
              .stream()
              .sorted(Map.Entry.<String,Long>
                      comparingByValue()
                      .reversed())
              .forEach(System.out::println);
    }
}
