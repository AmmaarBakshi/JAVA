import java.util.*;

public class ShortestWord {
    public static void main(String[] args) {

        List<String> words =
                List.of("stream", "java", "ai", "powerful");

        String shortest =
                words.stream()
                        .min(Comparator.comparingInt(String::length))
                        .orElse("");

        System.out.println(shortest);
    }
}
