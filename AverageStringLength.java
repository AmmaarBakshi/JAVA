import java.util.*;

public class AverageStringLength {

    public static void main(String[] args){

        List<String> words=
            List.of("java","stream","api","code");

        double avg=
            words.stream()
                 .mapToInt(String::length)
                 .average()
                 .orElse(0);

        System.out.println(avg);
    }
}
