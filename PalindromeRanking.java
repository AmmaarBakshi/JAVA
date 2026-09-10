import java.util.*;
import java.util.stream.*;

public class PalindromeRanking {

    static boolean palindrome(String s) {

        return s.equals(
            new StringBuilder(s)
                .reverse()
                .toString()
        );
    }

    public static void main(String[] args) {

        List<String> words =
            List.of(
                "level",
                "java",
                "madam",
                "racecar",
                "stream",
                "radar"
            );

        words.stream()
             .filter(
                 PalindromeRanking::palindrome
             )
             .sorted(
                 Comparator
                 .comparingInt(
                     String::length
                 )
                 .reversed()
             )
             .forEach(
                 System.out::println
             );
    }
}
