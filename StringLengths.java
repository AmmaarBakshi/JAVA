import java.util.*;

public class StringLengths {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","api");

        words.stream()
             .map(String::length)
             .forEach(System.out::println);
    }
}
