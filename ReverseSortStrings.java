import java.util.*;

public class ReverseSortStrings {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","api","code");

        words.stream()
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);
    }
}
