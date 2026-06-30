import java.util.*;

public class AllLengthGreater {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","code");

        boolean result=
            words.stream()
                 .allMatch(w->w.length()>3);

        System.out.println(result);
    }
}
