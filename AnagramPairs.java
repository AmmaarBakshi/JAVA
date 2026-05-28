import java.util.*;
import java.util.stream.*;

public class AnagramPairs {

    static String sort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args){

        List<String> list=
            List.of("eat","tea","bat","tab");

        list.stream()
            .collect(Collectors.groupingBy(
                AnagramPairs::sort
            ))
            .values()
            .stream()
            .filter(g->g.size()>1)
            .forEach(System.out::println);
    }
}
