import java.util.*;

public class LargestString {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","zebra","apple");

        String result=
            words.stream()
                 .max(String::compareTo)
                 .orElse("");

        System.out.println(result);
    }
}
