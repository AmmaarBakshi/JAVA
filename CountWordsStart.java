import java.util.*;

public class CountWordsStart {

    public static void main(String[] args){

        List<String> words=
            List.of("java","jvm","stream",
                    "json","code");

        long count=
            words.stream()
                 .filter(w->w.startsWith("j"))
                 .count();

        System.out.println(count);
    }
}
