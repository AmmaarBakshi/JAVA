import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class LookSayStats {

    static String next(String s){

        StringBuilder out =
            new StringBuilder();

        for(int i=0;i<s.length();){

            int j=i;

            while(j<s.length()
                  && s.charAt(j)==s.charAt(i))
                j++;

            out.append(j-i)
               .append(s.charAt(i));

            i=j;
        }

        return out.toString();
    }

    public static void main(String[] args){

        String seq="1";

        for(int i=0;i<10;i++)
            seq=next(seq);

        seq.chars()
           .mapToObj(c->(char)c)
           .collect(
               java.util.stream.Collectors
               .groupingBy(
                   Function.identity(),
                   java.util.stream.Collectors.counting()
               )
           )
           .forEach(System.out::println);
    }
}
