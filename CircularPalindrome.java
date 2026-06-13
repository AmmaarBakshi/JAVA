import java.util.stream.*;

public class CircularPalindrome {

    static boolean circular(String s){

        for(int i=0;i<s.length();i++){

            String r =
                s.substring(i)
                + s.substring(0,i);

            if(r.equals(
                new StringBuilder(r)
                .reverse()
                .toString()))
                return true;
        }

        return false;
    }

    public static void main(String[] args){

        Stream.of(
            "aab",
            "abc",
            "racecar"
        )
        .filter(CircularPalindrome::circular)
        .forEach(System.out::println);
    }
}
