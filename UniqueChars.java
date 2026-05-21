import java.util.*;

public class UniqueChars {

    public static void main(String[] args){

        String s="programming";

        s.chars()
         .distinct()
         .mapToObj(c->String.valueOf((char)c))
         .forEach(System.out::println);
    }
}
