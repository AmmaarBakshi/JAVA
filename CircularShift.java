import java.util.*;

public class CircularShift {

    public static void main(String[] args){

        List<String> words =
                List.of("abc","bca","cab","xyz");

        words.stream()
             .filter(s -> (s+s).contains("abc"))
             .forEach(System.out::println);
    }
}
