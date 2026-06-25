import java.util.*;
import java.util.stream.*;

public class FindAnagrams {

    static String sort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args){

        String target="listen";

        List<String> words=
            List.of("silent","hello","enlist","world","tinsel");

        words.stream()
             .filter(w->sort(w).equals(sort(target)))
             .forEach(System.out::println);
    }
}
