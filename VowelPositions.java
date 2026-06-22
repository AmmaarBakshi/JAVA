import java.util.stream.IntStream;

public class VowelPositions {
    public static void main(String[] args) {

        String text = "programming";

        IntStream.range(0, text.length())
                .filter(i -> "aeiou".indexOf(text.charAt(i)) >= 0)
                .forEach(System.out::println);
    }
}
