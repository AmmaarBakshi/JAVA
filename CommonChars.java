import java.util.*;
import java.util.stream.*;

public class CommonChars {

    public static void main(String[] args){

        String a="programming";
        String b="gaming";

        a.chars()
         .mapToObj(c->(char)c)
         .distinct()
         .filter(c->b.indexOf(c)>=0)
         .forEach(System.out::println);
    }
}
