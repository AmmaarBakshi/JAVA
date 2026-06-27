import java.util.*;

public class FirstPalindrome {

    public static void main(String[] args){

        List<String> words=
            List.of("java","level","stream","madam");

        String result=
            words.stream()
                 .filter(s->
                     s.equals(
                         new StringBuilder(s)
                         .reverse()
                         .toString()
                     )
                 )
                 .findFirst()
                 .orElse("Not Found");

        System.out.println(result);
    }
}
