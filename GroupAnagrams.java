import java.util.*;
import java.util.stream.*;

public class GroupAnagrams {

    static String sort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args){

        List<String> list=
            List.of("eat","tea","tan","ate","nat");

        Map<String,List<String>> map =
            list.stream()
                .collect(Collectors.groupingBy(
                    GroupAnagrams::sort
                ));

        System.out.println(map);
    }
}
