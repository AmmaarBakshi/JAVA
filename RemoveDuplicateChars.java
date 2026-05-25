import java.util.stream.*;

public class RemoveDuplicateChars {

    public static void main(String[] args){

        String s="banana";

        String result =
            s.chars()
             .distinct()
             .mapToObj(c->String.valueOf((char)c))
             .collect(Collectors.joining());

        System.out.println(result);
    }
}
