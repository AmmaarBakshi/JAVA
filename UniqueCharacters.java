import java.util.stream.*;
import java.util.stream.Collectors;

public class UniqueCharacters {

    public static void main(String[] args){

        String text="programming";

        String result=
            text.chars()
                .distinct()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
