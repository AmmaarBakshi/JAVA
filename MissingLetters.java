import java.util.stream.*;

public class MissingLetters {

    public static void main(String[] args){

        String s = "abcdefhijkmn";

        IntStream.rangeClosed('a','z')
                 .filter(c -> s.indexOf(c) < 0)
                 .mapToObj(c -> String.valueOf((char)c))
                 .forEach(System.out::println);
    }
}
