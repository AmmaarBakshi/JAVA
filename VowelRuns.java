import java.util.regex.*;
import java.util.stream.*;

public class VowelRuns {

    public static void main(String[] args){

        String s =
            "beautifulqueueing";

        Matcher m =
            Pattern.compile("[aeiou]+")
                   .matcher(s);

        Stream.generate(() -> m.find() ? m.group() : null)
              .takeWhile(x -> x != null)
              .forEach(System.out::println);
    }
}
