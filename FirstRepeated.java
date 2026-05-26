import java.util.*;
import java.util.stream.*;

public class FirstRepeated {

    public static void main(String[] args){

        String s="programming";

        Set<Character> seen=new HashSet<>();

        Character c =
            s.chars()
             .mapToObj(x->(char)x)
             .filter(ch->!seen.add(ch))
             .findFirst()
             .orElse(null);

        System.out.println(c);
    }
}
