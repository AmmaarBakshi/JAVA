import java.util.*;

public class DuplicateWords {

    public static void main(String[] args){

        String text="java ai java code ai";

        Set<String> seen=new HashSet<>();

        Arrays.stream(text.split(" "))
              .filter(w->!seen.add(w))
              .distinct()
              .forEach(System.out::println);
    }
}
