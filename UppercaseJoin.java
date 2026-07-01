import java.util.*;
import java.util.stream.*;

public class UppercaseJoin {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","api");

        String result=
            words.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
