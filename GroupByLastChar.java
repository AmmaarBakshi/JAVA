import java.util.*;
import java.util.stream.Collectors;

public class GroupByLastChar {

    public static void main(String[] args) {

        List<String> words =
                List.of("apple","table","banana","camera");

        Map<Character,List<String>> map =
                words.stream()
                     .collect(Collectors.groupingBy(
                             s -> s.charAt(s.length()-1)
                     ));

        System.out.println(map);
    }
}
